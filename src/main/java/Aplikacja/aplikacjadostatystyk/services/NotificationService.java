package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Team;
import Aplikacja.aplikacjadostatystyk.Entity.Users;
import Aplikacja.aplikacjadostatystyk.football_api_controller.TeamControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import Aplikacja.aplikacjadostatystyk.repository.TeamRepository;
import Aplikacja.aplikacjadostatystyk.repository.UserRepository;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;


@Service
public class NotificationService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private TeamControllerApi teamController;

    private final String SENDGRID_KEY = "{sendgrid_api_key}";

    @Scheduled(cron = "0 * 8-22 * * ?")
    public void getMatchesForFavoriteTeamAndSendEmail(){
        Map<Integer, List<Integer>> mapOfUsersAndTeams = getUsersFavoriteTeams();
        for (Map.Entry<Integer, List<Integer>> entry : mapOfUsersAndTeams.entrySet()) {
            Integer userId = entry.getKey();
            List<Integer> teamIds = entry.getValue();
            for(Integer teamId : teamIds){
                Users user = userRepository.findById(userId).get();
                sendNotificationEmail(teamId, user);
            }
        }
    }

    public Map<Integer, List<Integer>> getUsersFavoriteTeams() {
        Iterable<Users> usersGet = userRepository.findAll();
        List<Users> usersList = new ArrayList<>();
        usersGet.forEach(usersList::add);
        Iterable<Team> userTeams = teamRepository.findAll();
        List<Integer> teamsList = new ArrayList<>();
        userTeams.forEach(teams -> teamsList.add(teams.getTeamId()));
        Map<Integer, List<Integer>> usersFavoriteTeams = new HashMap<>();
        for (int i = 0; i < usersList.size(); i++) {
            for (Users user : usersList) {
                for (Team team : userTeams) {
                    if (team.getUserId() == user.getId()) {
                        usersFavoriteTeams.put(user.getId(), teamsList);
                    }
                }
            }
        }
        return usersFavoriteTeams;
    }

    public void sendNotificationEmail(int id, Users user) {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateWeekAhead = dateNow.plusDays(7);
        Matches matches = teamController.getMatchesForTeam(id, dateNow.toString(), dateWeekAhead.toString());
        for (Match match : matches.getMatches()) {
            String date = match.getDate();
            Instant formattedDate = Instant.parse(date);
            Instant now = Instant.now();
            Instant nowMinus30minutes = now.minus(30, ChronoUnit.MINUTES);
            String favoriteTeam = match.getHomeTeam().getId() == id ? match.getHomeTeam().getName() : match.getAwayTeam().getName();
            String otherTeam = match.getHomeTeam().getId() != id ? match.getHomeTeam().getName() : match.getAwayTeam().getName();
            if (formattedDate.isAfter(now) && formattedDate.isBefore(nowMinus30minutes)) {
                String content = String.format("""
                        Hello, %s
                        Your favorite team - %s starts match with %s in 30 minutes at %s.
                        Don't miss it!
                        """, user.getName(), favoriteTeam, otherTeam, getFormattedDate(match.getDate()));
                sendEmail("damian.kijowski01@gmail.com", content, "Match today");
            } else if (match.getStatus().equalsIgnoreCase("FINISHED")) {
                String content = String.format("""
                        Hello, %s
                        Your favorite team - %s finished match with %s.
                        Score was: %s %s : %s %s.
                        Hope you enjoyed it!
                        """, user.getName(), favoriteTeam, otherTeam, match.getHomeTeam().getName(),
                        match.getScore().getFullTime().getHome(), match.getScore().getFullTime().getAway(),
                        match.getAwayTeam().getName(), getFormattedDate(match.getDate()));
                sendEmail("damian.kijowski01@gmail.com", content, "Match today");
            }
        }
    }

    public String getFormattedDate(String date){
        Instant instant = Instant.parse(date);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Warsaw"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        return zonedDateTime.format(formatter);
    }

    public void sendEmail(String email, String content, String subject) {
        Email from = new Email("envis@o2.pl");
        Email to = new Email(email);
        Content emailContent = new Content("text/plain", content);
        Request request = new Request();
        Mail mail = new Mail(from, subject, to, emailContent);

        SendGrid sg = new SendGrid(SENDGRID_KEY);

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);
            System.out.println("Response body: " + response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

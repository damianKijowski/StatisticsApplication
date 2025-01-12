package Aplikacja.aplikacjadostatystyk.football_api_entity;


import Aplikacja.aplikacjadostatystyk.Entity.Comment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    private int id;
    private String status;
    @JsonProperty("utcDate")
    private String date;
    private String minute;
    private String injuryTime;
    private String attendance;
    private String matchDay;
    private ApiTeam homeTeam;
    private ApiTeam awayTeam;
    private List<Goals> goals;
    private Score score;
    private List<Bookings> bookings;
    private List<Substitutions> substitutions;
    private List<Referees> referees;
    private CompetitionName competition;

    public Match(int id, String status, String date, String minute, String injuryTime, String attendance, String matchDay, ApiTeam homeTeam, ApiTeam awayTeam,
                 List<Goals> goals, Score score, List<Bookings> bookings,
                 List<Substitutions> substitutions, List<Referees> referees, CompetitionName competition) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.minute = minute;
        this.injuryTime = injuryTime;
        this.attendance = attendance;
        this.matchDay = matchDay;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
        this.score = score;
        this.bookings = bookings;
        this.substitutions = substitutions;
        this.referees = referees;
        this.competition = competition;
    }

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(String injuryTime) {
        this.injuryTime = injuryTime;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(String matchDay) {
        this.matchDay = matchDay;
    }

    public ApiTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(ApiTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public ApiTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(ApiTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<Goals> getGoals() {
        return goals;
    }

    public void setGoals(List<Goals> goals) {
        this.goals = goals;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public List<Bookings> getBookings() {
        return bookings;
    }

    public void setBookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }

    public List<Substitutions> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<Substitutions> substitutions) {
        this.substitutions = substitutions;
    }

    public List<Referees> getReferees() {
        return referees;
    }

    public void setReferees(List<Referees> referees) {
        this.referees = referees;
    }

    public CompetitionName getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionName competition) {
        this.competition = competition;
    }
}

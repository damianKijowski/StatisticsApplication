package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Team;
import Aplikacja.aplikacjadostatystyk.football_api_controller.TeamControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
import Aplikacja.aplikacjadostatystyk.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamControllerApi teamControllerApi;

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<ApiTeam> getTeams(int userId) {
        List<Team> teams = teamRepository.findByUserId(userId);
        List<ApiTeam> apiTeams = new ArrayList<>();
        for (Team team : teams) {
            apiTeams.add(teamControllerApi.getTeam(team.getTeamId()));
        }
        return apiTeams;
    }
}

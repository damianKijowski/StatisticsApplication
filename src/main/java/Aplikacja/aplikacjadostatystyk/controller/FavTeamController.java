package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.Entity.Team;
import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
import Aplikacja.aplikacjadostatystyk.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favTeam")
public class FavTeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @GetMapping("/{userId}")
    public List<ApiTeam> getTeams(@PathVariable int userId) {
        return teamService.getTeams(userId);
    }
}

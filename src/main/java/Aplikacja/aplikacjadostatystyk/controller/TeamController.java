package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.TeamControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamControllerApi teamControllerApi;

    @GetMapping("/{id}")
    public ApiTeam getTeam(@PathVariable int id) {
        return teamControllerApi.getTeam(id);
    }

    @GetMapping("/matches/{id}/dateFrom={dateFrom}/dateTo={dateTo}")
    public Matches getMatchesForTeam(@PathVariable int id, @PathVariable String dateFrom, @PathVariable String dateTo) {
        return teamControllerApi.getMatchesForTeam(id, dateFrom, dateTo);
    }
}

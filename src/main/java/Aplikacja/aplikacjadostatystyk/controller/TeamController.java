package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.TeamControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
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
}

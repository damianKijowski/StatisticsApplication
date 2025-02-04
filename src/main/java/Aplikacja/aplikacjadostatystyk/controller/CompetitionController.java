package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/competition")
@RestController
public class CompetitionController {
    @Autowired
    private CompetitionControllerApi competitionControllerApi;

    @GetMapping
    public List <Competition> getAllCompetitions() {
        return competitionControllerApi.getAllCompetitions().getCompetitions();
    }
    @GetMapping("/{competitionId}/standings")
    public Standings getCompetitionStandings(@PathVariable String competitionId) {
        return competitionControllerApi.getCompetitionStandings(competitionId);
    }
}

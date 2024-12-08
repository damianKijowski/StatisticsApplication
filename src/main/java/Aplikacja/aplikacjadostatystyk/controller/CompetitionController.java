package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Competition;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Competitions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/competition")
@CrossOrigin
@RestController
public class CompetitionController {
    @Autowired
    private CompetitionControllerApi competitionControllerApi;

    @GetMapping
    public List <Competition> getAllCompetitions() {
        return competitionControllerApi.getAllCompetitions().getCompetitions();
    }
}

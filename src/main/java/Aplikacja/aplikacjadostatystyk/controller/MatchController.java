package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import Aplikacja.aplikacjadostatystyk.services.CompetitionMatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private CompetitionMatchesService competitionMatchesService;

    @GetMapping("/{competitionId}/dateFrom={dateFrom}/dateTo={dateTo}")
    public Match getCompetitionMatches(@PathVariable String competitionId, @PathVariable String dateFrom, @PathVariable String dateTo) {
        return competitionMatchesService.getCompetitionMatches(competitionId, dateFrom, dateTo);
    }
}
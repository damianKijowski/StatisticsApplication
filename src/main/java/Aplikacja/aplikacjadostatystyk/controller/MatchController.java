package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionMatchesControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private CompetitionMatchesControllerApi competitionMatchesService;

    @GetMapping("/dateFrom={dateFrom}/dateTo={dateTo}")
    public Match getCompetitionMatches(@PathVariable String dateFrom, @PathVariable String dateTo) {
        return competitionMatchesService.getMatches(dateFrom, dateTo);
    }
    @GetMapping("/{id}")
    public Matches getCompetitionMatch(@PathVariable String id) {
        return competitionMatchesService.getCompetitionMatch(id);
    }
    @GetMapping("/{league}/dateFrom={dateFrom}/dateTo={dateTo}")
    public Match getCompetitionMatches(@PathVariable String league, @PathVariable String dateFrom, @PathVariable String dateTo) {
        return competitionMatchesService.getCompetitionMatches(league, dateFrom, dateTo);
    }
}

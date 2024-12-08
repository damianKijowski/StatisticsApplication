package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionMatchesControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private CompetitionMatchesControllerApi competitionMatchesService;

    @GetMapping("/{competitionId}/dateFrom={dateFrom}/dateTo={dateTo}")
    public Match getCompetitionMatches(@PathVariable String competitionId, @PathVariable String dateFrom, @PathVariable String dateTo) {
        return competitionMatchesService.getCompetitionMatches(competitionId, dateFrom, dateTo);
    }
}

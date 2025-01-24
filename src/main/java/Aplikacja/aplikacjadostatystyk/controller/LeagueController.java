package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.Entity.League;
import Aplikacja.aplikacjadostatystyk.services.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/league")
public class LeagueController {
    @Autowired
    private LeagueService leagueService;

    @PostMapping("/addLeague/{userId}/{leagueId}")
    public League addLeague(@PathVariable int userId, @PathVariable int leagueId) throws Exception {
        return leagueService.addLeague(userId, leagueId);
    }

    @DeleteMapping("/{userId}/{leagueId}")
    public void removeLeague(@PathVariable int userId, @PathVariable int leagueId) throws Exception {
        leagueService.removeLeague(userId, leagueId);
    }

    @GetMapping("/{userId}")
    public List<League> getAllLeagues(@PathVariable int userId) throws Exception {
        return leagueService.getAll(userId);
    }
}

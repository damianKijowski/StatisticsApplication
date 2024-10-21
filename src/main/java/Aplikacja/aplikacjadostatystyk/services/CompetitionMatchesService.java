package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.football_api_controller.CompetitionMatchesControllerApi;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionMatchesService {

    @Autowired
    private CompetitionMatchesControllerApi competitionMatchesControllerApi;

    public Match getCompetitionMatches(String competitionId, String dateFrom, String dateTo) {
        return competitionMatchesControllerApi.getCompetitionMatches(competitionId,dateFrom,dateTo).getBody();
    }
}

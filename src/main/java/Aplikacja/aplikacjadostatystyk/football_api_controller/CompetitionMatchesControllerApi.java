package Aplikacja.aplikacjadostatystyk.football_api_controller;


import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CompetitionMatchesControllerApi {

    private String url = "https://api.football-data.org/v4/competitions";


    public Match getCompetitionMatches(String competitionId, String dateFrom, String dateTo) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Match> response = new RestTemplate().exchange(url + "/{competitionId}/matches?dateFrom={dateFrom}&dateTo={dateTo}", HttpMethod.GET,
                entity, Match.class, competitionId, dateFrom, dateTo);

        return response.getBody();
    }
}

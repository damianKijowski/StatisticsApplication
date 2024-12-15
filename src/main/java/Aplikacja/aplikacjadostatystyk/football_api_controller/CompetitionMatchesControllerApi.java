package Aplikacja.aplikacjadostatystyk.football_api_controller;


import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompetitionMatchesControllerApi {

    private String url = "https://api.football-data.org/v4/competitions";
    private String url2 = "https://api.football-data.org/v4/matches";


    public Match getMatches(String dateFrom, String dateTo) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Match> response = new RestTemplate().exchange(url2+ "?dateFrom={dateFrom}&dateTo={dateTo}", HttpMethod.GET,
                entity, Match.class, dateFrom, dateTo);

        return response.getBody();
    }

    public Match getCompetitionMatches(String league, String dateFrom, String dateTo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Match> response = new RestTemplate().exchange(url + "/{league}" + "/matches?dateFrom={dateFrom}&dateTo={dateTo}", HttpMethod.GET,
                entity, Match.class, league, dateFrom, dateTo);
        System.out.println(response.getBody());
        return response.getBody();
    }

    public Matches getCompetitionMatch(String matchId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Matches> response = new RestTemplate().exchange(url2 + "/{matchId}", HttpMethod.GET,
                entity, Matches.class, matchId);

        return response.getBody();
    }
}

package Aplikacja.aplikacjadostatystyk.football_api_controller;


import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
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


    public Matches getMatches(String dateFrom, String dateTo) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Matches> response = new RestTemplate().exchange(url2+ "?dateFrom={dateFrom}&dateTo={dateTo}", HttpMethod.GET,
                entity, Matches.class, dateFrom, dateTo);

        return response.getBody();
    }

    public Matches getCompetitionMatches(String league, String dateFrom, String dateTo){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Matches> response = new RestTemplate().exchange(url + "/{league}" + "/matches?dateFrom={dateFrom}&dateTo={dateTo}", HttpMethod.GET,
                entity, Matches.class, league, dateFrom, dateTo);
        return response.getBody();
    }

    public Match getCompetitionMatch(String matchId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Match> response = new RestTemplate().exchange(url2 + "/{matchId}", HttpMethod.GET,
                entity, Match.class, matchId);

        return response.getBody();
    }
}

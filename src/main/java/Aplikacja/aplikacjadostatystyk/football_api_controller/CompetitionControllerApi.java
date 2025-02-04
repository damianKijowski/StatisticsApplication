package Aplikacja.aplikacjadostatystyk.football_api_controller;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Competition;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Competitions;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Standings;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Table;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CompetitionControllerApi {

    private String url = "http://api.football-data.org/v4/competitions";

    @GetMapping("/{code}")
    public ResponseEntity<Competition> getCompetition(@PathVariable String code) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Competition> response = new RestTemplate().exchange(url+"/{code}", HttpMethod.GET, entity, Competition.class, code);
        return response;
    }


    public Competitions getAllCompetitions() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Competitions> response = new RestTemplate().exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<Competitions>() {
        });
        return response.getBody();
    }

    public Standings getCompetitionStandings(String competitionId) {
        HttpHeaders headers = new HttpHeaders();
        System.out.println("ID: " + competitionId);
        headers.add("X-Auth-Token", "{Api_Key}");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Standings> response = new RestTemplate().exchange(url + "/{competitionId}/standings?season=2024", HttpMethod.GET,
                entity, new ParameterizedTypeReference<Standings>(){}, competitionId);
        System.out.println("Response: " + response.getBody());
        return response.getBody();
    }
}

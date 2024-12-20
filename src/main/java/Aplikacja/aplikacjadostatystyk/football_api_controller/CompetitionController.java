package Aplikacja.aplikacjadostatystyk.football_api_controller;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Competition;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Team;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/competition")
public class CompetitionController {

    private String url = "https://api.football-data.org/v4/competitions";

    @GetMapping("/{code}")
    public ResponseEntity<Competition> getCompetition(@PathVariable String code) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Competition> response = new RestTemplate().exchange(url+"/{code}", HttpMethod.GET, entity, Competition.class, code);
        return response;
    }
}

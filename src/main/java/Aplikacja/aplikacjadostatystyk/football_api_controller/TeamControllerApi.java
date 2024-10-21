package Aplikacja.aplikacjadostatystyk.football_api_controller;

import Aplikacja.aplikacjadostatystyk.football_api_entity.ApiTeam;
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

@Service
public class TeamControllerApi {

    private String url = "https://api.football-data.org/v4/teams";


    public ApiTeam getTeam(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "b2aed4a14e5f46aeb60b344c119deab4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<ApiTeam> response = new RestTemplate().exchange(url+"/{id}", HttpMethod.GET, entity, ApiTeam.class, id);
        return response.getBody();
    }


}

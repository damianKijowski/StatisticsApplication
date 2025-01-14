package Aplikacja.aplikacjadostatystyk.football_api_entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Standings {
    private List<StandingsData> standings;

    public Standings(List<StandingsData> standings) {
        this.standings = standings;
    }

    public Standings() {
    }

    public List<StandingsData> getStandings() {
        return standings;
    }

    public void setStandings(List<StandingsData> standings) {
        this.standings = standings;
    }
}

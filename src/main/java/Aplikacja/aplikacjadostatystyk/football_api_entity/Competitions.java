package Aplikacja.aplikacjadostatystyk.football_api_entity;

import java.util.List;

public class Competitions {
    private List<Competition> competitions;

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public Competitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public Competitions() {
    }
}

package Aplikacja.aplikacjadostatystyk.football_api_entity;

import java.util.List;

public class Match {
    private List<Matches> matches;

    public Match(List<Matches> matches) {
        this.matches = matches;
    }

    public Match() {
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }
}

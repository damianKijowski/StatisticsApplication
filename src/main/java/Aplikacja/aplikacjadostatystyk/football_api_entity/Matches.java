package Aplikacja.aplikacjadostatystyk.football_api_entity;

import java.util.List;

public class Matches {
    private List<Match> matches;

    public Matches(List<Match> matches) {
        this.matches = matches;
    }

    public Matches() {
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}

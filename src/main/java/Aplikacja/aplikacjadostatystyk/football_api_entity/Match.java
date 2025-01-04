package Aplikacja.aplikacjadostatystyk.football_api_entity;


import Aplikacja.aplikacjadostatystyk.Entity.Comment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    private int id;
    private String status;
    @JsonProperty("utcDate")
    private String date;
    private ApiTeam homeTeam;
    private ApiTeam awayTeam;
    private Score score;
    private CompetitionName competition;

    public List<Comment> getMatchComments() {
        return matchComments;
    }

    public void setMatchComments(List<Comment> matchComments) {
        this.matchComments = matchComments;
    }

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    private List<Comment> matchComments;

    public Match(int id, String status, String date, ApiTeam homeTeam, Score score, ApiTeam awayTeam, CompetitionName competition, List<Comment> matchComments) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.homeTeam = homeTeam;
        this.score = score;
        this.awayTeam = awayTeam;
        this.competition = competition;
        this.matchComments = matchComments;
    }

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CompetitionName getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionName competition) {
        this.competition = competition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ApiTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(ApiTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public ApiTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(ApiTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}

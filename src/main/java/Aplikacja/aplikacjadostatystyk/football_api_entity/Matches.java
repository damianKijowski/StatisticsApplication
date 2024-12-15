package Aplikacja.aplikacjadostatystyk.football_api_entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Matches {
    private int id;
    private String status;
    @JsonProperty("utcDate")
    private String date;
    private ApiTeam homeTeam;
    private ApiTeam awayTeam;
    private Score score;
    private CompetitionName competition;

    public Matches(int id, String status, String date, ApiTeam homeTeam, Score score, ApiTeam awayTeam, CompetitionName competition) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.homeTeam = homeTeam;
        this.score = score;
        this.awayTeam = awayTeam;
        this.competition = competition;
    }

    public Matches() {
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

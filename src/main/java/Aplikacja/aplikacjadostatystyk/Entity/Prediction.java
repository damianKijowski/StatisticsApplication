package Aplikacja.aplikacjadostatystyk.Entity;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import jakarta.persistence.*;

@Entity
public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int prediction;
    @Transient
    private Match match;
    private int matchId;
    @Transient
    private int result;
    private int userId;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }



    public Prediction(int id, int prediction, Match match, int result, int userId) {
        this.id = id;
        this.prediction = prediction;
        this.match = match;
        this.matchId = match.getId();
        this.result = result;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Prediction() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPrediction() {
        return prediction;
    }

    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

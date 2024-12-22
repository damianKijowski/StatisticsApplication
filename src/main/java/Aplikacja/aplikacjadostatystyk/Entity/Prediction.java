package Aplikacja.aplikacjadostatystyk.Entity;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import jakarta.persistence.*;

@Entity
public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int prediction;
    @Transient
    private Matches match;
    private int matchId;
    @Transient
    private int result;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }



    public Prediction(int id, int prediction, Matches match, int result) {
        this.id = id;
        this.prediction = prediction;
        this.match = match;
        this.matchId = match.getId();
        this.result = result;
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

    public Matches getMatch() {
        return match;
    }

    public void setMatch(Matches match) {
        this.match = match;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

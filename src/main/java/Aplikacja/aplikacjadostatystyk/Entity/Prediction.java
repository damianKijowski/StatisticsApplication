package Aplikacja.aplikacjadostatystyk.Entity;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import Aplikacja.aplikacjadostatystyk.football_api_entity.Matches;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Prediction {

    @Id
    private int id;
    private int prediction;
    @Transient
    private Matches match;
    @Transient
    private int result;

    public Prediction(int id, int prediction, Matches match, int result) {
        this.id = id;
        this.prediction = prediction;
        this.match = match;
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

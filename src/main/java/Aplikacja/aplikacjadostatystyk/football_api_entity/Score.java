package Aplikacja.aplikacjadostatystyk.football_api_entity;

public class Score {
    private String winner;
    private String duration;
    private FullTime halfTime;
    private FullTime fullTime;

    public Score(String winner, String duration, FullTime halfTime, FullTime fullTime) {
        this.winner = winner;
        this.duration = duration;
        this.halfTime = halfTime;
        this.fullTime = fullTime;
    }

    public Score() {
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public FullTime getHalfTime() {
        return halfTime;
    }

    public void setHalfTime(FullTime halfTime) {
        this.halfTime = halfTime;
    }

    public FullTime getFullTime() {
        return fullTime;
    }

    public void setFullTime(FullTime fullTime) {
        this.fullTime = fullTime;
    }
}

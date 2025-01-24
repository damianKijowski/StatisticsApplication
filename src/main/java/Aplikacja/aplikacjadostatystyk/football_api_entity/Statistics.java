package Aplikacja.aplikacjadostatystyk.football_api_entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics {
    @JsonProperty("corner_kicks")
    private String cornerKicks;
    @JsonProperty("free_kicks")
    private String freeKicks;
    @JsonProperty("goal_kicks")
    private String goalKicks;
    private String offsides;
    @JsonProperty("ball_possession")
    private String ballPossession;
    private String saves;
    @JsonProperty("throw_ins")
    private String throwIns;
    private String shots;
    @JsonProperty("shots_on_goal")
    private String shotsOnGoal;
    @JsonProperty("shots_off_goal")
    private String shotsOffGoal;
    @JsonProperty("yellow_cards")
    private String yellowCards;
    @JsonProperty("yellow_red_cards")
    private String yellowRedCards;
    @JsonProperty("red_cards")
    private String redCards;

    public Statistics(String cornerKicks, String freeKicks, String goalKicks, String offsides, String ballPossession,
                      String saves, String throwIns, String shots, String shotsOnGoal, String shotsOffGoal,
                      String yellowCards, String yellowRedCards, String redCards) {
        this.cornerKicks = cornerKicks;
        this.freeKicks = freeKicks;
        this.goalKicks = goalKicks;
        this.offsides = offsides;
        this.ballPossession = ballPossession;
        this.saves = saves;
        this.throwIns = throwIns;
        this.shots = shots;
        this.shotsOnGoal = shotsOnGoal;
        this.shotsOffGoal = shotsOffGoal;
        this.yellowCards = yellowCards;
        this.yellowRedCards = yellowRedCards;
        this.redCards = redCards;
    }

    public Statistics() {
    }

    public String getCornerKicks() {
        return cornerKicks;
    }

    public void setCornerKicks(String cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    public String getFreeKicks() {
        return freeKicks;
    }

    public void setFreeKicks(String freeKicks) {
        this.freeKicks = freeKicks;
    }

    public String getGoalKicks() {
        return goalKicks;
    }

    public void setGoalKicks(String goalKicks) {
        this.goalKicks = goalKicks;
    }

    public String getOffsides() {
        return offsides;
    }

    public void setOffsides(String offsides) {
        this.offsides = offsides;
    }

    public String getBallPossession() {
        return ballPossession;
    }

    public void setBallPossession(String ballPossession) {
        this.ballPossession = ballPossession;
    }

    public String getSaves() {
        return saves;
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    public String getThrowIns() {
        return throwIns;
    }

    public void setThrowIns(String throwIns) {
        this.throwIns = throwIns;
    }

    public String getShots() {
        return shots;
    }

    public void setShots(String shots) {
        this.shots = shots;
    }

    public String getShotsOnGoal() {
        return shotsOnGoal;
    }

    public void setShotsOnGoal(String shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public String getShotsOffGoal() {
        return shotsOffGoal;
    }

    public void setShotsOffGoal(String shotsOffGoal) {
        this.shotsOffGoal = shotsOffGoal;
    }

    public String getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(String yellowCards) {
        this.yellowCards = yellowCards;
    }

    public String getYellowRedCards() {
        return yellowRedCards;
    }

    public void setYellowRedCards(String yellowRedCards) {
        this.yellowRedCards = yellowRedCards;
    }

    public String getRedCards() {
        return redCards;
    }

    public void setRedCards(String redCards) {
        this.redCards = redCards;
    }
}

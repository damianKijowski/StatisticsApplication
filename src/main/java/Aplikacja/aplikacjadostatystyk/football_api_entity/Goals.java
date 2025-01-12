package Aplikacja.aplikacjadostatystyk.football_api_entity;

import java.util.List;

public class Goals {
    private String minute;
    private String injuryTime;
    private String type;
    private Team team;
    private Team scorer;
    private Team assist;
    private GoalScore score;

    public Goals(String minute, String injuryTime, String type, Team team, Team scorer, Team assist, GoalScore score) {
        this.minute = minute;
        this.injuryTime = injuryTime;
        this.type = type;
        this.team = team;
        this.scorer = scorer;
        this.assist = assist;
        this.score = score;
    }

    public Goals() {
    }

    public GoalScore getScore() {
        return score;
    }

    public void setScore(GoalScore score) {
        this.score = score;
    }

    public Team getAssist() {
        return assist;
    }

    public void setAssist(Team assist) {
        this.assist = assist;
    }

    public Team getScorer() {
        return scorer;
    }

    public void setScorer(Team scorer) {
        this.scorer = scorer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(String injuryTime) {
        this.injuryTime = injuryTime;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}

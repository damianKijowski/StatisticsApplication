package Aplikacja.aplikacjadostatystyk.football_api_entity;

public class Substitutions {
    private String minute;
    private Team team;
    private Team playerOut;
    private Team playerIn;

    public Substitutions(String minute, Team team, Team playerOut, Team playerIn) {
        this.minute = minute;
        this.team = team;
        this.playerOut = playerOut;
        this.playerIn = playerIn;
    }

    public Substitutions() {
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getPlayerOut() {
        return playerOut;
    }

    public void setPlayerOut(Team playerOut) {
        this.playerOut = playerOut;
    }

    public Team getPlayerIn() {
        return playerIn;
    }

    public void setPlayerIn(Team playerIn) {
        this.playerIn = playerIn;
    }
}

package Aplikacja.aplikacjadostatystyk.football_api_entity;

public class GoalScore {
    private String home;
    private String away;

    public GoalScore(String home, String away) {
        this.home = home;
        this.away = away;
    }

    public GoalScore() {
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }
}

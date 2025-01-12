package Aplikacja.aplikacjadostatystyk.football_api_entity;

public class Bookings {
    private String minute;
    private Team team;
    private Team player;
    private String card;

    public Bookings(String minute, Team team, Team player, String card) {
        this.minute = minute;
        this.team = team;
        this.player = player;
        this.card = card;
    }

    public Bookings() {
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

    public Team getPlayer() {
        return player;
    }

    public void setPlayer(Team player) {
        this.player = player;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}

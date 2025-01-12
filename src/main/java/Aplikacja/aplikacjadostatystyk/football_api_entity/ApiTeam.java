package Aplikacja.aplikacjadostatystyk.football_api_entity;


import java.util.List;

public class ApiTeam {
    private Area area;
    private int id;
    private String name;
    private String tla;
    private String venue;
    private String crest;
    private Coach coach;
    private String formation;
    private List<Lineup> lineup;
    private List<Lineup> bench;


    public ApiTeam(Area area, int id, String name, String tla, String venue, String crest, Coach coach, String formation,
                   List<Lineup> lineup, List<Lineup> bench) {
        this.area = area;
        this.id = id;
        this.name = name;
        this.tla = tla;
        this.venue = venue;
        this.crest = crest;
        this.coach = coach;
        this.formation = formation;
        this.lineup = lineup;
        this.bench = bench;
    }

    public ApiTeam() {
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public List<Lineup> getLineup() {
        return lineup;
    }

    public void setLineup(List<Lineup> lineup) {
        this.lineup = lineup;
    }

    public List<Lineup> getBench() {
        return bench;
    }

    public void setBench(List<Lineup> bench) {
        this.bench = bench;
    }

}

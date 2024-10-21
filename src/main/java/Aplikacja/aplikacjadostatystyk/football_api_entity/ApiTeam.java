package Aplikacja.aplikacjadostatystyk.football_api_entity;


public class ApiTeam {
    private Area area;
    private int id;
    private String name;
    private String tla;
    private String venue;
    private String crest;

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    // Getters and Setters
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

    public ApiTeam(Area area, int id, String name, String tla, String venue, String crest) {
        this.area = area;
        this.id = id;
        this.name = name;
        this.tla = tla;
        this.venue = venue;
        this.crest = crest;
    }

    public ApiTeam() {
    }
}

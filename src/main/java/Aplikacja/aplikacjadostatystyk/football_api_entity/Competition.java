package Aplikacja.aplikacjadostatystyk.football_api_entity;

public class Competition {

    private int id;
    private String name;

    private Area area;
    private String code;
    private String emblem;

    public Competition() {};
    public Competition(String name, Area area, String code, String emblem) {
        this.name = name;
        this.area = area;
        this.code = code;
        this.emblem = emblem;
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


    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmblem() {
        return emblem;
    }

    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }
}

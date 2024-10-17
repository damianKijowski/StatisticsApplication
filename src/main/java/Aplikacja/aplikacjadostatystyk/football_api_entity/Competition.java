package Aplikacja.aplikacjadostatystyk.Entity;


import Aplikacja.aplikacjadostatystyk.football_api_entity.Area;
import jakarta.persistence.*;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String flag;
    
    private Area area;
    private String code;
    private String emblem;

    public Competition() {};
    public Competition(String name, String flag, Area area, String code, String emblem) {
        this.name = name;
        this.flag = flag;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

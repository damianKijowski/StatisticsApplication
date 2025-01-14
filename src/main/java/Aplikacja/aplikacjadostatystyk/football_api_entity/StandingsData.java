package Aplikacja.aplikacjadostatystyk.football_api_entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StandingsData {

    private List<Table> table;
    private String type;
    private String group;
    private String stage;

    public StandingsData(List<Table> table, String type, String group, String stage) {
        this.table = table;
        this.type = type;
        this.group = group;
        this.stage = stage;
    }

    public StandingsData() {
    }

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}

package Aplikacja.aplikacjadostatystyk.Entity;

import Aplikacja.aplikacjadostatystyk.football_api_entity.Match;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;


    private int matchId;

    private LocalDateTime createdAt;



    public Comment() {}

    public Comment(String content, int matchId, Users user, LocalDateTime createdAt) {
        this.content = content;
        this.matchId = matchId;
        this.user = user;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatch(int   matchId) {
        this.matchId = matchId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

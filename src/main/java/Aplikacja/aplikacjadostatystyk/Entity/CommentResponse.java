package Aplikacja.aplikacjadostatystyk.Entity;

import java.time.LocalDateTime;

public class CommentResponse {
    private String content;
    private String userName;
    private LocalDateTime createdAt;

    public CommentResponse(String content, String userName, LocalDateTime createdAt) {
        this.content = content;
        this.userName = userName;
        this.createdAt = createdAt;
    }

    // Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

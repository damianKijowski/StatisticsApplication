package Aplikacja.aplikacjadostatystyk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userFriendId;
    private int userId;

    public Friend(int userId, int userFriendId) {
        this.userFriendId = userFriendId;
        this.userId = userId;
    }


    public Friend() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserFriendId() {
        return userFriendId;
    }

    public void setUserFriendId(int userFriendId) {
        this.userFriendId = userFriendId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Friend;
import Aplikacja.aplikacjadostatystyk.Entity.Users;
import Aplikacja.aplikacjadostatystyk.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FriendService {
    @Autowired
    private FriendRepository friendRepository;

    public Friend addFriend(int id, int friendId) {
        return friendRepository.save(new Friend(id,friendId));
    }
    public Optional<Friend> getFriendById(Integer id) {return friendRepository.findById(id);}
    public void deleteFriendById(Integer id) {
        friendRepository.deleteById(id);
    }
    public Iterable<Friend> getAll() {
        return friendRepository.findAll();
    }
}

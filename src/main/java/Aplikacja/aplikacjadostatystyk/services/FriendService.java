package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Friend;
import Aplikacja.aplikacjadostatystyk.Entity.Users;
import Aplikacja.aplikacjadostatystyk.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FriendService {
    @Autowired
    private FriendRepository friendRepository;

    @Autowired
    private UserService userService;

    public Friend addFriend(int id, int friendId) {
        return friendRepository.save(new Friend(id,friendId));
    }
    public Optional<Friend> getFriendById(Integer id) {return friendRepository.findById(id);}
    public void deleteFriendById(Integer id) {
        friendRepository.deleteById(id);
    }
    public List<Optional<Users>> getAll(Integer userId) {
        List<Friend> friends = friendRepository.findByUserId(userId);
        List<Optional<Users>> users = new ArrayList<>();
        for(Friend friend : friends) {
            Optional<Users> user = userService.getUserById(friend.getUserFriendId());
            if (user.isPresent()) {
                users.add(user); // Add the user to the list
            }
        }
        return users;
    }
}

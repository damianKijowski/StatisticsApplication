package Aplikacja.aplikacjadostatystyk.controller;


import Aplikacja.aplikacjadostatystyk.Entity.Friend;
import Aplikacja.aplikacjadostatystyk.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/friends")
public class FriendController {
    @Autowired
    private FriendService friendService;

    @PostMapping("/addFriend")
    public Friend addFriend(@RequestBody Friend friend) {
        return friendService.addFriend(friend.getUserId(), friend.getUserFriendId());
    }

    @GetMapping("/{id}")
    public Optional<Friend> getFriend(@PathVariable Integer id) {
        return friendService.getFriendById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFriend(@PathVariable Integer id) {
        friendService.deleteFriendById(id);
    }

    @GetMapping
    public Iterable<Friend> getAllFriends() {
        return friendService.getAll();
    }
}

package Aplikacja.aplikacjadostatystyk.repository;

import Aplikacja.aplikacjadostatystyk.Entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends CrudRepository<Friend, Integer> {

    List<Friend> findByUserId(Integer userId);
}

package Aplikacja.aplikacjadostatystyk.services;

import Aplikacja.aplikacjadostatystyk.Entity.Users;
import Aplikacja.aplikacjadostatystyk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public Optional<Users> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public List<Users> getAll() {
        return userRepository.findAll();
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    public Users updateUser(Users user) {
        if(getUserById(user.getId()).isPresent()) {
            return userRepository.save(user);
        }
        return null;
    }
}

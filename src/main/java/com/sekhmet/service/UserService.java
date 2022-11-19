package com.sekhmet.service;

import com.sekhmet.models.User;
import com.sekhmet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getUsers(){
        return List.of(
                new User("jenny@domain.rs", "Pa$$w0rd", "Jenny", "Lai")
        );
    }

    public void saveUser() {
        //User user = new User("fjsdjs@gmails.com", "Password", "David", "Wong");
        //userRepo.save(user);
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepo.getUserByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        userRepo.save(user);
    }

    public void deleteById(Long userId) {
        if(!userRepo.existsById(userId)){
            throw new IllegalStateException("The " + userId.toString() + " does not exist");
        }
        else{
            userRepo.deleteById(userId);
        }
    }
}

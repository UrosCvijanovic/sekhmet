package com.sekhmet.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.sekhmet.models.User;
import com.sekhmet.repository.UserRepository;
import com.sekhmet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userRepo;

    @Override
    public List<User> getUsers(){
        List<User> users = this.userRepo.getUsers();
        return this.userRepo.getUsers();
    }

    //public void saveUser() {
        //User user = new User("fjsdjs@gmails.com", "Password", "David", "Wong");
        //userRepo.save(user);
    //}
    @Override
    public void addNewUser(User user) {
        Optional<User> userOptional = userRepo.getUserByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        userRepo.save(user);
    }
    @Override
    public void deleteById(Long userId) {
        if(!userRepo.existsById(userId)){
            throw new IllegalStateException("The " + userId.toString() + " does not exist");
        }
        else{
            userRepo.deleteById(userId);
        }
    }
}

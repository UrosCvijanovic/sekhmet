package com.sekhmet.api;

import com.sekhmet.models.User;
import com.sekhmet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping(
            value = "/createUser", consumes = "application/json", produces = "application/json")
    public void saveUser(@RequestBody User user){
        userService.addNewUser(user);
    }
    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteById(userId);
    }
}

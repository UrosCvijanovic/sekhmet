package com.sekhmet.service;

import com.sekhmet.models.User;
import com.sekhmet.repository.UserRepository;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void addNewUser(User user);

    public void deleteById(Long userId);
}


package com.sekhmet.sekhmet.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sekhmet.models.User;
import com.sekhmet.service.UserService;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void getUsersTest() {
        List<User> users = userService.getUsers();
        assertEquals(0, users.size());
    }
    @Test
    void deleteByIdTest() {
        Long userId = 1L;
        assertThrows(IllegalStateException.class, () -> userService.deleteById(userId));
    }

    @Test
    void getUserByIdTest() {
        Long userId = 1L;
        assertEquals(userId, userService.getUserById(userId).getId());
    }
}
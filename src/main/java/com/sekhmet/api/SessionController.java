package com.sekhmet.api;

import com.sekhmet.models.Course;
import com.sekhmet.models.Session;
import com.sekhmet.models.User;
import com.sekhmet.service.CourseService;
import com.sekhmet.service.SessionService;
import com.sekhmet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/v1/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/createSession", consumes = "application/json", produces = "application/json")
    public void createSession(@RequestBody Session session){
        try {
            System.out.println(session.getCourse());
            Course course = courseService.getCourseById(session.getCourse().getId());
            session.setCourse(course);
            sessionService.createSession(session);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

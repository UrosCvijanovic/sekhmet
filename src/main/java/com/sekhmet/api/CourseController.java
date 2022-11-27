package com.sekhmet.api;

import com.sekhmet.models.Course;
import com.sekhmet.models.User;
import com.sekhmet.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(
            value = "/createCourse", consumes = "application/json", produces = "application/json")
    public void saveUser(@RequestBody Course course){
        System.out.println(course);
        courseService.createCourse(course);
    }
}

package com.sekhmet.service.impl;

import com.sekhmet.models.Course;
import com.sekhmet.models.User;
import com.sekhmet.repository.CourseRepository;
import com.sekhmet.repository.UserRepository;
import com.sekhmet.service.CourseService;
import com.sekhmet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    public CourseRepository courseRepo;
    @Autowired
    public UserRepository userRepo;
    @Autowired
    public UserService userService;

    @Override
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    @Override
    public void createCourse(Course course) {
        courseRepo.save(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepo.findById(id).orElse(null);
    }
}

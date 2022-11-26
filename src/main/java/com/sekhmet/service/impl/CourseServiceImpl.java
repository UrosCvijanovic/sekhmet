package com.sekhmet.service.impl;

import com.sekhmet.models.Course;
import com.sekhmet.models.User;
import com.sekhmet.repository.CourseRepository;
import com.sekhmet.repository.UserRepository;
import com.sekhmet.service.CourseService;
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

    @Override
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    @Override
    public void createCourse(Course course) {

        Integer instr_id = course.getInstructor_id();

        Optional<User> userOptional = userRepo.findById(Long.valueOf(instr_id));

        if(!userOptional.isPresent()){
            throw new IllegalStateException("Wrong instuctor id");
        }

        courseRepo.save(course);
    }
}

package com.sekhmet.service;

import com.sekhmet.models.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
    public void createCourse(Course course);

    Course getCourseById(Long id);
}

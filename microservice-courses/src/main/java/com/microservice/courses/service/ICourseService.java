package com.microservice.courses.service;

import java.util.List;

import com.microservice.courses.entity.Course;
import com.microservice.courses.http.response.StudentByCouseResponse;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCouseResponse findStudentsByCourseId(Long courseId);
}
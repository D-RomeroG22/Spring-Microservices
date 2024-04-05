package com.microservice.students.service;

import java.util.List;

import com.microservice.students.entities.Student;

public interface IStudentService {

    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByCourseId(Long courseId);
}
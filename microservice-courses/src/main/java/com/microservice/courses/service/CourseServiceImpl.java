package com.microservice.courses.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.courses.client.StudentClient;
import com.microservice.courses.controller.DTO.StudentDTO;
import com.microservice.courses.entity.Course;
import com.microservice.courses.http.response.StudentByCouseResponse;
import com.microservice.courses.persistence.ICourseRepository;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCouseResponse findStudentsByCourseId(Long courseId) {

        // Consultar si existe el curso
        Course course = courseRepository.findById(courseId).orElseThrow();

        // Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(course.getId());

        return StudentByCouseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
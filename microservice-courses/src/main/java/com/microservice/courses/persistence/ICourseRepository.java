package com.microservice.courses.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.courses.entity.Course;

@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}
package com.tranvo_dev.course_enrollment_service.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tranvo_dev.course_enrollment_service.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    
}

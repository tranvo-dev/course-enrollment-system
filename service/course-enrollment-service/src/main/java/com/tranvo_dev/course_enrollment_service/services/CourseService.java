package com.tranvo_dev.course_enrollment_service.services;

import org.springframework.stereotype.Service;

import com.tranvo_dev.course_enrollment_service.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    
}

package com.tranvo_dev.course_enrollment_service.mappers;

import com.tranvo_dev.course_enrollment_service.entities.Course;
import com.tranvodev.courseenrollment.model.dto.CourseDto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Mapping(source = "enrolled", target = "enrolledCount")
    @Mapping(target = "code", ignore = true)
    @Mapping(target = "description", ignore = true)
    @Mapping(target = "credits", ignore = true)
    @Mapping(target = "status", ignore = true)
    CourseDto toDto(Course entity);
}

package com.tranvo_dev.course_enrollment_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity {
    private String email;
    @Column(name="display_name")
    private String displayName;
}

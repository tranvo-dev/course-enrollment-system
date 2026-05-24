package com.tranvo_dev.course_enrollment_service.entities;

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
public class Course extends BaseEntity {
    private String title;
    private int capacity;
    private int enrolled;

    public boolean hasAvailableSeat() {
        return enrolled < capacity;
    }
}

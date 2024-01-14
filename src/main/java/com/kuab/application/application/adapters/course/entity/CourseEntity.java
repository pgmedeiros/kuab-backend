package com.kuab.application.application.adapters.course.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;
    private String description;

}

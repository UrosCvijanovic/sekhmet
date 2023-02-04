package com.sekhmet.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class Course {
    @Id
    @SequenceGenerator(name = "course_seq",
            sequenceName = "course_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_seq")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User instructor_id;

    @Column(name = "class_name", nullable = false, length = 45)
    private String class_name;
}

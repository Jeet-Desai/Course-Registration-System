package com.jeetdesaimusic.CourseRegistrationSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student extends CRS_User {
    @Column(unique = true,nullable = false)
    private String studentID;
    private Double cpi;
    private Integer semesterNo;

    @ManyToMany(mappedBy = "enrolledStudents",fetch = FetchType.EAGER)
    private List<Course> enrolledCourses;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Semester currentSemester;

}

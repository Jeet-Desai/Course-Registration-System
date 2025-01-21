package com.jeetdesaimusic.CourseRegistrationSystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CRS_User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String role;

}

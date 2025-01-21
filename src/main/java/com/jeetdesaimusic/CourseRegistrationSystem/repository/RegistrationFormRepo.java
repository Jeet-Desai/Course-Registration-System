package com.jeetdesaimusic.CourseRegistrationSystem.repository;


import com.jeetdesaimusic.CourseRegistrationSystem.model.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationFormRepo extends JpaRepository<RegistrationForm,Integer> {
}

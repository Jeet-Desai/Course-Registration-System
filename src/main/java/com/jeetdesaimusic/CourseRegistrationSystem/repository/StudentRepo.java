package com.jeetdesaimusic.CourseRegistrationSystem.repository;
import com.jeetdesaimusic.CourseRegistrationSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}

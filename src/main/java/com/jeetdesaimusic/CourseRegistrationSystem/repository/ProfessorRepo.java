package com.jeetdesaimusic.CourseRegistrationSystem.repository;
import com.jeetdesaimusic.CourseRegistrationSystem.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepo extends JpaRepository<Professor,Integer> {
}

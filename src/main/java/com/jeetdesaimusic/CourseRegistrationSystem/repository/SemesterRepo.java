package com.jeetdesaimusic.CourseRegistrationSystem.repository;
import com.jeetdesaimusic.CourseRegistrationSystem.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepo extends JpaRepository<Semester,Integer> {

    Semester findBySemesterName(String name);
}

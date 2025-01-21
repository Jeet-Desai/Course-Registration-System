package com.jeetdesaimusic.CourseRegistrationSystem.repository;

import com.jeetdesaimusic.CourseRegistrationSystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
}

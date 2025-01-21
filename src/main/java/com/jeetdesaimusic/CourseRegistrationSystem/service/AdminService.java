package com.jeetdesaimusic.CourseRegistrationSystem.service;

import com.jeetdesaimusic.CourseRegistrationSystem.entity.Admin;
import com.jeetdesaimusic.CourseRegistrationSystem.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepo repo;
    public Admin registerAdmin(Admin myAdmin) {
        return repo.save(myAdmin);
    }
}

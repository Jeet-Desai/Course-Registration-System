package com.jeetdesaimusic.CourseRegistrationSystem.controller;

import com.jeetdesaimusic.CourseRegistrationSystem.entity.Admin;
import com.jeetdesaimusic.CourseRegistrationSystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService service;
    @GetMapping("/admin/greet")
    public String greet()
    {
        return "Kem chho admin bhai";
    }

    @PostMapping("/admin/register")
    public Admin addAdmin(@RequestBody Admin myAdmin)
    {
        return service.registerAdmin(myAdmin);
    }
}

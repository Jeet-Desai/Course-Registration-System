package com.jeetdesaimusic.CourseRegistrationSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminDTO {
    private String name;
    private String email;
    private String passWord;
    private String adminCode;

}

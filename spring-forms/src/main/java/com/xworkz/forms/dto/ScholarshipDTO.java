package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScholarshipDTO {
    private String name;
    private int age;
    private String course;
    private double percentage;
    private String email;

}
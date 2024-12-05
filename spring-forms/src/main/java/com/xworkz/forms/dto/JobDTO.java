package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobDTO {
    private String name;
    private String email;
    private String phone;
    private String position;
    private String company;
    private double experience;
    private double salary;
    private String education;
    private String skills;
    private String location;

}
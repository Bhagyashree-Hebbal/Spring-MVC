package com.xworkz.forms.dto;

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

    public JobDTO(String name, String email, String phone, String position, String company, double experience,
                          double salary, String education, String skills, String location) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.company = company;
        this.experience = experience;
        this.salary = salary;
        this.education = education;
        this.skills = skills;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

package com.xworkz.forms.dto;

public class ScholarshipDTO {
    private String name;
    private int age;
    private String course;
    private double percentage;
    private String email;

    public ScholarshipDTO(String name, int age, String course, double percentage, String email) {
        super();
        this.name = name;
        this.age = age;
        this.course = course;
        this.percentage = percentage;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

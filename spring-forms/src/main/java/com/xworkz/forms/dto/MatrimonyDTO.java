package com.xworkz.forms.dto;

public class MatrimonyDTO {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String education;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;

    public MatrimonyDTO(String name, int age, String gender, String occupation, String education, String email,
                          String phone, String address, String city, String state) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.education = education;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

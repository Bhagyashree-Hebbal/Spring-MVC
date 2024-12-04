package com.xworkz.forms.dto;

public class OrganDonationDTO {
    private String donorName;
    private int donorAge;
    private String bloodGroup;
    private String organ;
    private String contactNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;

    public OrganDonationDTO(String donorName, int donorAge, String bloodGroup, String organ, String contactNumber,
                          String email, String address, String city, String state, String country) {
        super();
        this.donorName = donorName;
        this.donorAge = donorAge;
        this.bloodGroup = bloodGroup;
        this.organ = organ;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

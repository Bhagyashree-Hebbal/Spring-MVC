package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

}

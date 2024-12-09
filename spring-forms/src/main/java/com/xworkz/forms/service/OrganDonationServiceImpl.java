package com.xworkz.forms.service;

import com.xworkz.forms.dto.OrganDonationDTO;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService{

    @Override
    public boolean donateAndSave(OrganDonationDTO organDonationDTO) {
        return true;
    }
}

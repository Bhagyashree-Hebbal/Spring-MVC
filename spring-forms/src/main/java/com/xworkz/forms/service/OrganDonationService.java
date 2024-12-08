package com.xworkz.forms.service;

import com.xworkz.forms.dto.OrganDonationDTO;

public interface OrganDonationService {
    boolean donateAndSave(OrganDonationDTO organDonationDTO);
}

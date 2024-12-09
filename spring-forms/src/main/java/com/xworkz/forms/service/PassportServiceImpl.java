package com.xworkz.forms.service;

import com.xworkz.forms.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{

    @Override
    public boolean fillAndSubmit(PassportDTO passportDTO) {
        return true;
    }
}

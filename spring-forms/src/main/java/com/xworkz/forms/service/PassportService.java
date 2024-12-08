package com.xworkz.forms.service;

import com.xworkz.forms.dto.PassportDTO;

public interface PassportService {
    boolean fillAndSubmit(PassportDTO passportDTO);
}

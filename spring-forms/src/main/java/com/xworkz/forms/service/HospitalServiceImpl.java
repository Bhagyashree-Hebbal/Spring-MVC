package com.xworkz.forms.service;

import com.xworkz.forms.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Override
    public boolean admitAndDischarge(HospitalDTO hospitalDTO) {
        return true;
    }
}

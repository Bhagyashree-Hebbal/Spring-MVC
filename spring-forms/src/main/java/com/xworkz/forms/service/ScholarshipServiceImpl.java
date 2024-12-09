package com.xworkz.forms.service;

import com.xworkz.forms.dto.ScholarshipDTO;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl implements ScholarshipService{

    @Override
    public boolean applyAndGet(ScholarshipDTO scholarshipDTO) {
        return true;
    }
}

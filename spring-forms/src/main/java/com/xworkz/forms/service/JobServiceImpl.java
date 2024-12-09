package com.xworkz.forms.service;

import com.xworkz.forms.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{

    @Override
    public boolean fillAndSend(JobDTO jobDTO) {
        return true;
    }
}

package com.xworkz.forms.service;

import com.xworkz.forms.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService{

    @Override
    public boolean birthAndDeath(DeathCertificateDTO deathCertificateDTO) {
        return true;
    }
}

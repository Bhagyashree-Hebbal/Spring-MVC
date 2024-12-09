package com.xworkz.forms.controller;

import com.xworkz.forms.dto.DeathCertificateDTO;
import com.xworkz.forms.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeathCertificateContro {
    @Autowired
    private DeathCertificateService service;

    DeathCertificateContro(){
        System.out.println("No-arg const DeathCertificateContro");
    }

    @RequestMapping("/deceased")
    public String death(DeathCertificateDTO deathCertificateDTO){
        System.out.println("running death certificate");
        System.out.println(deathCertificateDTO);
        if(this.service.birthAndDeath(deathCertificateDTO))
        {
            System.out.println("saved");
        }
        else {
            System.out.println("Not saved");
        }
        return "DeathCertificate.jsp";
    }
}

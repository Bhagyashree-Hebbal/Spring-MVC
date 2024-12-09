package com.xworkz.forms.controller;

import com.xworkz.forms.dto.HospitalDTO;
import com.xworkz.forms.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HospitalContro {

    @Autowired
    private HospitalService service;

    HospitalContro(){
        System.out.println("No-arg const HospitalContro");
    }

    @RequestMapping("/hospital")
    public String patient(HospitalDTO hospitalDTO){
        System.out.println("running Hospital");
        System.out.println(hospitalDTO);
        if(this.service.admitAndDischarge(hospitalDTO))
        {
            System.out.println("saved");
        }
        else{
            System.out.println("Not saved");
        }
        return "HospitalForm.jsp";
    }
}

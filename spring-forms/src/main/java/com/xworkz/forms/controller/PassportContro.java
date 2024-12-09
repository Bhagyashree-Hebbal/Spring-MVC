package com.xworkz.forms.controller;

import com.xworkz.forms.dto.PassportDTO;
import com.xworkz.forms.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PassportContro {

    @Autowired
    private PassportService service;

    PassportContro(){
        System.out.println("No-arg const PassportContro");
    }

    @RequestMapping("/passport")
    public String pass(PassportDTO passportDTO){
        System.out.println("running passport");
        System.out.println(passportDTO);
        if(this.service.fillAndSubmit(passportDTO))
        {
            System.out.println("saved");
        }
        else{
            System.out.println("Not saved");
        }
        return "PassportForm.jsp";
    }
}

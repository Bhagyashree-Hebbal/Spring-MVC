package com.xworkz.forms.controller;

import com.xworkz.forms.dto.BankAccountDTO;
import com.xworkz.forms.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountContro {


    @Autowired
    private BankAccountService service;

    BankAccountContro(){
        System.out.println("no-arg const BankAccountContro");
    }

    @RequestMapping("/bank")
    public String bankAccount(BankAccountDTO bankAccountDTO){
        System.out.println("running bank account ");
        System.out.println(bankAccountDTO);
        if(this.service.validAndSave(bankAccountDTO))
        {
            System.out.println("saved");
        }
        else{
            System.out.println("Not saved");
        }
        return "BankAccountForm.jsp";
    }

}

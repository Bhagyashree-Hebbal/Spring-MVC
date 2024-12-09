package com.xworkz.forms.service;

import com.xworkz.forms.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Override
    public boolean validAndSave(BankAccountDTO bankAccountDTO) {
        return true;
    }
}

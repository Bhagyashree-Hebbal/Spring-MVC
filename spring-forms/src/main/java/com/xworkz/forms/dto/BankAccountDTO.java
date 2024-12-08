package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccountDTO {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
}

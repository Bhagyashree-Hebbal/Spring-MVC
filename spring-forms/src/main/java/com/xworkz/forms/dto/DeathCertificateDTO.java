package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DeathCertificateDTO {
    private String deceasedName;
    private int deceasedAge;
    private String deceasedAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deceasedDob;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deceasedLastDate;
    private String deceasedCauses;
}

package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class HospitalDTO {
    private int patientId;
    private String patientName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate admissionDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dischargeDate;
    private long contactNumber;
}

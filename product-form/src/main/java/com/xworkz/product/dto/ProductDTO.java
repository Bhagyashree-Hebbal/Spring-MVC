package com.xworkz.product.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private String type;
    private double cost;
    private String manfCompany;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manfDate;
    private int warrenty;
}

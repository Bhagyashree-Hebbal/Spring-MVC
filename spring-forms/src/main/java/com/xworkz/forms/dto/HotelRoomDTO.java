package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HotelRoomDTO {
    private String roomNumber;
    private String roomType;
    private double price;

}

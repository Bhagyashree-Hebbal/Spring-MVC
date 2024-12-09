package com.xworkz.forms.service;

import com.xworkz.forms.dto.HotelRoomDTO;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomServiceImpl implements HotelRoomService{

    @Override
    public boolean orderAndPay(HotelRoomDTO hotelRoomDTO) {
        return true;
    }
}

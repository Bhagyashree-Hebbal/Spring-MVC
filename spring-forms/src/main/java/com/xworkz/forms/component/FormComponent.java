package com.xworkz.forms.component;

import com.xworkz.forms.dto.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FormComponent {


    public FormComponent(){
        System.out.println("No-arg const in FormComponent");
    }

    @RequestMapping("/scholarship")
    public String applyScholarship(ScholarshipDTO scholarshipDTO){
        System.out.println("running applyScholarship");
        System.out.println(scholarshipDTO);
        return "scholarshipForm.jsp";
    }

    @RequestMapping("/job")
    public String applyJob(JobDTO jobDTO){
        System.out.println("running applyJob");
        System.out.println(jobDTO);
        return "jobForm.jsp";
    }

    @RequestMapping("/organDonation")
    public String donateOrgan(OrganDonationDTO organDonationDTO){
        System.out.println("running donateOrgan");
        System.out.println(organDonationDTO);
        return "organDonationForm.jsp";
    }

    @RequestMapping("/matrimony")
    public String applyMatrimony(MatrimonyDTO matrimonyDTO){
        System.out.println("running matrimony");
        System.out.println(matrimonyDTO);
        return "matrimonyForm.jsp";
    }

    @RequestMapping("/hotelRoom")
    public String bookHotelRoom(HotelRoomDTO hotelRoomDTO){
        System.out.println("running hotelRooms");
        System.out.println(hotelRoomDTO);
        return "hotelRoomForm.jsp";
    }

}

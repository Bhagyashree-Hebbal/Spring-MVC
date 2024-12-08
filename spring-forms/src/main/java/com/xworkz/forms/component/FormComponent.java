package com.xworkz.forms.component;

import com.xworkz.forms.dto.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FormComponent {

    public FormComponent(){
        System.out.println("No-arg const in FormComponent");
    }

    @RequestMapping("scholarship")
    public String applyScholarship(ScholarshipDTO scholarshipDTO){
        System.out.println("running applyScholarship");
        System.out.println(scholarshipDTO);
        return "scholarshipForm.jsp";
    }

    @RequestMapping("job")
    public String applyJob(JobDTO jobDTO){
        System.out.println("running applyJob");
        System.out.println(jobDTO);
        return "jobForm.jsp";
    }

    @RequestMapping("organDonation")
    public String donateOrgan(OrganDonationDTO organDonationDTO){
        System.out.println("running donateOrgan");
        System.out.println(organDonationDTO);
        return "organDonationForm.jsp";
    }

    @RequestMapping("matrimony")
    public String applyMatrimony(MatrimonyDTO matrimonyDTO){
        System.out.println("running matrimony");
        System.out.println(matrimonyDTO);
        return "matrimonyForm.jsp";
    }

    @RequestMapping("hotelRoom")
    public String bookHotelRoom(HotelRoomDTO hotelRoomDTO){
        System.out.println("running hotelRooms");
        System.out.println(hotelRoomDTO);
        return "hotelRoomForm.jsp";
    }

    @RequestMapping("bank")
    public String bankAccount(BankAccountDTO bankAccountDTO){
        System.out.println("running bank account ");
        System.out.println(bankAccountDTO);
        return "BankAccountForm.jsp";
    }

    @RequestMapping("passport")
    public String pass(PassportDTO passportDTO){
        System.out.println("running passport");
        System.out.println(passportDTO);
        return "PassportForm.jsp";
    }

    @RequestMapping("deceased")
    public String death(DeathCertificateDTO deathCertificateDTO){
        System.out.println("running death certificate");
        System.out.println(deathCertificateDTO);
        return "DeathCertificate.jsp";
    }

    @RequestMapping("hospital")
    public String patient(HospitalDTO hospitalDTO){
        System.out.println("running Hospital");
        System.out.println(hospitalDTO);
        return "HospitalForm.jsp";
    }
}

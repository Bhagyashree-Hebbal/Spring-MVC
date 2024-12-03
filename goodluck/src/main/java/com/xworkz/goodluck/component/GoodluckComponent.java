package com.xworkz.goodluck.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class GoodluckComponent {

    public GoodluckComponent(){
        System.out.println("No-arg const GoodluckComponent");
    }

    @RequestMapping("/press")
    public String onPress(){
        System.out.println("running onPress in GoodluckComponent");
        return "index.jsp";
    }
}

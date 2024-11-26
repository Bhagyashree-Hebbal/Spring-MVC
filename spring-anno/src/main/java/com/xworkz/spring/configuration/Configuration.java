package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.xworkz.spring")
public class Configuration {
    @Bean
    public String teamName(){
        System.out.println("No-arg const in teamName");
        return "RCB";
    }

    @Bean
    public double budget(){
        System.out.println("No-arg const in budget");
        return 50000.00;
    }

    @Bean
    public String ownerName(){
        System.out.println("No-arg const in ownerName");
        return "United Spirits Limited";
    }

    @Bean
    public double batCost(){
        System.out.println("No-arg const in batCost");
        return 1000;
    }

    @Bean
    public double ballCost(){
        System.out.println("No-arg const in ballCost");
        return 500;
    }

    @Bean
    public String stadium(){
        System.out.println("No-arg const in stadium");
        return "Chinnaswamy Stadium";
    }
}

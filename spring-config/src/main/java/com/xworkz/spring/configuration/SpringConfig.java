package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfig {

    public SpringConfig(){
        System.out.println("No-arg const in SpringConfig");
    }
}

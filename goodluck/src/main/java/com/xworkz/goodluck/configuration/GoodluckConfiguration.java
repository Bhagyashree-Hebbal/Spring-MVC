package com.xworkz.goodluck.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.goodluck")
@EnableWebMvc
public class GoodluckConfiguration {

    public GoodluckConfiguration(){
        System.out.println("No-arg const GoodluckConfiguration");
    }
}

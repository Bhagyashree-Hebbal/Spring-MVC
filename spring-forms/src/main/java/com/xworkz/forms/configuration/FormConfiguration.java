package com.xworkz.forms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.forms")
@EnableWebMvc
public class FormConfiguration {

    public FormConfiguration(){
        System.out.println("No-arg const in FormConfiguration..");
    }
}

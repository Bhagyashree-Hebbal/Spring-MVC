package com.xworkz.apps.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.apps")
public class AppConfiguration {
    AppConfiguration(){
        System.out.println("Created AppConfiguration const");
    }
}

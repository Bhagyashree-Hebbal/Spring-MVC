package com.xworkz.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {
    @Autowired
    private String teamName;
}

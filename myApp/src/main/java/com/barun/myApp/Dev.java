package com.barun.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field Injection
    @Qualifier("computer")
    private Machine machine;

//    public Dev(Computer computer) { // Constructor Injection
//       this.computer = computer;
//    }

//    @Autowired
//    public void setComputer(Computer computer) { // Setter Injection
//        this.computer = computer;
//    }

    public void build () {

        machine.compile();
        System.out.println("Working on a project!");

    }
}

package com.barun.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Computer implements Machine {
    public void compile(){
        System.out.println("Compiling the bug 404.");
    }
}

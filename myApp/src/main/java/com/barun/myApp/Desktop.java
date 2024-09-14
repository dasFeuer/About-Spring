package com.barun.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Machine {
    public void compile(){

        System.out.println("Compiling the bug 404 but faster.");
    }
}

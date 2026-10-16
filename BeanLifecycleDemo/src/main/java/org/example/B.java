package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class B {

    private A a;

    // Not do these in reality
    // Solving Circular Depenedency
    // Cretaes temporary partial object
    // when method call actual object creates in IOC container
//    public B(@Lazy A a) {
//        this.a = a;
//    }

    public void setA(A a) {
        this.a = a;
    }
}

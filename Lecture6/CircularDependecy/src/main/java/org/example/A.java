package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class A {

    B b;

    public A(B b) {
        this.b = b;
    }

    @PostConstruct
    public void init() {
        b.setA(this);
    }
}

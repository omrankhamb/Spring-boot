package org.example;

import org.springframework.stereotype.Component;

@Component
public class A {
    OrderService order;

    public A(OrderService order)
    {
        this.order = order;
    }

}

package org.example;

import org.springframework.stereotype.Component;

@Component
public class A {
    public OrderService getOrderService ;

    public A(OrderService orderService) {
        this.getOrderService = orderService;

    }
}

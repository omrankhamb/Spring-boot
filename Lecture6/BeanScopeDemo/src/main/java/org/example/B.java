package org.example;

import org.springframework.stereotype.Component;

@Component
public class B {

    private OrderService orderService;

    public B(OrderService orderService) {
        this.orderService = orderService;
    }
}

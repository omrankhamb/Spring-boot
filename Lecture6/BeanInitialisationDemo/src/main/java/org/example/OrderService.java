package org.example;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {


    PaymentService paymentService;
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService constructor");
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }

    public void getorderDetails() {
        System.out.println("Order Details");
    }
}

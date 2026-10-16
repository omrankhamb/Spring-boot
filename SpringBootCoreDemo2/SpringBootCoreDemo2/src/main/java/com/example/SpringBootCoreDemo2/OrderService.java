package com.example.SpringBootCoreDemo2;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentservice)
    {
        this.paymentService = paymentservice;
    }

    public void PlaceOrder()
    {
        paymentService.Pay();
        System.out.println("Order Placed");
    }

}

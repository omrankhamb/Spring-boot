package com.example.SpringCoreDemo2;


import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeorder()
    {
        System.out.println("Placing Order");
    }
}

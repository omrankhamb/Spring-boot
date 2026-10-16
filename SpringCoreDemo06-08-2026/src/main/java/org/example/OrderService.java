package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;


    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder()
    {
        paymentService.Pay();
        System.out.println("Order Placed");
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    PaymentService paymentservice;

    public OrderService(PaymentService paymentservice)
    {
        this.paymentservice = paymentservice;
    }

    public void PlaceOrder()
    {
        System.out.println("Order Placed");
        paymentservice.pay();
    }


}

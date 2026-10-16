package org.example;


import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    private PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }



    public void Placeorder(){
        paymentService.Pay();
        System.out.println("Order Placed Successfully");
    }

}

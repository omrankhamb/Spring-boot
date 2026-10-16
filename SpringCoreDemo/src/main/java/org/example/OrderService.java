package org.example;

import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    // Filled Injection
//    @Autowired
//    public PaymentService paymentService;

    public PaymentService paymentService;

    // Constructor Injection
    public OrderService(@Qualifier("cardPayment")PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Setter Injection
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void PlaceOrder() {
        paymentService.Pay();
        System.out.println("Order Placed");
    }
}

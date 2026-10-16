package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class OrderService {
    PaymentService paymentService;
    // Injecting some proxy was given temporary
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder() {
        // Now the objject is created and cirular depedency is resolved
        paymentService.Pay();
        System.out.println("Order Placed");
    }

    public void getOrderDetails()
    {
        System.out.println("Order Deatils");
    }
}

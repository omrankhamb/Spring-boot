package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {
    OrderService orderService;
    // Due to constructor automaticallly autowired
    public PaymentService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void Pay()
    {
        System.out.println("Payment successfull");
        orderService.getOrderDetails();

    }
}

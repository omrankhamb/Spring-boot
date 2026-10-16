package org.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    OrderService orderService;
    public PaymentService(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("PaymentService constructor");
    }

    public void pay()
    {
        orderService.getorderDetails();
        System.out.println("payment done");
    }
}

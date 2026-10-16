package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {

    public C(OrderService order) {
        System.out.println("C constructor");
        order.PlaceOrder();
    }
}

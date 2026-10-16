package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton") // SingleTon Design pattern
public class OrderService {


    public OrderService() {
        System.out.println("OrderService constructor");
    }

    public void placeOrder() {
        System.out.println("Order Placed");
    }
}



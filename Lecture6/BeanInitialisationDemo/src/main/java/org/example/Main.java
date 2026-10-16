package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();

    }
}

/*

Lazy and the eager initilisation
By default the scope is initilization singleton
we can create the @Lazy Scope

In Prototype the scope is by default is Lazy  initilaisation
BY default the prototype the scope is Lazy
*/

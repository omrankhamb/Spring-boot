package org.example;

import org.example.Simple.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // I have to pass reflection
//        OrderService order = context.getBean(OrderService.class);
//        order.PlaceOrder();

        C obj = context.getBean(C.class);


        //A a = new A();

    }
}

package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // get by id
        //OrderService orderService = (OrderService) context.getBean("orderService");

        // get bean by type
        // we can create multiple bean  but in
        // OrderService orderService1 = context.getBean( OrderService.class);

        // We can fetch either by name or id
//        OrderService orderService = context.getBean("orderService",OrderService.class);
//
//        orderService.Placeorder();

        UserService userService = context.getBean("userService",UserService.class);

        //System.out.println(userService.getUsername());

        context.close();

    }
}

    package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args)
    {
        // Reflection Give all the inforamtaion of all classe to inversion of control
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();


        User user = context.getBean(User.class);
        String name  = user.getName();
        System.out.println(name);

    }
}


/*

    If WE use the component Then the all the object is created by the IOC Container and by using the autowired the Dependecires are injected
 */

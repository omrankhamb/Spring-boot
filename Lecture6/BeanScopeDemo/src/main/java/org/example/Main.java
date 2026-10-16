package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;

import java.io.ObjectInputFilter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);






        OrderService order = context.getBean(OrderService.class);

        OrderService order2 = context.getBean(OrderService.class);

        System.out.println(order == order2);
    }
}

/*

Scope is default id Singleton (SingleTon Design Pattern)
Alaways give the same object have create only object and provide only one object
In singleTon There is eager intialisation
class like orderservice

Prototype Scope is not entire handled by the IOC Container
In Prototype there is Not eager Intialisation there is late initilisation
For the User class Use the Prototype state
In user we can use the state

 */
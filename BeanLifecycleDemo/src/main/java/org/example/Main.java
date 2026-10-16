package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//
//        order.PlaceOrder();
//
//        BeanNameAware bean = context.getBean(BeanNameAware.class);

        // Just Change the bean name onoconsole but in backened it will remains same by compiler
//        UserService user = context.getBean(UserService.class);

//        CartService cartService = context.getBean(CartService.class);
//
//        System.out.println(cartService.getValue(1));
//        context.close();

//

    }
}

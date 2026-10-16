package org.example;


import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")   // If single package is present then manually
public class AppConfig {


        // These Method call by the User
        // object created by the
        @Bean
        public User createUser() {
            return new User("Aditya", 28);
        }

        @Bean
        @Qualifier("cp")
       public PaymentService paymentService() {
            return  new CardPayment();

        }


        @Bean
        @Qualifier("up")
        public PaymentService createPaymentService() {
        return  new UpiPayment();
        }

        @Bean
        public OrderService orderService(@Qualifier("cp")PaymentService paymentService) {
            return new OrderService(paymentService);
        }


        @Bean
        public CartService cartService() {
            return new CartService();
        }
}

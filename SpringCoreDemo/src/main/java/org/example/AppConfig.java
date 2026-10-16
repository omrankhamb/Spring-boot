package org.example;


import org.example.Payment.CardPayment;
import org.example.Payment.PaymentService;
import org.example.Payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public User createUser()
    {
        return new User("omprasad",28);
    }

    @Bean
    public CartService createCartService()
    {
        return new CartService();
    }

    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment()
    {
        return new CardPayment();
    }

    @Bean
    @Qualifier("up")
    public PaymentService UpiPayment()
    {
        return new UpiPayment();
    }



    @Bean
    public OrderService createOrderService(@Qualifier("up")PaymentService paymentService)
    {
        return new OrderService(paymentService);
    }

    // empty
}

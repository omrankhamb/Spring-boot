package com.example.SpringBootCoreDemo2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void Pay()
    {
        System.out.println("Payment Done");
    }
}

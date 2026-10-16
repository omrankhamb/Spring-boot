package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier
public class UpiPayment implements PaymentService{
    @Override
    public void Pay()
    {
        System.out.println("Paying via UPI");
    }

}

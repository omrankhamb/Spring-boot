package org.example.Payment;

public class CardPaymentService implements PaymentService {
    @Override
    public void Pay()
    {
        System.out.println("Paying via Card");
    }

}

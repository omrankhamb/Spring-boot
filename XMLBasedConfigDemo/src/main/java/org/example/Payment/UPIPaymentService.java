package org.example.Payment;

public class UPIPaymentService implements PaymentService {

    @Override
    public void Pay()
    {
        System.out.println("Paying via UPI");
    }
}

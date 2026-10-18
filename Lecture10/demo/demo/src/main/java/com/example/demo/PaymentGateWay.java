package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sound.midi.SysexMessage;

@Component
public class PaymentGateWay {
    private String type;
    private int retryCount;

//    public PaymentGateWay(
//                @Value("${paymenstGateWay.type}") String type,
//                @Value("${payementGateWay.retry-count}") int retryCount
//
//    ){
//
//        this.type = type;
//        this.retryCount = retryCount;
//    }
    private PaymentProperties paymentProperties;

    public PaymentGateWay(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public boolean isEnabled() {
        return paymentProperties.isEnabled();
    }

    public int timeout() {
        return paymentProperties.getTimeout();
    }




    public void print()
    {
        System.out.println(getRetryCount());
        System.out.println(getType());
        System.out.println(isEnabled());
        System.out.println(timeout());
    }

}

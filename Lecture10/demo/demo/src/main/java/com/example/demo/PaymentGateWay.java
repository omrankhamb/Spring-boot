package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class PaymentGateWay {
    private String type;
    private int retryCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
}

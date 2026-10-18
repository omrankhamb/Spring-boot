package com.example.demo;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner  implements ApplicationRunner {

    private PaymentGateWay  paymentGateWay;

    public DemoRunner(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }
    public void run(ApplicationArguments args) throws Exception {
            paymentGateWay.print();
    }
}

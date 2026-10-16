package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component No need of using the @Component because the @Bean is used in the AppConfing Application
public class OrderService {
    // Field injection
//    @Autowired
      private PaymentService paymentService;

      // If only One constructor present then there is no need to write Autowired
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @Autowired
//    public void setPaymentService(@Qualifier("cp")PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}

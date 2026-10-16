package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUPNotificationService;
import org.example.notification.SmsService;

public class OrderService {
    NotificationService notificationService;

    //  I am injecting the dependecies in OrderService from main by passing or givig the object of NOtificationService
    // this is Dependency injection
    public OrderService(NotificationService notification) {
        notificationService = notification;
    }

    public OrderService()
    {

    }
    public void PlaceOrder()
    {
        System.out.println("Order Placed");
        notificationService.SendNotiFication();
    }

    //Setter
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}


// A class should ask what its need and not build everything itself
// IOC --> Inversion of control
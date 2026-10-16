package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.SmsService;

public class OrderService {
    NotificationService notification;

    public  OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public OrderService() {

    }
    public void placeOrder() {
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}

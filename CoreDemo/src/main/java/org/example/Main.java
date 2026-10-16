package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        NotificationService notification = new SmsService();;
        //derService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotificationService(notification);
        order.PlaceOrder();
    }
}

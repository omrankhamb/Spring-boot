package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        NotificationService notificationService = new SmsService();

    OrderService orderService = new OrderService();
    orderService.setNotification(notificationService);

    orderService.placeOrder();
    }

    // A class should ask what it needs and not
    // Build EveryThing Itself
    // Inversion of control
    //
}

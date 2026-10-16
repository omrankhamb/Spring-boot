package org.example.Notification;

public class PopUpNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("PopUp Notification sent");
    }
}

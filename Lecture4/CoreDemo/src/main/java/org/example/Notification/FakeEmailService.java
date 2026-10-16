package org.example.Notification;

public class FakeEmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Dummy Notification Sent");
    }
}

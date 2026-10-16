package org.example.notification;

public class SmsService implements NotificationService {
    @Override
    public void SendNotiFication(){
        System.out.println("Sms  notifiacatiaon sent");
    }
}

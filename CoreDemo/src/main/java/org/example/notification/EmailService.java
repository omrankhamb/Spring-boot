package org.example.notification;

public class EmailService implements NotificationService{

    @Override
    public void SendNotiFication(){
        System.out.println("Email notifiacatiaon sent");
    }

}

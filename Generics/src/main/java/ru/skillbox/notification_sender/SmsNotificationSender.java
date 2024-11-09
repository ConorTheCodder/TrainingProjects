package ru.skillbox.notification_sender;

import ru.skillbox.notification.Notification;
import ru.skillbox.notification.SmsNotification;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {


    @Override
    public void send(SmsNotification notification) {
        System.out.println("receivers: " + String.join(", ", notification.getPhoneNumbers()));
        System.out.println("message: " + notification.formattedMessage());
    }


    @Override
    public void send(List<SmsNotification> notifications) {
        for (SmsNotification notification : notifications) {
            send(notification);
        }
    }
}

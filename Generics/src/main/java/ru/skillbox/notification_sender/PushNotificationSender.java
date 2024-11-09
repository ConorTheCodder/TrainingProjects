package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println("title: " + notification.getPushHeadliner());
        System.out.println("receiver: " + notification.getUserAccount());
        System.out.println("message: " + notification.formattedMessage());

    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            send(notification);
        }

    }
}

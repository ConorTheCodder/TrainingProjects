package ru.skillbox.notification_sender;

import ru.skillbox.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        System.out.println("subject: " + notification.getSubject());
        System.out.println("receivers: " + String.join(", ", notification.getEmailAddresses()));
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            send(notification);
        }

    }
}

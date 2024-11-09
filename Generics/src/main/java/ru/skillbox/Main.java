package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("lodasi@scatterteam.com");
        emails.add("lodasi@scattersdfsdgteam.com");
        emails.add("lodasi@scattedfsdfsdfsdfrteam.com");
        emails.add("lodasi@scattesdfsdfsdfrteam.com");
        EmailNotification emailNotification = new EmailNotification("greeting message", emails, "hello");

        EmailNotificationSender emailNotificationSender = new EmailNotificationSender();

        emailNotificationSender.send(emailNotification);
    }
}

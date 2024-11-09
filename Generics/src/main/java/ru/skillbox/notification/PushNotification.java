package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PushNotification implements Notification {

    @Getter
    private String userAccount;
    @Getter
    private String pushHeadliner;
    private String message;


    @Override
    public String formattedMessage() {
        return "\\ud83d\\udc4b" + " " + message;
    }
}

package com.company.initiatorandapplicationsv14.app;

import io.jmix.ui.Notifications;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageShow {
    Notifications notifications;
    public void messageStatus () {
        notifications.create()
                .withCaption("Опа!")
                .withDescription("Заявку можно только продвигать")
                .show();
    }
}
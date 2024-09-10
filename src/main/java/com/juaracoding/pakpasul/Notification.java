package com.juaracoding.pakpasul;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 06:22
@Last Modified 10/09/2024 06:22
Version 1.0
*/

import java.util.Scanner;

public class Notification {
    private MessagingService messagingService;

    public Notification(MessagingService messagingService){
        this.messagingService = messagingService;
    }

    public void send(String message, String recaiver) {
        messagingService.sendMessage(message,recaiver);
    }
}

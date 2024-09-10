package com.juaracoding.pakpasul;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 06:11
@Last Modified 10/09/2024 06:11
Version 1.0
*/

public class EmailService implements MessagingService {

    @Override
    public void sendMessage(String message, String receiver){
        System.out.println("Email sent to  = " + receiver+"\n"+" whitt message = "+message);
    }
}

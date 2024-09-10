package com.juaracoding.pakpasul;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 06:24
@Last Modified 10/09/2024 06:24
Version 1.0
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" Pilihan metode pengiriman pesan :");
            System.out.println("1 Email");
            System.out.println("2 SMS");
            System.out.println("0 Keluar");
            System.out.println(" Masukkan pilihan anda : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            MessagingService messagingService;
            Notification notification;

            if (pilihan == 1) {


                System.out.println(" mengirim pesan memalui Email");
                System.out.print(" Maasukkan email yang dituju : ");
                String emailReceiver = sc.nextLine();
                System.out.print("masukkan pesan yang akan anda kirim : ");
                String emailMessage = sc.nextLine();


                messagingService = new EmailService();
                notification = new Notification(messagingService);
                notification.send(emailMessage, emailReceiver);

            } else if (pilihan == 2) {


                System.out.println(" mengirim pesan melalui SMS ");
                System.out.print(" Isi Pesan yang akan anda kirim : ");
                String smsMessage = sc.nextLine();
                System.out.print(" Nomor penerima pesan : ");
                String nomorReceiver = sc.nextLine();


                messagingService = new SMSService();
                notification = new Notification(messagingService);
                notification.send(smsMessage, nomorReceiver);
            } else if (pilihan == 0) {
                System.out.println("Keluar dari program . Terimakasih");
                running = false;
            } else {
                System.out.println(" pilihan anda salah kawan . silahkan pilih 1 atau 2");
            }

        }
        sc.close();
    }
}

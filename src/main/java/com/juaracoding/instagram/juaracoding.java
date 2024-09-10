package com.juaracoding.instagram;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 17/09/2024 22:16
@Last Modified 17/09/2024 22:16
Version 1.0
*/

public class juaracoding {
    public static void main(String[] args) {
        // Memicu aksi setelah 3 detik
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println("Triggered setelah 3 detik!");
            }
        }, 3000);
    }
}


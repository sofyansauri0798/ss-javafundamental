package com.juaracoding.instagram;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 17/09/2024 22:26
@Last Modified 17/09/2024 22:26
Version 1.0
*/
public class callback {
    public static void main(String[] args) {
        executeTrigger(new Callback() {
            @Override
            public void onTriggered() {
                System.out.println("Triggered: Aksi setelah kondisi terpenuhi!");
            }
        });
    }

    // Method untuk memicu callback
    public static void executeTrigger(Callback callback) {
        // Logika kondisi
        boolean kondisiTerpenuhi = true; // Ini contoh saja

        if (kondisiTerpenuhi) {
            callback.onTriggered(); // Memicu aksi
        }
    }

    // Interface Callback
    interface Callback {
        void onTriggered();
    }
}


package com.juaracoding.merapihkan_angka;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 23:02
@Last Modified 10/09/2024 23:02
Version 1.0
*/

public class Researce {
    public static void main(String[] args) {
        boolean isRemainderOn = true;
        int j = 1200;
        String strCuaca = "Hujan";
        String strExec="";
        if (isRemainderOn) {
            strExec = "1";
            System.out.println(" ini true reminder !!");
        } else if (strCuaca.equals("Hujan")) {
            strExec = "3";
            System.out.println("sekarang sedang hujan");
        } else {
            strExec = "4";
            System.out.println("tidak ada kondisi");
        }
        System.out.println(strExec);
    }
}

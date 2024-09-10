package com.juaracoding.merapihkan_angka;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 22:49
@Last Modified 10/09/2024 22:49
Version 1.0
*/

import java.util.Scanner;

public class AyoTebak {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("masukkan kata yg ingin diproses : ");
        String strText=scn.next();
        String poli="";
        StringBuilder strBuilder=new StringBuilder();
        String strTest="";

        strBuilder.setLength(0);
        for (int i = strTest.length(); i >0 ; i--) {
            System.out.println(strTest.substring(i-1,i)+"i ="+i);
            poli =strBuilder.append(strTest).toString();

        }
        strBuilder.setLength(0);
        if (strTest.equalsIgnoreCase(poli)) {
            System.out.println("merupakan agumen");

        }else {
            System.out.println("bukan agumen");
        }
    }
}

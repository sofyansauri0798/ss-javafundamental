package com.juaracoding.instagram;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 12/09/2024 19:03
@Last Modified 12/09/2024 19:03
Version 1.0
*/

public class Fibonacci {
    public static void main(String[] args) {
        int num=30;
        int num1=1;
        int num2=2;

        System.out.println("Fibonacci series = "+num1 +","+ num2);
        for (int i =0; i <num ; i++) {
            int num3= num1+num2;
            System.out.println("num3 = " + num3);
            num1=num2;num2=num3;

        }
        System.out.println("ini percobaan");}
}

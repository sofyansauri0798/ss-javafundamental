package com.juaracoding.instagram;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 12/09/2024 18:48
@Last Modified 12/09/2024 18:48
Version 1.0
*/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str="Kodok";
        StringBuilder reversed=new StringBuilder(str).reverse();
        System.out.println(reversed);

        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(str.equalsIgnoreCase(rev));
    }
}

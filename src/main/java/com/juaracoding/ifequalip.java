package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 09/09/2024 16:05
@Last Modified 09/09/2024 16:05
Version 1.0
*/

import java.util.Scanner;

public class ifequalip {
    public static void main(String[] args) {
//        String nama1="sofyan";
//        String nama ="Sofyan";

        Scanner sc=new Scanner(System.in);
        System.out.print(" masukkan nama pertama : ");
        String nama =sc.nextLine();
        System.out.print(" masukkan nama kedua : " );
        String nama1=sc.nextLine();


        if (nama.equalsIgnoreCase(nama1)) {

            System.out.println(" \n" +"OKEEEE nama sesuai");

        }else {
            System.out.println(" \n" +"MAAF nama tidak sesuai");
        }
        //System.out.println(nama.equalsIgnoreCase(nama1));

        System.out.println(" \n" +"karena nama1 = " + nama +"\n"+"Nama Ke2 = "+nama1);
    }
}

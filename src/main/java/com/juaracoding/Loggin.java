package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 06/09/2024 18:40
@Last Modified 06/09/2024 18:40
Version 1.0
*/

import java.util.Scanner;

public class Loggin {
    public static void main(String[] args) {
        String correctUsername = "username123";
        String correctPassword = "12345";
        Scanner sc=new Scanner(System.in);

        boolean loggedin= false;

        for (int attempts =1; attempts<= 3; attempts++){
            System.out.println("masukkan username : ");
            String username =sc.nextLine();

            System.out.println("masukkan password : ");
            String password =sc.nextLine();

            if (username.equals(correctUsername)&&password.equals(correctPassword)){
                System.out.println("kamu berhasil masuk..!!!");
                loggedin =true;
                break;
            }else {
                System.out.println(" username atau password salah..");
            }
        }
        if (!loggedin){
            System.out.println("ada sudah melebihi batas percobaan");
        }
        sc.close();
    }
}
//class Person{
//    public String nama;
//
//    public changeName(String newName){
//        this."name"=newName;

//  }
// }
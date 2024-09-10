package com.juaracoding.merapihkan_angka;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 08:26
@Last Modified 10/09/2024 08:26
Version 1.0
*/

import java.util.Scanner;

public class CleanString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" masukan kata acak yang akan anda rapihkan : ");
        String u=sc.nextLine();
        //String u ="asbo0go0gau3aip*72sad^5sdh3Poapw(92787736";

//        String CleanString=u.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println("ini adalah masukan pertama : "+u+"\n");
//        System.out.println("Hasil yang sudah di rapihkan = " + CleanString);

        StringBuilder letters= new StringBuilder();
        StringBuilder number= new StringBuilder();
        StringBuilder simbol =new StringBuilder();


        for (char ch : u.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                simbol.append(ch);
            }

        }
        System.out.printf("\n karekter yang dimasukan pertama : "+"\n"+u+"\n");
        System.out.println("++++++++++++++++++++++++++++++++"+"\n Hasil yang sudah di eksekusi \n");
        System.out.println("huruf : "+letters.toString());
        System.out.println("angka = " + number.toString());
        System.out.println("simbol khusus = " + simbol.toString());
    }
}

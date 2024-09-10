package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 08/09/2024 16:03
@Last Modified 08/09/2024 16:03
Version 1.0
*/

import java.util.Random;
//import java.util.Scanner;

public class Ifbolean {
    public static void main(String[] args) {

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("masukan ukuran baris : ");
//        int num = scanner.nextInt();
//        System.out.println("masukkan ukuran kolom : ");
//        int num1=scanner.nextInt();

        Random rand= new Random();
        int num=5;
        int num1=5;
        int[][] array=new int[num][num1];


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num1; j++) {
               // System.out.print("masukkan elemen baris ke-" + (i + 1) + " : " + "Kolom" + (j + 1) + ": ");
                array[i][j] = rand.nextInt((111111111));
            }
        }


        System.out.println("isi array adalah");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }

//
//        if (num >= 1) {
//            int j = x * (num + (num+1))%2;
//            System.out.println(j);
//        }else{
//            System.out.println("anggka kamu terlalu kecil");
//        }
//
//scanner.close();
    }
}

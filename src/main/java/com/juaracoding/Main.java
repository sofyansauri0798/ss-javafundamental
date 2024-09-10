package com.juaracoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            // Loop for sederhana
//

            int i=2;
        int c=7;
           int j=9;
        System.out.println(j);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.sum(j,c)*i);
        System.out.println(c*j+c/i);


        Scanner sc =new Scanner(System.in);
        System.out.print("masukan nama : ");
        String su= sc.nextLine();
        System.out.println(su);
        for ( i = 0; i < 13; i++) {
            System.out.println("ini nilai :" + i);
        }
        System.out.println("sudah selesai");
}
}
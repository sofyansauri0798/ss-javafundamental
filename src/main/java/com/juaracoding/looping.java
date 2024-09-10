package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 07/09/2024 16:39
@Last Modified 07/09/2024 16:39
Version 1.0
*/

import java.util.Random;

public class looping {
    public static void main(String[] args) {

char DataOne='?';
Long DataLong= Long.valueOf(DataOne);

        System.out.println("ini data Long "+DataLong);
        System.out.println();
    Random rand =new Random();

    int randInt =rand.nextInt(9999998);
    System.out.println("Angka acak (int) antara 0 sampai 11000001 : " + randInt+"\n");

    int randIntInRange = rand.nextInt(100)+1;
        System.out.println("angka acak (int) antara 1 dan 100  : "+randIntInRange+"\n");

        double randDouble =rand.nextDouble();
        System.out.println("nilai acak double : "+randDouble+"\n");

        boolean randBolean =rand.nextBoolean();
        System.out.println("angka boolean :"+randBolean+"\n");

        float randFolat =rand.nextFloat();
        System.out.println("angka float"+randFolat+"\n");

    }

}

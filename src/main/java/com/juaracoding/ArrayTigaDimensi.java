package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 07/09/2024 20:03
@Last Modified 07/09/2024 20:03
Version 1.0
*/

public class ArrayTigaDimensi{
    public static void main(String[] args) {
        int [][][] array3D= new int[3][3][3];

    int value =1;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k]=value++;
                }

            }

        }
        for (int i = 0; i < array3D.length; i++){
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.println(" elemen pada index ["+i+"]["+j+"]["+k+"]\t"+array3D[i][j][k]);

                }

            }

}

}


}
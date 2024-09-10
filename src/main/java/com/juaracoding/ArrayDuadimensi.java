package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 07/09/2024 19:19
@Last Modified 07/09/2024 19:19
Version 1.0
*/

public class ArrayDuadimensi {
    public static void main(String[] args) {
        int[][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[2][1]+"\n");

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]+"\t");

            }
            System.out.println();

        }

    }
}

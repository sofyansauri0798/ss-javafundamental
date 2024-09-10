package com.juaracoding;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 07/09/2024 18:34
@Last Modified 07/09/2024 18:34
Version 1.0
*/

public class CobaMatix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
            }
        }
        for (int a = 0; a < 3; a++) {
            System.out.println("Looping Level 1, iterasi ke: " + (a + 1));

            for (int b = 0; b < 5; b++) {
                System.out.println("Looping level 2, iterasi ke: " + (b + 1));

                for (int c = 0; c < 5; c++) {
                    System.out.println("Looping level 3, iterasi ke: " + (c + 1));
                    if (c % 2 == 0) {
                        System.out.println("ini index genap di lvel 3");

                    }
                    if (b == 2 && c == 3) {
                        System.out.println(" kondisi khusus b == 2 dan c == 3");
                        for (int d = 0; d < 4; d++) {
                            System.out.println(" Looping tambahan dalam keadaan khusus, iterasi ke : " + (d + 1));
                            if (d == 2) {
                                System.out.println(" Kondisi Tambahan ke d == 2 ");
                                for (int e = 0; e < 3; e++) {
                                    System.out.println(" Looping dalam kondisi tambahan, iterasi ke :" + (e + 1));

                                }

                            }

                        }

                    }

                }

            }
            System.out.println("\n" + "isi nilai matrix 5 x 5");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.println(matrix[i][j] + "\t");

                }
                System.out.println();
            }
        }
    }
}

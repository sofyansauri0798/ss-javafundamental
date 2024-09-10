package com.juaracoding.merapihkan_angka;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 10/09/2024 22:30
@Last Modified 10/09/2024 22:30
Version 1.0
*/

import java.util.Random;

public class test {
    public static void main(String[] args) {

        //ini for dan if
//        int intloop=0;
//
//        for (int i = 0; i < 10; i++) {
//            intloop++;
//            for (int j = 0; j < 20; j++) {
//                if (j == 10) {
//                    break;
//                }
//                intloop++;
//            } System.out.println(intloop);
//
//        }

        //ini untuk random
//        Random rand=new Random();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("random \t" + i+"->\t"+rand.nextInt(70));
//    }

        //choose
//
//       int intchoose=2;
//       switch (intchoose){
//           case 1:
//               System.out.println("ini satu");break;
//           case 2:
//               System.out.println("ini dua");break;
//           default:
//               System.out.println("selain satu atau dua");break;
//
//       }
//
//        //boolean
//        int intloop=0;
//        boolean isGood=true;
//        do {
//            intloop++;
//            continue;
//        }while (!isGood);
//        System.out.println(intloop);

//        boolean isRemainderOn=true;
//        int intVal=1200;
//        String strCuaca="Hujan";
//        String strExec="";
//        if (intVal >1500)
//            System.out.println(intVal);
//            System.out.println(strCuaca);
int angka =11;

        if (angka %2 == 0) {
            System.out.println("angka "+angka+"bilangan ganjil");
        }else {
            System.out.println("angka"+angka+"bilangan genap");
        }
    }
}

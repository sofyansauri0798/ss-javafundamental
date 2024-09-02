package com.juaracoding;

import java.util.ArrayList;
import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri is  Sofyan Sauri
Java Developer
Created on 30/08/2024 11:34
@Last Modified 30/08/2024 11:34
Version 1.0
*/
class Data{
    private String nama;
    private String alamat;
    private String noHp;

    public Data(String nama,String alamat,String noHp){
        this.nama = nama;
        this.alamat =alamat;
        this.noHp =noHp;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getNoHp(){
        return noHp;
    }
        }

public class Sof {
    private ArrayList<Data> data;

    public Sof(){
        this.data =new ArrayList<>();
    }
public void  tambahData(String nama, String alamat,String noHp){
        Data newData =new Data(nama,alamat,noHp);
        data.add(newData);
        System.out.println("data berhasil dimasukkan ! : )\n");
}

public void tampikanData(){
        if(data.isEmpty()){
            System.out.println("tidak ada data sayang ... !!\n \n");
        }else {
            for (Data d : data){
                System.out.println("Nama : " +d.getNama());
                System.out.println("Alamat : " +d.getAlamat());
                System.out.println("Nomer Hp : " +d.getNoHp()+"\n");
                System.out.println();
            }
        }
}

    public static void main(String[] args) {
        Sof db = new Sof();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("1.Tambah Data ");
            System.out.println("2.Tampil Data ");
            System.out.println("3.Keluar ");
            System.out.print("Pilih menu : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    System.out.println("\n"+"Masukkan Nama :");
                    String nama =scanner.nextLine();
                    System.out.println("Masukkan Alamat :");
                    String alamat =scanner.nextLine();
                    System.out.println("Masukkan Nomer HP :");
                    String noHp =scanner.nextLine();
                    db.tambahData(nama,alamat,noHp);
                    break;
                case 2:
                    db.tampikanData();
                    break;
                case 3:
                    System.out.println("Keluarrrrr...!!!! \n");
                    return;
                default:
                    System.out.println("Pilihan Kamu Salah Kawan....!!!\n");
            }
        }
    }
}

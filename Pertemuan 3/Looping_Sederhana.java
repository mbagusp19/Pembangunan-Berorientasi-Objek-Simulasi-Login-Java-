package com.pboreg;

import java.util.*;

public class Looping_Sederhana {

    public static void main (String[] args){

        // Program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();


        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

    }
}

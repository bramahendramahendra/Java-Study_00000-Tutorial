/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part00001;

/**
 *
 * @author Brama Hendra Mahendra
 */

import java.util.Scanner;

public class Variavel_Angka {
    public static void main(String[] args) {
        //penggunaan integer
        System.out.println("mengoutputkan masing-masing nilai integer : ");
        int angka1;
        int angka2;
        
        angka1 = 100;
        angka2 = 150;
        
        System.out.println("Angka Pertama adalah " + angka1);
        System.out.println("Angka Kedua   adalah " + angka2);
        
        System.out.println();
        
        //Penggunaan double dan menghitungnya
        System.out.println("Penggunaan double lalu menghitungnya : ");
        double nilai1;
        double nilai2;
        
        nilai1 = 13.15;
        nilai2 = 15.13;
        
        double jumlah  = nilai1+nilai2;
        
        System.out.println("Nilai ke-1 adalah  = " + nilai1 );
        System.out.println("Nilai ke-2 adalah  = " + nilai2 );
        System.out.println("Total nilai  = " + jumlah );

        System.out.println();

        //penggunaan float dan menghitungnya
        System.out.println("Penggunaan float lalu menghitungnya : ");
        float nilai11;
        float nilai12;
        
        nilai11 = 10.2f;
        nilai12 = 15.3f;
        
        float jumlahf  = nilai11+nilai12;
        
        System.out.println("Nilai ke-1 adalah  = " + nilai11 );
        System.out.println("Nilai ke-2 adalah  = " + nilai12 );
        System.out.println("Total nilai  = " + jumlahf );
        
        System.out.println();
        
        //input dan mengoutputkan angka
        //untuk menginputkan
        System.out.println("Menginputkan nilai integer lalu mengouptukannya dengan di jumlahkan : ");
        Scanner inputi = new Scanner(System.in);
        int Jumlahi;
        
        System.out.print("Masukkan Harga Produk = ");
        Jumlahi = inputi.nextInt();
        Jumlahi = Jumlahi + 100;
        
        System.out.print("Total ditambah dengan biaya kirim 100 adalah ");
        System.out.println(Jumlahi);
        
        System.out.println();
        
        //penggunaan variabel angka
        System.out.println("Penggunaan variabel angka daalam menghitung : ");
        double harga_cd = 5000;
        double biaya_kirim = 1000;
        double total;
        
        total = harga_cd + biaya_kirim;
        
        System.out.println("Harga cd Rp " + harga_cd);
        System.out.println("Biaya Kirim Rp " + biaya_kirim);
        System.out.println("Tagihan total Rp " + total);
    }
}

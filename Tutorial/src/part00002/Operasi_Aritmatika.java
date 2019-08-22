/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part00002;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Operasi_Aritmatika {
    public static void main(String[] args) {
        //Operasi Aritmatika 1
        System.out.println("Operasi Aritmatika 1 ");
        float angka1;
        float angka2;
        
        angka1 = 200;
        angka2 = 100;
        
        float tambah = angka1 + angka2;
        float kurang = angka1 - angka2;
        float kali = angka1 * angka2;
        float bagi = angka1 / angka2;
        
        System.out.println("Angka 1 = " + angka1);
        System.out.println("Angka 2 = " + angka2);
        System.out.println("Hasil Tambah = " + tambah);
        System.out.println("Hasil Kurang = " + kurang);
        System.out.println("Hasil Kali = " + kali);
        System.out.println("Hasil Bagi = " + bagi);
        
        System.out.println();
        
        //Operasi Aritmatika 2
        System.out.println("Operasi Aritmatika 2 ");
        int hasil = 1 + 2;
        //hasl sekarang bernilai 3
        System.out.println("1 + 2 = " + hasil);
        int hasil_asli = hasil;
        
        hasil = hasil - 1;
        //hasl sekarang bernilai 2
        System.out.println(hasil_asli + " - 1 = " + hasil);
        hasil_asli = hasil;
        
        hasil = hasil * 2;
        //hasl sekarang bernilai 4
        System.out.println(hasil_asli + " * 2 = " + hasil);
        hasil_asli = hasil;
        
        hasil = hasil / 2;
        //hasl sekarang bernilai 2
        System.out.println(hasil_asli + " / 2 = " + hasil);
        hasil_asli = hasil;
        
        hasil = hasil + 8;
        //hasl sekarang bernilai 10
        System.out.println(hasil_asli + " + 8 = " + hasil);
        hasil_asli = hasil;
        
        hasil = hasil % 7;
        //hasl sekarang bernilai 3
        System.out.println(hasil_asli + " % 7 = " + hasil);
    }
}

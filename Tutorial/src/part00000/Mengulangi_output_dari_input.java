/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part00000;

/**
 *
 * @author Brama Hendra Mahendra
 */

import java.util.Scanner;

public class Mengulangi_output_dari_input {
    public static void main(String[] args) {
        Scanner out = new Scanner (System.in);
        
        //Kode inputan untuk diulangi
        System.out.println("Masukkan inputan anda : ");
        
        //Kode untuk mengulangi apa yang diketikkan
        System.out.println(out.nextLine());
    }
}

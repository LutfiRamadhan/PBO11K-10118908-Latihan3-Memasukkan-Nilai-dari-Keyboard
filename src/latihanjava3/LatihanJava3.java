/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava3;

import java.util.Scanner;


/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 Karyawan
 */
public class LatihanJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Nama anda : ");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}

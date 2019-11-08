/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan58.tambangkurang;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program untuk menghitung penjumlahan dan selisih dari 2 angka
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        Bilangan b = new Bilangan();
        System.out.println("Hasil Selisih : " + b.getX() + " - " + b.getY() + " = " + (b.getX()-b.getY()));
    } 
}

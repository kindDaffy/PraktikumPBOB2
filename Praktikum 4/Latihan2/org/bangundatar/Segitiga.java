/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : Segitiga.java
Deskripsi   : Representasi dasar dari objek segitiga turunan dari kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
       
        this.alas  = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (0.5 * alas * tinggi);
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi : " + this.getJumlahSisi());
    }


}
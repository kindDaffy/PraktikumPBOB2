/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : bukuFiksi.java
*/

package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku{
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    public double getHarga(){
        return this.harga;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        super.view();
        System.out.println("buku dengan genre "+this.genre+" dan total halaman "+ this.getJumlahHalaman()+ " dengan harga "+this.getHarga());
    }
}
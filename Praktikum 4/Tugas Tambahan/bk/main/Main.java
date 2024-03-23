/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : Main.javas
*/

package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args){
        bukuAkademik Buku1 = new bukuAkademik("Pemrograman Java", "John Doe", "2022", "Pemrograman", 101, 300000);
        bukuNovel Buku2 = new bukuNovel("Laskar Pelangi", "Andrea Hirata", "2005", "Novel", 99, 60000);

        Buku1.view();
        Buku2.view();
    }
}
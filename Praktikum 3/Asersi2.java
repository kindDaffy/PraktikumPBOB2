/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : Asersi2.java
Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

import static java.lang.Math.PI;

class Lingkaran{
    private double jejari;
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        double keliling = 2*PI*jejari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = -2;
        assert (jariJari>0): "jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+ kelilingLingkaran);
    }
}

/*
Secara konsep kesalahan terjadi saat assert tidak menangani kondisi jika jari jari kurang dari nol, sehingga jika kurang dari nol akan tetap mencetak "jari jari tidak boleh nol"
*/
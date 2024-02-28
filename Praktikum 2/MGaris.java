/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : MGaris.java 
Deskripsi   : Main class dari program garis
*/

public class MGaris{
    public static void main(String[] args){
        Titik t1,t2,t3,t4;
        Garis g1,g2,g3;

        t1 = new Titik(-1,1);  
        t2 = new Titik(0,0);
        t3 = new Titik(2,2);
        t4 = new Titik(3,3);
        
        g1 = new Garis(t1,t2);
        g3 = new Garis(t3, t4);
        g2 = g1.getrefleksiY();
        
        System.out.println(g1.getTitikAkhir().getAbsis());
        System.out.println(g1.getTitikAkhir().getOrdinat());
        System.out.println(g2.getTitikAkhir().getAbsis());
        System.out.println(g2.getTitikAkhir().getOrdinat());
        System.out.println(g1.getPanjang());
        System.out.println(g3.getGradien());
        System.out.println(g1.getGradien());
        System.out.println(g3.IstegakLurus(g1));
    }
}
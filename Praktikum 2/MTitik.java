/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : MTitik.java 
Deskripsi   : Main class dari program titik
*/

public class MTitik {
    public static void main(String[] args) {
       Titik t1 = new Titik(2, 3);
       Titik t2 = new Titik(5, 7);

       Garis g1 = new Garis(t1, t2);

       double jarak = t1.getJarakPusat();
       System.out.println("Jarak ke pusat: " + jarak);

       t1.refleksiX();
       System.out.println("Titik setelah refleksi X: " + t1.getAbsis());
       t1.refleksiY();
       System.out.println("Titik setelah refleksi Y: " + t1.getOrdinat());

       int tRefleksiX = t1.getRefleksiX().getAbsis();
       System.out.println("Titik refleksi X: " + tRefleksiX);
       int tRefleksiY = t1.getRefleksiY().getOrdinat();
       System.out.println("Titik refleksi Y: " + tRefleksiY);

       System.out.println(g1); 
       System.out.println("Panjang garis: " + g1.getPanjang()); 
       System.out.println("Gradien garis: " + g1.getGradien()); 

       int gRefleksiY = g1.getRefleksiY().geTitikAwal().getAbsis();
       System.out.println("Garis refleksi Y: " + gRefleksiY); 

       Garis g3 = new Garis(t1, new Titik(2, 7));
       System.out.println("Apakah g1 tegak lurus dengan g3? " + g1.isTegakLurus(g3)); 
   }
}

/*
Kesimpulan  : Dengan menggunakan enkapsulasi, kode jadi lebih terstruktur dan lebih aman
 */
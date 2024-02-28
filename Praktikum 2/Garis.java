/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : Garis.java 
Deskripsi   : Program garis
*/

public class Garis{
    private Titik titikAwal,titikAkhir;

    public Garis (Titik titikAwal,Titik titikAkhir){
        this.titikAwal=titikAwal;
        this.titikAkhir=titikAkhir;
    }

    public void setTitikAwal(Titik t){
        titikAwal = t;
    }
    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }
    public Titik getTitikAwal( ){
        return titikAwal;
    }
    public Titik getTitikAkhir( ){
        return titikAkhir;
    }

    public double getPanjang(){
        double x = getTitikAkhir().getAbsis()-getTitikAwal().getAbsis();
        double y = getTitikAkhir().getOrdinat()-getTitikAwal().getOrdinat();
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }


    public double getGradien(){
        return (titikAkhir.getOrdinat())-(titikAwal.getOrdinat())/(titikAkhir.getAbsis()- titikAwal.getAbsis());
    }

    public Garis getrefleksiY(){
        return new Garis(getTitikAwal().getRefleksiY(),getTitikAkhir().getRefleksiY());
        
    }

    public boolean IstegakLurus(Garis g){
        return getGradien() == -1/g.getGradien();
    }

}


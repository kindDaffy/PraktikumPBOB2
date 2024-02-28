/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : Titik.java 
Deskripsi   : Program titik
*/

class Titik {
    private int absis;
    private int ordinat;

    public Titik(int absis, int ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public int getAbsis() {
        return absis;
    }

    public int getOrdinat() {
        return ordinat;
    }

    public double getJarakPusat() {
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

    public void refleksiX() {
        absis = -absis;
    }

    public void refleksiY() {
        ordinat = -ordinat;
    }

    public Titik getRefleksiX() {
        Titik t = new Titik(-absis, ordinat);
        return t;
    }

    public Titik getRefleksiY() {
        Titik t = new Titik(absis, -ordinat);
        return t;
    }
}
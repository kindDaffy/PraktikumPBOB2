/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : MprismaSegitiga.java
Deskripsi   : Main class dari program prisma segitiga
*/

class MPrismaSegitiga {
    public static void main(String[] args) {
      
        //instansiasi segitiga sebagai alas
        Segitiga segitiga = new Segitiga(5, 8);
        
        //instansiasi prisma
        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 5);
        
        //volume prisma
        double volume = prisma.hitungVolume();
        
        //luas permukaan prisma
        double luasPermukaan = prisma.hitungLuasPermukaan();

        System.out.println("Alas segitiga     : " + segitiga.getAlas());
        System.out.println("Tinggi segitiga   : " + segitiga.getTinggiSegitiga());
        System.out.println("Luas segitiga     : " + segitiga.hitungLuas());
        System.out.println("Volume  : " + volume);
        System.out.println("Luas permukaan  : " + luasPermukaan);

    }
}
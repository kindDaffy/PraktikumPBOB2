/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : prismaSegitiga.java
Deskripsi   : Program class prisma segitiga
*/

 class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggi){
        this.alas = alas;
        this.tinggiPrisma = tinggi;
    }

    public double hitungVolume(){
        return (0.5 * alas.hitungLuas() * tinggiPrisma);
    }

    public double hitungLuasPermukaan(){
        double luasAlas = alas.hitungLuas();
        double sisi1 = Math.sqrt(Math.pow(alas.getAlas() / 2, 2) + Math.pow(tinggiPrisma, 2));
        double luasSamping = alas.getAlas() * sisi1;
        double luasTotal = luasAlas + 3 * luasSamping;
        return Double.parseDouble(String.format("%.2f", luasTotal));
    }
    
}
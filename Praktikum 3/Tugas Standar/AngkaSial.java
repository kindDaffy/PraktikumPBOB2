/*
Nama        : Muhammad Daffa Aradhana Adriansyah
NIM         : 24060122120022
Nama File   : AngkaSial.java
Deskripsi   : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(13);
            as.cobaAngka(10);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
Ketika terjadi eksepsi, perintah cetak "bukan angka sial" tidak lagi dieksekusi karena akan masuk ke kondisional if dan langsung masuk ke AngkaSialException
kemudian karena terjadi eksepsi, maka pada main akan langsung masuk ke catch dan mengeksekusi ase.getMessage()
*/
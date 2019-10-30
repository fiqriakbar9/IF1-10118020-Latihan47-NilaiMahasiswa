/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan nilai mahasiswa
 * full hingga indeks dan keterangannya
 * 
 */
public class Utama {
    
    public static void main(String[] args){
    Nilai nilai1 = new Nilai();
    
    nilai1.setQuiz(75);
    nilai1.setUts(45);
    nilai1.setUas(34);
    
        System.out.println("QUIZ\t\t\t = "+nilai1.getQuiz());
        System.out.println("UTS\t\t\t = "+nilai1.getUts());
        System.out.println("UAS\t\t\t = "+nilai1.getUas());
        System.out.println("\nNilai Akhir\t\t = "+nilai1.NilaiAkhir());
        System.out.println("\nIndex = "+nilai1.NilaiIndex(nilai1.NilaiAkhir()));
        System.out.println("Keterangan = "+nilai1.IndexKeterangan(nilai1.NilaiIndex(nilai1.NilaiAkhir())));
        System.out.println("=================================================");
     
    // NILAI KE DUA   
    Nilai nilai2 = new Nilai();
    
    nilai2.setQuiz(60);
    nilai2.setUts(80);
    nilai2.setUas(75);
    
        System.out.println("\nQUIZ\t\t\t = "+nilai2.getQuiz());
        System.out.println("UTS\t\t\t = "+nilai2.getUts());
        System.out.println("UAS\t\t\t = "+nilai2.getUas());
        System.out.println("\nNilai Akhir\t\t = "+nilai2.NilaiAkhir());
        System.out.println("\nIndex = "+nilai2.NilaiIndex(nilai2.NilaiAkhir()));
        System.out.println("Keterangan = "+nilai2.IndexKeterangan(nilai2.NilaiIndex(nilai2.NilaiAkhir())));
        System.out.println("=================================================");
     
   // NILAI KE TIGA
   Nilai nilai3 = new Nilai();
    
    nilai3.setQuiz(30);
    nilai3.setUts(80);
    nilai3.setUas(40);
    
        System.out.println("\nQUIZ\t\t\t = "+nilai3.getQuiz());
        System.out.println("UTS\t\t\t = "+nilai3.getUts());
        System.out.println("UAS\t\t\t = "+nilai3.getUas());
        System.out.println("\nNilai Akhir\t\t = "+nilai3.NilaiAkhir());
        System.out.println("\nIndex = "+nilai3.NilaiIndex(nilai3.NilaiAkhir()));
        System.out.println("Keterangan = "+nilai3.IndexKeterangan(nilai3.NilaiIndex(nilai3.NilaiAkhir())));
        System.out.println("=================================================");
        System.out.println("\nDeveloped By : Fiqri Akbar Pratama");
    }
    

    
}

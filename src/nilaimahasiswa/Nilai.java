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
public class Nilai {
    private double quiz;
    private double uts;
    private double uas;
    private String index;
    private String keterangan;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double NilaiAkhir(){
        return (quiz*0.2)+(uts*0.3)+(uas*0.5);
    }
    
    public String NilaiIndex(double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
            index = "A";
        } else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
            index = "B";
        } else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
            index = "C";
        } else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
            index = "D";
        } else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
            index = "E";
        } 
        return index;
    }
    
    public String IndexKeterangan(String parIndex){
        if(parIndex.equals("A")){
            keterangan = "Sangat Baik";
        } else if(parIndex.equals("B")){
            keterangan = "Baik";
        } else if(parIndex.equals("C")){
            keterangan = "Cukup";
        } else if(parIndex.equals("D")){
            keterangan = "Kurang";
        } else if(parIndex.equals("E")){
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}

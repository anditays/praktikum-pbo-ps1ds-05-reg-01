/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul09.Unguided;

/**
 *
 * @author andit
 */
public class HasilEksperimen implements Comparable<HasilEksperimen> {

    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    // Static variable untuk menghitung jumlah eksperimen
    private static int jumlahEksperimen = 0;

    // Constructor
    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;

        jumlahEksperimen++;
    }

    // Getter
    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static method
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    // Default sorting berdasarkan akurasi tertinggi
    @Override
    public int compareTo(HasilEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    // Menampilkan data
    @Override
    public String toString() {
        return "Model=" + namaModel
                + ", akurasi=" + akurasi
                + ", waktu=" + waktuTraining + " detik";
    }
}
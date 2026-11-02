/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public abstract class TiketBioskop implements ItemTransaksi {

    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    // Constructor
    public TiketBioskop(String judulFilm, double hargaDasar, int jumlahKursi) {
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    // Getter
    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // Abstract method
    public abstract double hitungTotalBayar();

    @Override
    public abstract String getNamaTransaksi();

    // Implementasi interface
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}
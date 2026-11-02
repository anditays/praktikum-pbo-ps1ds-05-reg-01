/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public class TiketVIP extends TiketBioskop {

    private double biayaFasilitasVIP;

    // Constructor
    public TiketVIP(String judulFilm, double hargaDasar,
            int jumlahKursi, double biayaFasilitasVIP) {

        super(judulFilm, hargaDasar, jumlahKursi);
        this.biayaFasilitasVIP = biayaFasilitasVIP;
    }

    // Getter
    public double getBiayaFasilitasVIP() {
        return biayaFasilitasVIP;
    }

    // Menghitung total pembayaran tiket VIP
    @Override
    public double hitungTotalBayar() {
        return (getHargaDasar() + biayaFasilitasVIP)
                * getJumlahKursi();
    }

    // Menampilkan nama transaksi
    @Override
    public String getNamaTransaksi() {
        return "Tiket VIP Premiere - " + getJudulFilm()
                + " (" + getJumlahKursi() + " x Rp"
                + (getHargaDasar() + biayaFasilitasVIP) + ")";
    }
}
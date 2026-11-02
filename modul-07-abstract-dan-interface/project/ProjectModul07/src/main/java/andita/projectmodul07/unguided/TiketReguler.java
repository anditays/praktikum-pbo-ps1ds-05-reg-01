/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public class TiketReguler extends TiketBioskop {

    private int nomorStudio;

    // Constructor
    public TiketReguler(String judulFilm, double hargaDasar,
            int jumlahKursi, int nomorStudio) {

        super(judulFilm, hargaDasar, jumlahKursi);
        this.nomorStudio = nomorStudio;
    }

    // Getter
    public int getNomorStudio() {
        return nomorStudio;
    }

    // Menghitung total pembayaran tiket reguler
    @Override
    public double hitungTotalBayar() {
        return getHargaDasar() * getJumlahKursi();
    }

    // Menampilkan nama transaksi
    @Override
    public String getNamaTransaksi() {
        return "Tiket Reguler (Studio " + nomorStudio + ") - "
                + getJudulFilm() + " (" + getJumlahKursi()
                + " x Rp" + getHargaDasar() + ")";
    }
}
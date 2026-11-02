/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public class PaketSnack implements ItemTransaksi {

    private String namaPaket;
    private int jumlahPorsi;
    private double hargaPerPorsi;

    // Constructor
    public PaketSnack(String namaPaket, int jumlahPorsi,
            double hargaPerPorsi) {

        this.namaPaket = namaPaket;
        this.jumlahPorsi = jumlahPorsi;
        this.hargaPerPorsi = hargaPerPorsi;
    }

    // Getter
    public String getNamaPaket() {
        return namaPaket;
    }

    public int getJumlahPorsi() {
        return jumlahPorsi;
    }

    public double getHargaPerPorsi() {
        return hargaPerPorsi;
    }

    // Menghitung total pembayaran snack
    @Override
    public double getNominalBayar() {
        return jumlahPorsi * hargaPerPorsi;
    }

    // Menampilkan nama transaksi
    @Override
    public String getNamaTransaksi() {
        return "F&B Snack: " + namaPaket + " ("
                + jumlahPorsi + " x Rp" + hargaPerPorsi + ")";
    }
}
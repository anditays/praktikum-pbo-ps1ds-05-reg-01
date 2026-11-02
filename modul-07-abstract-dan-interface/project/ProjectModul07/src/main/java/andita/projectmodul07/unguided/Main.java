/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public class Main {

    public static void main(String[] args) {

        // Pengujian proteksi abstract class
        // TiketBioskop tiket = new TiketBioskop("Interstellar", 40000, 2);

        // Membuka kasir
        ItemTransaksi.catatLogKasir(
                "Membuka transaksi baru untuk Pelanggan #042.");

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        // Membuat objek transaksi
        TiketReguler reguler = new TiketReguler(
                "Interstellar", 40000, 2, 3);

        TiketVIP vip = new TiketVIP(
                "Dune: Part Two", 60000, 2, 25000);

        PaketSnack snack = new PaketSnack(
                "Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // Array polimorfik
        ItemTransaksi[] items = new ItemTransaksi[3];

        items[0] = reguler;
        items[1] = vip;
        items[2] = snack;

        // Menghitung total seluruh transaksi
        double grandTotal = 0;

        for (ItemTransaksi item : items) {

            item.cetakRincianItem();

            grandTotal += item.getNominalBayar();
        }

        // Menampilkan grand total
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");

        // Menutup kasir
        ItemTransaksi.catatLogKasir(
                "Transaksi #042 selesai diproses.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.unguided;

/**
 *
 * @author andit
 */
public interface ItemTransaksi {

    double getNominalBayar();

    String getNamaTransaksi();

    // Default method untuk mencetak rincian transaksi
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi()
                + " | Total: Rp" + getNominalBayar());
    }

    // Static method untuk mencatat aktivitas kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}

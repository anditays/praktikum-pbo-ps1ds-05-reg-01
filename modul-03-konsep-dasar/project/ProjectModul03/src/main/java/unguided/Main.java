/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author andit
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("\nIndex hari kosong (dimulai dari 0): " + indexKosong);

        pengolah.isiDataKosong();

        System.out.println("\n=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.printf("\nRata-rata : %.2f°C\n", pengolah.hitungRataRata());

        System.out.println("\nIsi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        
        /* 
         * Array di Java bertipe reference. Saat object PengolahSuhu dibuat, 
         * constructor menyimpan referensi memori yang sama dari array di main, bukan menyalin nilainya. 
         * Sehingga perubahan yang terjadi pada array di dalam object otomatis 
         * terlihat juga dan mengubah array asli yang ada di main.
         */
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.modul04.unguided.main;

import andita.modul04.unguided.laporan.Laporan;
import andita.modul04.unguided.model.Dataset;

public class Main {

    public static void main(String[] args) {
        // objek 1: constructor kosong + setter
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        // objek 2: constructor 1 parameter
        Dataset d2 = new Dataset("Wine Quality");

        // objek 3: constructor lengkap
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        // simpan dalam array
        Dataset[] daftar = {d1, d2, d3};

        // cetak dengan perulangan
        Laporan laporan = new Laporan();
        for (Dataset d : daftar) {
            laporan.cetak(d);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
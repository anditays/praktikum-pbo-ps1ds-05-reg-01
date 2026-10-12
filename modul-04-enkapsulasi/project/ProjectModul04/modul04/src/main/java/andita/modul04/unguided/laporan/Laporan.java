package andita.modul04.unguided.laporan;

import andita.modul04.unguided.model.Dataset;
import java.util.Locale;

public class Laporan {

    public void cetak(Dataset d) {
        String status = d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";

        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.println(String.format(Locale.US, "Missing      : %d sel (%.2f%%)",
                d.getJumlahMissing(), d.getPersentaseMissing()));
        System.out.println("Status       : " + status);
        System.out.println();
    }
}
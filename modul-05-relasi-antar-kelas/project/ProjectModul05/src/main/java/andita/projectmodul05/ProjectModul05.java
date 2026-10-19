
package andita.projectmodul05;

import andita.projectmodul05.guided.agregasi.Jurusan;
import andita.projectmodul05.guided.agregasi.Mahasiswa;
import andita.projectmodul05.guided.komposisi.Komputer;

public class ProjectModul05 {

    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN AGREGASI ===");
        runGuided2();

        System.out.println();

        System.out.println("=== PENGUJIAN KOMPOSISI ===");
        runGuided3();
    }

    public static void runGuided1() {
        // Untuk asosiasi
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("103132400016", "Andita");
        Mahasiswa m2 = new Mahasiswa("10313240000", "Ayuningtyas");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();
    }

    public static void runGuided3() {
        Komputer pc = new Komputer(
            "Intel Core i9",
            3200,
            "Lenovo 14 inch",
            "Logitech",
            "Wireless"
        );

        pc.displaySpecKomputer();
    }
}

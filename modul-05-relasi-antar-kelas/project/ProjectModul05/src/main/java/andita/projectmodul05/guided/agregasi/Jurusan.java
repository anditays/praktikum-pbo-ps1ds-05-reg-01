/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package andita.projectmodul05.guided.agregasi;

/**
 *
 * @author andit
 */
public class Jurusan {
    private int jumlahMahasiswa = 0;
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];

    //Constractor 
    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }
    
    //Behaviour
    public void addMahasiswa(Mahasiswa m) {
    if (jumlahMahasiswa < daftarMahasiswa.length) {
        daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    } else {
        System.out.println("Daftar mahasiswa sudah penuh.");
    }
}
    
    public void displayMahasiswa(){
        System.out.println("Kode Jurusan: " + this.kodeJurusan);
        System.out.println("Nama Jurusan: " + this.namaJurusan);
        
        System.out.println("Daftar Mahasiswa: ");
        
        for (int i = 0; i<jumlahMahasiswa;i++){
            System.out.println(i+1 + "." + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
        }
    }
    
    //Getter 
    public String getKodeJurusan(){
        return kodeJurusan;
    }
    
    public String getNamaJurusan(){
        return namaJurusan;
    }
    
    //Setter 
    public void setKodeJurusan(String kodeJurusan){
        this.kodeJurusan = kodeJurusan;
    }
    
    public void setNamaJurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
}
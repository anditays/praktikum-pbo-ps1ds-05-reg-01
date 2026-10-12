/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.modul04.guided1.manusia;

public class Manusia {
//definisi atribut

    private String nama;
    private int umur;
    
    // 4.2 constructor
    public Manusia(){};
    public Manusia(String nama){
        this.nama =nama;
    }
    
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
//definisi Method
//method setter
    public void setNama(String a) {
        nama = a;
    }

//method getter
    public String getNama() {
        return nama;
    }

 //method setter
    public void setUmur(int a) {
        umur = a;
    }

    //method getter
    public int getUmur() {
        return umur;
    }
}

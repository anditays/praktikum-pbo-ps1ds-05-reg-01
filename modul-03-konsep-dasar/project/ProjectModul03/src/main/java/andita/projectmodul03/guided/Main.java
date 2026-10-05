/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul03.guided;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek 'lingkaran' dari class Circle01
        Circle01 lingkaran = new Circle01();

        // 2. Memberikan nilai jari-jari (r)
        lingkaran.r = 10.0;

        // 3. Menampilkan hasil perhitungan
        System.out.println("Jari-jari: " + lingkaran.r);
        System.out.println("Luas Lingkaran: " + lingkaran.area());
        System.out.println("Keliling Lingkaran: " + lingkaran.circumference());
        
        // 4. (Opsional) Menguji metode konversi radian ke derajat
        double radian = 1.0;
        System.out.println(radian + " Radian = " + Circle01.radiansToDegrees(radian) + " Derajat");
    }
}
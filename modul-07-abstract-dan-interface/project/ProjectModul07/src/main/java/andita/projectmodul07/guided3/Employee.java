/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.guided3;

/**
 *
 * @author andit
 */
//fondasi umum yang belum memiliki peran spesifik sehingga tidak boleh diinstansiasi langsung
public abstract class Employee implements Payable{ 

    private String name;

    //constructur
    public Employee(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //method, Setiap pegawai pasti punya gaji, tapi rumusnya berbeda-beda
    public abstract double earnings();
    
    //saat ada penagihan, alihkan langsung ke metode kalkulasi gaji (earnings)
    @Override
    public double getPaymentAmount(){
        return earnings();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.guided1;

/**
 *
 * @author andit
 */
public class Main {
    
    public static void main(String[]args){
        SalariedEmployee salaried = new SalariedEmployee("Andita", 5000000);
        System.out.println("Nama: "+salaried.getName());
        System.out.println("Gaji: Rp "+ salaried.earnings());
    }
}

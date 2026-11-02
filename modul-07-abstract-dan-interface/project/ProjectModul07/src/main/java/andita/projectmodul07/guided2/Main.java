/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.guided2;

/**
 *
 * @author andit
 */

public class Main {
    public static void main(String[]args){
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("Andita", 5000000);
        
        //Dynamic dispatch: Java otomatis mengeksekusi rumus yang tepat
        for (Payable item : items){
            System.out.println("Jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
            
        }
    }
}
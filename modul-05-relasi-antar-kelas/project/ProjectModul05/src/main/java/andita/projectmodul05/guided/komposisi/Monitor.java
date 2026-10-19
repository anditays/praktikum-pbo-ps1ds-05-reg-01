/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul05.guided.komposisi;

/**
 *
 * @author andit
 */

public class Monitor {
    private String brand;
    
    public Monitor(String brand){
        this.brand = brand;
    }

   public void displaySpec() {
    System.out.println(this.brand);
   }
}
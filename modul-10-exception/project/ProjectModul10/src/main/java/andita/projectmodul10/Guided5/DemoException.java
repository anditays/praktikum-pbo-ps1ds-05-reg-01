/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul10.Guided5;

/**
 *
 * @author andit
 */
public class DemoException {
    
    public static void main(String[] args) {
        Coba c = new Coba();
        
        try {
            c.tampil();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Program selesai");
        }
    }
}
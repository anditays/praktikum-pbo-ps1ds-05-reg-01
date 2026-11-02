/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul07.guided1;

/**
 *
 * @author andit
 */
public abstract class Employee {
    private String name; 
    
    public Employee(String name){
        this.name = name; 
    }
    
    public String getName(){
        return name;
    }
    
    //setiap pegawai pasti punya gaji, tapi rumusnya beda-beda 
    public abstract double earnings();
    
}

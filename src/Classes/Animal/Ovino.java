/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

/**
 *
 * @author samue
 */
public class Ovino extends Animal{
    
    public Ovino(String id, int edad, String salud, double peso) {
        super("OV" + id, edad, salud, peso);
        this.tipo = "Ovino";
    }   
}

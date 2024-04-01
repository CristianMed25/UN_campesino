/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

/**
 *
 * @author samue
 */
public class Pez extends Animal{
    
    public Pez(String id, int edad, String salud, double peso) {
        super("F" + id, edad, salud, peso); //F: Fisch
        this.tipo = "Pez";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

/**
 *
 * @author samue
 */
public class Caballo extends Animal{
    
    public Caballo(String id, int edad, String salud, double peso) {
        super("C" + id, edad, salud, peso);
        this.tipo = "Caballo";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Cultivo;

import Classes.Tarea;
import structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Cereal extends Cultivo{
    
    public Cereal(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("C" + id, nombre, necesidades);
        this.tipo = "Cereal";
    }
    

    

    
}

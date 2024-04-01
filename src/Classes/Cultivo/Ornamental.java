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
public class Ornamental extends Cultivo{
    
    public Ornamental(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("OR" + id, nombre, necesidades);
        this.tipo = "Ornamental";
    }
    

    
    
}

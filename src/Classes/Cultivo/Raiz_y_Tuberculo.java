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
public class Raiz_y_Tuberculo extends Cultivo{
    
    public Raiz_y_Tuberculo(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("RT" + id, nombre, necesidades);
        this.tipo = "Raiz y Tuberculo";
    }
    
    
}

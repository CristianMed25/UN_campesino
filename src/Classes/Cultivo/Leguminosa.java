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
public class Leguminosa extends Cultivo{
    
    public Leguminosa(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("L" + id, nombre, necesidades);
        this.tipo = "Leguminosa";
    }
}

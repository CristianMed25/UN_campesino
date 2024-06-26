/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Cultivo;

import Classes.Tarea;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public abstract class Cultivo implements Serializable{
    protected String id;
    protected String nombre;
    protected String tipo;
    protected DynamicArrayList<Tarea> necesidades;

    public Cultivo(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        this.id = "C"+ id;
        this.nombre = nombre;
        this.necesidades = necesidades;
    }
    
    public Cultivo(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DynamicArrayList<Tarea> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(DynamicArrayList<Tarea> necesidades) {
        this.necesidades = necesidades;
    } 
    
    public String printNecesidades(DynamicArrayList<Tarea> necesidades){
        necesidades.print();
        return "";
    }

    @Override
    public String toString() {
        return "\nCultivo{" + "\nid: " + id + "\nnombre: " + nombre + "\ntipo=" + tipo + "\nnecesidades: {" + printNecesidades(necesidades) + '}';
    }
}

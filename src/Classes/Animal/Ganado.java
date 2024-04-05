/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

import Classes.Tarea;
import Structures.Doubly.DoublyLinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Ganado implements Serializable{
    protected String id;
    private String animal;
    protected DynamicArrayList<Tarea> necesidades;

    public Ganado(String id, Animal animal, DynamicArrayList<Tarea> necesidades) {
        this.id = "G" + id;
        this.animal = animal.getTipo();
        this.necesidades = necesidades;
    }
    
    public Ganado(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public DynamicArrayList<Tarea> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(DynamicArrayList<Tarea> necesidades) {
        this.necesidades = necesidades;
    }
    
    public void escribir(DoublyLinkedList<Ganado> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Ganado.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Ganado> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Ganado.dat"));
            DoublyLinkedList<Ganado> datosRecuperados = (DoublyLinkedList<Ganado>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }   
    
        public void escribirNecesidad(DynamicArrayList<Tarea> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Tareas/necesidadesGanado.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DynamicArrayList<Tarea> leerNecesidad(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Tareas/necesidadesGanado.dat"));
            DynamicArrayList<Tarea> datosRecuperados = (DynamicArrayList<Tarea>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }   
    
    public String printNecesidades(DynamicArrayList<Tarea> necesidades){
        necesidades.print();
        return "a";
    }

    @Override
    public String toString() {
        return "\nGanado{" + "id=" + id + ", animal=" + animal + ", necesidades=" + printNecesidades(necesidades) + '}';
    }  
}

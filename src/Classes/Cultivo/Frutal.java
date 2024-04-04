/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Cultivo;

import Classes.Animal.Bovino;
import Classes.Tarea;
import Structures.Doubly.DoublyLinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Frutal extends Cultivo{

    public Frutal(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("F" + id, nombre, necesidades);
        this.tipo = "Frutal";
    }
        
    public Frutal(){}
    
    public void escribir(DoublyLinkedList<Frutal> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Frutal.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Frutal> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Frutal.dat"));
            DoublyLinkedList<Frutal> datosRecuperados = (DoublyLinkedList<Frutal>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    

    
}

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
public class Oleaginosa extends Cultivo{
    
    public Oleaginosa(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("OL" + id, nombre, necesidades);
        this.tipo = "Oleaginosa";
    }
        
    public Oleaginosa(){}
    
    public void escribir(DoublyLinkedList<Oleaginosa> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Oleaginosa.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Oleaginosa> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Oleaginosa.dat"));
            DoublyLinkedList<Oleaginosa> datosRecuperados = (DoublyLinkedList<Oleaginosa>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    
    
}

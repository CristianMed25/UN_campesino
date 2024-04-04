/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Cultivo;

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
public class Ornamental extends Cultivo{
    
    public Ornamental(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("OR" + id, nombre, necesidades);
        this.tipo = "Ornamental";
    }
    public Ornamental(){}
    
    public void escribir(DoublyLinkedList<Ornamental> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Ornamental.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Ornamental> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Ornamental.dat"));
            DoublyLinkedList<Ornamental> datosRecuperados = (DoublyLinkedList<Ornamental>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
    
}

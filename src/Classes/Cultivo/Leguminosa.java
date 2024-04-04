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
public class Leguminosa extends Cultivo{
    
    public Leguminosa(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("L" + id, nombre, necesidades);
        this.tipo = "Leguminosa";
    }
        
    public Leguminosa(){}
    
    public void escribir(DoublyLinkedList<Leguminosa> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Leguminosa.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Leguminosa> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Leguminosa.dat"));
            DoublyLinkedList<Leguminosa> datosRecuperados = (DoublyLinkedList<Leguminosa>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

}


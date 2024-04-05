/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

import Structures.Doubly.DoublyLinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author samue
 */
public class Porcino extends Animal{
    public Porcino(String id, int edad, String salud, double peso) {
        super("P" + id, edad, salud, peso);
        this.tipo = "Porcino";
    }
    
    public Porcino(){
        this.tipo = "Porcino";
    }
    
     public void escribir(DoublyLinkedList<Porcino> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Porcino.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

     public DoublyLinkedList<Porcino> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Porcino.dat"));
            DoublyLinkedList<Porcino> datosRecuperados = (DoublyLinkedList<Porcino>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }
  
}

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
public class Pez extends Animal{
    
    public Pez(String id, int edad, String salud, double peso) {
        super("F" + id, edad, salud, peso); //F: Fisch
        this.tipo = "Pez";
    }
    
    public Pez(){
        this.tipo = "Pez";
    }

    public void escribir(DoublyLinkedList<Pez> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Pez.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Pez> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Pez.dat"));
            DoublyLinkedList<Pez> datosRecuperados = (DoublyLinkedList<Pez>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
     } 
}

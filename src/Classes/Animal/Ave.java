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
public class Ave extends Animal{
    
    public Ave(String id, int edad, String salud, double peso) {
        super("A" + id, edad, salud, peso);
        this.tipo = "Ave";
    }

    public Ave() {
    }
    
    public void escribir(DoublyLinkedList<Ave> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Ave.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Ave> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Ave.dat"));
            DoublyLinkedList<Ave> datosRecuperados = (DoublyLinkedList<Ave>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
}

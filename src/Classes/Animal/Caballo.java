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
public class Caballo extends Animal{
    
    public Caballo(String id, int edad, String salud, double peso) {
        super("C" + id, edad, salud, peso);
        this.tipo = "Caballo";
    }
    
    public Caballo(){}
    
    public void escribir(DoublyLinkedList<Caballo> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Caballo.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Caballo> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Caballo.dat"));
            DoublyLinkedList<Caballo> datosRecuperados = (DoublyLinkedList<Caballo>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
}

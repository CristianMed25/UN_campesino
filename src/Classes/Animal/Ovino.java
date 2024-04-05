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
public class Ovino extends Animal{
    
    public Ovino(String id, int edad, String salud, double peso) {
        super("OV" + id, edad, salud, peso);
        this.tipo = "Ovino";
    }   
    
    public Ovino(){
        this.tipo = "Ovino";
    }
    
   public void escribir(DoublyLinkedList<Ovino> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Ovino.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Ovino> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Ovino.dat"));
            DoublyLinkedList<Ovino> datosRecuperados = (DoublyLinkedList<Ovino>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
}

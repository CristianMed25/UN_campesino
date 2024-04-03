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
public class Bovino extends Animal{
    
    public Bovino(String id, int edad, String salud, double peso) {
        super("BV" + id, edad, salud, peso);
        this.tipo = "Bovino";
    }
    
    public Bovino(){}
    
    public void escribir(DoublyLinkedList<Bovino> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Bovino.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Bovino> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Bovino.dat"));
            DoublyLinkedList<Bovino> datosRecuperados = (DoublyLinkedList<Bovino>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

}

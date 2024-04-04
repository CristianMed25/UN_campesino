/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;

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
public class Veterinario extends Consultor{
    
    public Veterinario(String id, String nombre, String user, String pasword) {
        super("V"+id, nombre, user, pasword);
    }
           
    
    public Veterinario(){}
    
    public void escribir(DoublyLinkedList<Veterinario> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Veterinario.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Veterinario> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Veterinario.dat"));
            DoublyLinkedList<Veterinario> datosRecuperados = (DoublyLinkedList<Veterinario>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
}

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
public class Consultor extends Usuario{
    
    public Consultor(String id, String nombre, String user, String pasword) {
        super("C" + id, nombre, user, pasword);
    }
           
    
    public Consultor(){}
    
    public void escribir(DoublyLinkedList<Consultor> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Consultor.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Consultor> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Consultor.dat"));
            DoublyLinkedList<Consultor> datosRecuperados = (DoublyLinkedList<Consultor>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
}

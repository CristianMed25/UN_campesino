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
public class Campesino extends Usuario{
    
    public Campesino(String id, String nombre, String user, String pasword) {
        super("CAMPESINO" + id, nombre, user, pasword);
    }
        
    
    public Campesino(){}
    
    public void escribir(DoublyLinkedList<Campesino> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Campesino.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Campesino> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Campesino.dat"));
            DoublyLinkedList<Campesino> datosRecuperados = (DoublyLinkedList<Campesino>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
}

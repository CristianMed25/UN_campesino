/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;

import Classes.Cultivo.Raiz_y_Tuberculo;
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
public class Agricultor extends Consultor{
    
    public Agricultor(String id, String nombre, String user, String pasword) {
        super("A" + id, nombre, user, pasword);
    }
    
    
    public Agricultor(){}
    
    public void escribir(DoublyLinkedList<Agricultor> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Agricultor.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Agricultor> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Agricultor.dat"));
            DoublyLinkedList<Agricultor> datosRecuperados = (DoublyLinkedList<Agricultor>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
}

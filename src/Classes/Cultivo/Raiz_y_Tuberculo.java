/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Cultivo;

import Classes.Tarea;
import Structures.Doubly.DoublyLinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import structures.DynamicArrayList;

/**
 *
 * @author samue
 */
public class Raiz_y_Tuberculo extends Cultivo{
    
    public Raiz_y_Tuberculo(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
        super("RT" + id, nombre, necesidades);
        this.tipo = "Raiz y Tuberculo";
    }
    
    public Raiz_y_Tuberculo(){}
    
    public void escribir(DoublyLinkedList<Raiz_y_Tuberculo> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Raiz_y_Tuberculo.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Raiz_y_Tuberculo> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Raiz_y_Tuberculo.dat"));
            DoublyLinkedList<Raiz_y_Tuberculo> datosRecuperados = (DoublyLinkedList<Raiz_y_Tuberculo>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
    
}

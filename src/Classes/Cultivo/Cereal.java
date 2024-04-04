    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Classes.Cultivo;

import Classes.Animal.Ave;
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
    public class Cereal extends Cultivo{

        public Cereal(String id, String nombre, DynamicArrayList<Tarea> necesidades) {
            super("C" + id, nombre, necesidades);
            this.tipo = "Cereal";
        }
    
    public Cereal() {
    }
    
    public void escribir(DoublyLinkedList<Cereal> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Cereal.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DoublyLinkedList<Cereal> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Cereal.dat"));
            DoublyLinkedList<Cereal> datosRecuperados = (DoublyLinkedList<Cereal>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }
    }

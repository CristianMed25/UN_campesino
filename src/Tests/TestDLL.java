package Tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Structures.Doubly.DoublyLinkedList;

public class TestDLL implements Serializable {
    private String id;
    private int data;

    public TestDLL(int id, int data) {
        this.id = 'X' + String.valueOf(id);
        this.data = data;
    }
    
    public TestDLL(){}
    
    public static void escribir(DoublyLinkedList<TestDLL> dato){
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("TestDLL.dat"));
                out.writeObject(dato);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   

public static DoublyLinkedList<TestDLL> leer(){
             try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("TestDLL.dat"));
            DoublyLinkedList<TestDLL> datosRecuperados = (DoublyLinkedList<TestDLL>) in.readObject();
            in.close();

            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    public String getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTestDLL{" + "\nid=" + id 
                                  + "\ndata=" + data + '}';
    }
    
    
}

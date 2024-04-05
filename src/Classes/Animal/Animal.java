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
import java.io.Serializable;

/**
 *
 * @author samue
 */
public abstract class Animal implements Serializable{
    protected String id;
    protected int edad;
    protected String salud;
    protected double peso;
    protected String tipo;

    public Animal(String id, int edad, String salud, double peso) {
        this.id = "A" + id;
        this.edad = edad;
        this.salud = salud;
        this.peso = peso;
    }
    
    public Animal(){}
    
    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getTipo() {
        return tipo;
    }  
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static void escribirAnimal(DoublyLinkedList<Animal> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Animal.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public static DoublyLinkedList<Animal> leerAnimal(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Animal.dat"));
            DoublyLinkedList<Animal> datosRecuperados = (DoublyLinkedList<Animal>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    @Override
    public String toString() {
        return "\nAnimal{" + "id=" + id + ", edad=" + edad + ", salud=" + salud + ", peso=" + peso + ", tipo=" + tipo + '}';
    }     
}

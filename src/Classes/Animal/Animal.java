/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Animal;

/**
 *
 * @author samue
 */
public abstract class Animal {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}

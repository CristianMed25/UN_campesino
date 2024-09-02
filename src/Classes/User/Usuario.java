/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;

import Structures.DisjointSetWithHeuristics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author samue
 */
public abstract class Usuario implements Serializable {
    protected int id;
    protected String nombre;
    protected String user;
    protected String pasword;
    protected Rol rol;

    public Usuario(int id, String nombre, String user, String pasword) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.pasword = pasword;
    }
    
    public Usuario(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public void escribir(List<Usuario> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Usuarios/Usuarios.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public List<Usuario> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Usuarios/Usuarios.dat"));
            List<Usuario> datosRecuperados = (List<Usuario>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        }
    
    public void escribirSetH(DisjointSetWithHeuristics dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Conjuntos/Heuristica.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public DisjointSetWithHeuristics leerSetH(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Conjuntos/Heuristica.dat"));
            DisjointSetWithHeuristics datosRecuperados = (DisjointSetWithHeuristics) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", user=" + user + ", pasword=" + pasword + ", rol=" + rol + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author CristianM
 */
public class Rol implements Serializable{
    private int id;
    private String nombre;
    private Set<String> permisos;  // Conjunto de permisos asociados al rol

    public Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = new HashSet<>();
    }
    
    public Rol(){}
    
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getPermisos() {
        return permisos;
    }

    public void agregarPermiso(String permiso) {
        permisos.add(permiso);
    }

    public void removerPermiso(String permiso) {
        permisos.remove(permiso);
    }

    public boolean tienePermiso(String permiso) {
        return permisos.contains(permiso);
    }

    public void escribir(List<Rol> dato){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/Roles/Roles.dat"));
            out.writeObject(dato);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public List<Rol> leer(){
         try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/Roles/Roles.dat"));
            List<Rol> datosRecuperados = (List<Rol>) in.readObject();
            in.close();
            return datosRecuperados;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
        } 
    
    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombre=" + nombre + ", permisos=" + permisos + '}';
    }
}


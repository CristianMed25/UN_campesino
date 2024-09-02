/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import Classes.User.Rol;
import Classes.User.ControlDeAccesoVerDos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CristianM
 */
public class GestorRoles {
    public static final Rol rol = new Rol();
    public static final ControlDeAccesoVerDos controlVerDos = new ControlDeAccesoVerDos();
    
    private static List<Rol> listaRol = rol.leer();
    
//Para creación de archivos
//    private static List<Rol> listaRol;
//
//    public GestorRoles() {
//        this.listaRol = new ArrayList<>();
//    }
    
    public void guardarRol (Rol rol){
        listaRol.add(rol);
        rol.escribir(listaRol);
        controlVerDos.crearRol(rol);
    }
    
    public void guardarRol (int id, String nombre, String permisoUno, String permisoDos){
        Rol rol = new Rol(id, nombre);
        rol.agregarPermiso(permisoUno);
        rol.agregarPermiso(permisoDos);
        listaRol.add(rol);
        rol.escribir(listaRol);
        controlVerDos.crearRol(rol);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.User;

import Structures.DisjointSetWithHeuristics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CristianM
 */
public class ControlDeAccesoVerDos {
    public static final Usuario usuario = new Campesino();
    
    private static DisjointSetWithHeuristics disjointSet = usuario.leerSetH();   
//    private static List<Usuario> listaUsuarios = usuario.leer();

//Para creación de archivos
//    private static DisjointSetWithHeuristics disjointSet = new DisjointSetWithHeuristics(10000);  // Conjunto disjunto para gestionar roles

    public ControlDeAccesoVerDos() {}
 
    public void registrarUsuario(Usuario usuario) {
        disjointSet.makeSet(usuario.getId());  // Crear un conjunto para el nuevo usuario
        usuario.escribirSetH(disjointSet);  
    }

    public void crearRol(Rol rol) {
        disjointSet.makeSet(rol.getId());
        usuario.escribirSetH(disjointSet);      
    }

    public void asignarRol(int usuarioId, Rol rol) {
        Usuario usuario = buscarUsuarioPorId(usuarioId);
        if (usuario != null) {
            // Unión del conjunto del usuario con el conjunto del rol
            disjointSet.union(usuarioId, rol.getId());
            usuario.escribirSetH(disjointSet); 
        }else{
            System.out.println("Usuario no existe");
        }       
    }

    public boolean verificarPermiso(int usuarioId, String permiso) {
        Usuario usuario = buscarUsuarioPorId(usuarioId);
        if (usuario != null) {
            if(usuario.getRol().tienePermiso(permiso)){
                return true;
            }else{
            return false;
            }                      
        }
        return false;
    }
    
    public boolean isConnected(int x, int y){
        return disjointSet.isConnected(x, y);
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuario.leer()) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        ControlDeAccesoVerDos instance = new ControlDeAccesoVerDos(10);
        
//        Rol rolAdmin = new Rol(1,"Admin");
//        rolAdmin.agregarPermiso("TODOS_LOS_PERMISOS");
//        instance.crearRol(rolAdmin);
//        
//        Rol rolBandera = new Rol(2, "Bandera");
//        instance.crearRol(rolBandera);    
        
//        Usuario usuario = new Campesino(usuarios.size()+4, "Josecristo", "Admin", "Admin");        
//        instance.registrarUsuario(usuario);
//        
//        Usuario usuariodos = new Consultor(usuarios.size()+4, "Josecristo2", "Admin", "Admin");         
//        instance.registrarUsuario(usuariodos);
    
//        instance.asignarRol(usuario.getId(), rolAdmin);
//        instance.asignarRol(usuario.getId(), rolBandera);
//        instance.asignarRol(usuariodos.getId(), rolBandera);
//        INTERFAZ    
//        System.out.println();
//        System.out.println(disjointSet.isConnected(usuario.getId(), rolAdmin.getId()));
//        System.out.println(disjointSet.isConnected(usuariodos.getId(), rolAdmin.getId()));
//        System.out.println(disjointSet.isConnected(usuario.getId(), rolBandera.getId()));
//        System.out.println(disjointSet.isConnected(usuariodos.getId(), rolBandera.getId()));
//        System.out.println(instance.verificarPermiso(usuario.getId(), "TODOS_LOS_PERMISOS"));
//        System.out.println(instance.verificarPermiso(usuario.getId(), "XD"));       
//    }
}

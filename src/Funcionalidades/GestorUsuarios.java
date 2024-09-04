/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import Classes.User.ControlDeAccesoVerDos;
import Classes.User.Campesino;
import Classes.User.Consultor;
import Classes.User.Rol;
import Classes.User.Trabajador;
import Classes.User.Usuario;
import java.util.List;

/**
 *
 * @author CristianM
 */
public class GestorUsuarios {
    public static final Usuario campesino = new Campesino();
    public static final Usuario consultor = new Consultor();
    public static final Rol rol = new Rol();
    public static final ControlDeAccesoVerDos controlVerDos = new ControlDeAccesoVerDos();
    
    public static final List<Usuario> listaUsuarios = campesino.leer();
    public static final List<Rol> listaRoles = rol.leer();
     
//    Para creación de archivos
//    private static List<Usuario> listaUsuarios;
//
//    public GestorUsuarios() {
//        this.listaUsuarios = new ArrayList<>();
//    }    
        
    public void crearUsuarioCampesino(String nombre, String user, String contraseña){
        Usuario usuario = new Campesino(listaUsuarios.size()+4, nombre, user, contraseña);
        usuario.setRol(rol.leer().get(0));
        listaUsuarios.add(usuario);
        campesino.escribir(listaUsuarios);
        
        controlVerDos.registrarUsuario(usuario);
        controlVerDos.asignarRol(usuario.getId(), rol.leer().get(0));
    }
    
    public void crearUsuarioConsultor(String nombre, String user, String contraseña){
        Usuario usuario = new Consultor(listaUsuarios.size()+4, nombre, user, contraseña);
        usuario.setRol(rol.leer().get(2));
        listaUsuarios.add(usuario);
        campesino.escribir(listaUsuarios);
        
        controlVerDos.registrarUsuario(usuario);
        controlVerDos.asignarRol(usuario.getId(), rol.leer().get(2));
    }
    
    public void crearUsuarioTrabajador(String nombre, String user, String contraseña){
        Usuario usuario = new Trabajador(listaUsuarios.size()+4, nombre, user, contraseña);
        usuario.setRol(listaRoles.get(1));
        listaUsuarios.add(usuario);
        campesino.escribir(listaUsuarios);
        
        controlVerDos.registrarUsuario(usuario);
        controlVerDos.asignarRol(usuario.getId(), listaRoles.get(1));
    }
}   
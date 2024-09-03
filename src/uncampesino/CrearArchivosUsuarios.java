/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncampesino;

import Classes.User.Campesino;
import Classes.User.Rol;
import Classes.User.Usuario;
import Structures.DisjointSetWithHeuristics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CristianM
 */
public class CrearArchivosUsuarios {
    public static void main(String[] args) {
        Usuario usuario = new Campesino();
        Rol rol = new Rol();
        
        List<Usuario> listaUsuarios = new ArrayList();
        usuario.escribir(listaUsuarios);
        
        List<Rol> listaRoles = new ArrayList<>();
        rol.escribir(listaRoles);
        
        DisjointSetWithHeuristics disjointSet = new DisjointSetWithHeuristics(10000);
        usuario.escribirSetH(disjointSet);
    }
}

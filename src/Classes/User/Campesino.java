/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author samue
 */
public class Campesino extends Usuario{
    
    public Campesino(int id, String nombre, String user, String pasword) {
        super(id, nombre, user, pasword);
    } 
    
    public Campesino(){}  
}

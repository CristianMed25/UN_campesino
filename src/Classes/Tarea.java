/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author samue
 */
public class Tarea {
    private String id;
    private String descrpicion;
    private boolean completada;

    public Tarea(String id, String descrpicion, boolean completada) {
        this.id = "T" + id;
        this.descrpicion = descrpicion;
        this.completada = completada;
    }

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getDescrpicion() {
        return descrpicion;
    }

    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
}

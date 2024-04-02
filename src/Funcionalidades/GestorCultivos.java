/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import Classes.Cultivo.*;
import Structures.Doubly.DoublyLinkedList;
import Structures.Doubly.DoublyLinkedList.DoublyNode;
/**
 *
 * @author samue
 */
public class GestorCultivos {
    
    //El gestor de cultivos posee una lista de cada clase de cultivo, donde se guerdarán las instancias poseean dichas clases.
    private DoublyLinkedList<Cereal> listaCereales;
    private DoublyLinkedList<Frutal> listaFrutales;
    private DoublyLinkedList<Hortaliza> listaHortalizas;
    private DoublyLinkedList<Leguminosa> listaLeguminosas;
    private DoublyLinkedList<Oleaginosa> listaOleaginosas;
    private DoublyLinkedList<Ornamental> listaOrnamentales;
    private DoublyLinkedList<Raiz_y_Tuberculo> listaRaicesTuberculos;

    public GestorCultivos() {
        this.listaCereales          = new DoublyLinkedList<>();
        this.listaFrutales          = new DoublyLinkedList<>();
        this.listaHortalizas        = new DoublyLinkedList<>();
        this.listaLeguminosas       = new DoublyLinkedList<>();
        this.listaOleaginosas       = new DoublyLinkedList<>();
        this.listaOrnamentales      = new DoublyLinkedList<>();
        this.listaRaicesTuberculos  = new DoublyLinkedList<>();
    }
    
    //AGREGAR CULTIVOS:
    public void agregarCereal(Cereal cereal) {
        listaCereales.pushBack(cereal);
    }
    
    public void agregarFrutal(Frutal frutal){
        listaFrutales.pushBack(frutal);
    }
    
    // Hazlo para los demas cultivos...
    
    //ELIMINAR CULTIVOS:
    public void eliminarCereal(String id) {
    // Buscar el cereal por ID
    DoublyLinkedList<Cereal>.DoublyNode<Cereal> nodo = listaCereales.new DoublyNode<>();

    
    // Si no se encuentra el cereal, imprimir mensaje y terminar
    if (nodo == null) {
        System.out.println("Cereal con ID " + id + " no encontrado.");
        return;
    }

    // Usar el método delete para eliminar el nodo encontrado
    listaCereales.delete(nodo.key);
    System.out.println("Cereal con ID " + id + " ha sido eliminado.");
}

    
    
    //ACTUALIZAR CULTIVOS
    public void actualizarCereal(Cereal cerealActualizado){
        
    }
    
}

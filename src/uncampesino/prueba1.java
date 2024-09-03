/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uncampesino;
import Funcionalidades.*;
import Structures.*;
/**
 *
 * @author yesid
 */
public class prueba1 {
    public static void main(String[] args){
        int count=10000000;
        GestorComprasBinaryHeap a = new GestorComprasBinaryHeap(2*count);
        GestorComprasQuaHeap b = new GestorComprasQuaHeap(2*count);
        
        for(int i=0;i<count;i++){
            a.Insertar(i*5,"asd"+i);
        }
        
        
        
        long inicio = System.nanoTime();
        a.ExtraerDato();
        double fin = System.nanoTime();


        double tiempoEjecucion = (fin - inicio);
        for(int i=0;i<count;i++){
            b.Insertar(i*5,"asd"+i);
        }
        System.out.println("Tiempo de ejecución binario: " + tiempoEjecucion/1000000000 + " segundos" + " o " +tiempoEjecucion/1000000 +" milisegundos");
        
        
        
        long inicio1=System.nanoTime();
        
        b.ExtraerDato();
        long fin1=System.nanoTime();
        
        
        
        
        double tiempoEjecucion1 = (fin1 - inicio1);
        System.out.println("Tiempo de ejecución cuaternario: " + tiempoEjecucion1/1000000000 + " segundos" + " o " +tiempoEjecucion1/1000000 +" milisegundos");
        
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncampesino;

/**
 *
 * @author CristianM
 */
import Classes.Animal.Ave;
import Classes.Animal.Bovino;
import Classes.Animal.Caballo;
import Classes.Animal.Ganado;
import Classes.Animal.Ovino;
import Classes.Animal.Pez;
import Classes.Animal.Porcino;
import Classes.Cultivo.Cereal;
import Classes.Cultivo.Frutal;
import Classes.Cultivo.Hortaliza;
import Classes.Cultivo.Leguminosa;
import Classes.Cultivo.Ornamental;
import Classes.Cultivo.Oleaginosa;
import Classes.Cultivo.Raiz_y_Tuberculo;
import Classes.Product.Producto;
import Classes.Tarea;
import Classes.User.Campesino;
import Classes.User.ControlDeAccesoVerDos;
import Classes.User.Rol;
import Classes.User.Usuario;
import Funcionalidades.GestorAnimales;
import Funcionalidades.GestorProductos;
import Funcionalidades.GestorTareas;
import Funcionalidades.GestorCultivos;
import Funcionalidades.GestorRoles;
import Funcionalidades.GestorUsuarios;
import Structures.DynamicArrayList;

public class GestorArchivos {
    public static final Ave ave = new Ave();
    public static final Bovino bovino = new Bovino();
    public static final Caballo caballo= new Caballo();
    public static final Ganado ganado = new Ganado();
    public static final Ovino ovino = new Ovino();
    public static final Pez pez = new Pez();
    public static final Porcino porcino = new Porcino();  
    
    public static final Cereal cereal = new Cereal();
    public static final Frutal frutal = new Frutal();
    public static final Hortaliza hortaliza= new Hortaliza();
    public static final Leguminosa leguminosa = new Leguminosa();
    public static final Oleaginosa oleaginosa= new Oleaginosa();
    public static final Ornamental ornamental= new Ornamental();
    public static final Raiz_y_Tuberculo raiz_y_tuberculo = new Raiz_y_Tuberculo();
    
    public static final Producto producto = new Producto();
    
    public static final Tarea tarea = new Tarea();   
    
    public static final Rol rol = new Rol();
    public static final Usuario usuario = new Campesino();
// 
    public static GestorAnimales gestorAnimales = new GestorAnimales();
    public static GestorCultivos gestorCultivos = new GestorCultivos();
    public static GestorProductos gestorProductos = new GestorProductos();
    public static GestorTareas gestorTareas = new GestorTareas();
    public static GestorRoles gestorRoles = new GestorRoles();
    public static GestorUsuarios gestorUsuarios = new GestorUsuarios(); 
    
    
    public static void main(String[] args) {
// CREAR ARCHIVOS
//          gestorUsuarios.crearUsuarioCampesino("ADMIN", "ADMIN","admin");
//        Tarea tarea = new Tarea("1", "A");
//        Tarea tareaDos = new Tarea("2", "B");
//        Tarea tareaTres = new Tarea("3", "C");
//        DynamicArrayList<Tarea> necesidades = new DynamicArrayList<>();
//        necesidades.pushBack(tarea);
//        necesidades.pushBack(tareaDos);
//        necesidades.pushBack(tareaTres);
////        
//        gestorRoles.guardarRol(1, "Admin", "ADM", "A");
//        gestorRoles.guardarRol(2, "Trabajador", "TRA", "T");
//        gestorRoles.guardarRol(3, "Consultor", "CON", "C");
//        
//        gestorUsuarios.crearUsuarioCampesino("PruebaCAM", "Admin", "Admin");
//        gestorUsuarios.crearUsuarioConsultor("PruebaCON2", "Consultor", "Consultor");
//
////
////
//        gestorAnimales.agregarGanado("1", ave, necesidades);
//        gestorAnimales.agregarGanado("2", bovino, necesidades);
//        gestorAnimales.agregarGanado("3", caballo, necesidades);
//        gestorAnimales.agregarGanado("4", ovino, necesidades);
//        gestorAnimales.agregarGanado("5", pez, necesidades);
//        gestorAnimales.agregarGanado("6", porcino, necesidades);
////
//        gestorAnimales.agregarBovino("0", 0, "a", 1);
//        gestorAnimales.agregarAve("0", 0, "a", 1);
//        gestorAnimales.agregarCaballo("0", 0, "a", 1);
//        gestorAnimales.agregarOvino("0", 0, "a", 1);
//        gestorAnimales.agregarPez("0", 0, "a", 1);
//        gestorAnimales.agregarPorcino("0", 0, "a", 1);
////
//        gestorCultivos.agregarCereal("0", "X", necesidades);
//        gestorCultivos.agregarFrutal("0", "X", necesidades);
//        gestorCultivos.agregarHortaliza("0", "X", necesidades);
//        gestorCultivos.agregarLeguminosa("0", "X", necesidades);
//        gestorCultivos.agregarOrnamental("0", "X", necesidades);
//        gestorCultivos.agregarRaiz_y_Tuberculo("0", "X", necesidades);
//        gestorCultivos.agregarOleaginosa("0", "X", necesidades);
////
//        gestorProductos.agregarProducto("0", "prueba", 250, 1000);
//        gestorProductos.apartarProducto(gestorProductos.buscarIdProducto("P0"), 500);
////
//        gestorTareas.encolarTarea(tarea);
//        gestorTareas.agregarNecesidadAnimal(tarea);
//        gestorTareas.agregarNecesidadCultivo(tarea);
// LIMPIAR ARCHIVOS
//        gestorAnimales.eliminarBovino("ABV0");
//        gestorAnimales.eliminarAve("AA0");
//        gestorAnimales.eliminarCaballo("AC0");
//        gestorAnimales.eliminarOvino("AOV0");
//        gestorAnimales.eliminarPez("AF0");
//        gestorAnimales.eliminarPorcino("AP0");
//
//        gestorCultivos.eliminarCereal("CC0");
//        gestorCultivos.eliminarFrutal("CF0");
//        gestorCultivos.eliminarHortaliza("CH0");
//        gestorCultivos.eliminarLeguminosa("CL0");
//        gestorCultivos.eliminarOrnamental("COR0");
//        gestorCultivos.eliminarRaiz_y_Tuberculo("CRT0");
//        gestorCultivos.eliminarOleaginosa("COL0");
//
//        gestorProductos.desapartarProducto();
//        gestorProductos.eliminarProducto("P0");
//
//        gestorTareas.desencolarTarea();
//        gestorTareas.eliminarNecesidadAnimalReciente();
//        gestorTareas.eliminarNecesidadCultivoReciente();
// CASO APARTE
//        gestorAnimales.eliminarGanado("G1");
//        gestorAnimales.eliminarGanado("G2");
//        gestorAnimales.eliminarGanado("G3");
//        gestorAnimales.eliminarGanado("G4");
//        gestorAnimales.eliminarGanado("G5");
//        gestorAnimales.eliminarGanado("G6");
// COMPROBAR ARCHIVOS
//        ganado.leer().print();
//        bovino.leer().print();
//        ave.leer().print(); 
//        caballo.leer().print();
//        ovino.leer().print();
//        pez.leer().print();
//        porcino.leer().print();
//
//        cereal.leer().print();
//        frutal.leer().print();
//        hortaliza.leer().print();
//        leguminosa.leer().print();
//        ornamental.leer().print();
//        oleaginosa.leer().print();
//        raiz_y_tuberculo.leer().print();
//
//        producto.leerApartado().output();
//        producto.leer().print();
//
//        tarea.leer().output();
//        ganado.leerNecesidad().print();
//        tarea.leerNecesidad().print();
//        System.out.println(usuario.leerSetH().isConnected(4, 1)); //true
//        System.out.println(usuario.leerSetH().isConnected(4, 2));
//        System.out.println(usuario.leerSetH().isConnected(4, 3));
//        System.out.println(usuario.leerSetH().isConnected(5, 1));
//        System.out.println(usuario.leerSetH().isConnected(5, 2));
//        System.out.println(usuario.leerSetH().isConnected(5, 3)); //true
//        System.out.println(usuario.leerSetH().isConnected(6, 1));
//        System.out.println(usuario.leerSetH().isConnected(6, 2)); 
//        System.out.println(usuario.leerSetH().isConnected(6, 3)); //true
//        for (int i = 0; i < rol.leer().size(); i++){
//            System.out.println(rol.leer().get(i));
//        }
//        usuario.leerSetH().printSets();
//    usuario.leer().forEach((usuarioFor) -> {
//        System.out.println(usuarioFor);
//        });
    }
}

package uncampesino;
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
import Funcionalidades.GestorAnimales;
import Funcionalidades.GestorProductos;
import Funcionalidades.GestorTareas;
import Funcionalidades.GestorCultivos;
import java.util.InputMismatchException;
import Structures.DynamicArrayList;
import java.util.Scanner;

public class UNCampesino {
    
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
    
    
    public static GestorAnimales gestorAnimales = new GestorAnimales();
    public static GestorCultivos gestorCultivos = new GestorCultivos();
    public static GestorProductos gestorProductos = new GestorProductos();
    public static GestorTareas gestorTareas = new GestorTareas();

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        Tarea tarea = new Tarea("25", "t");
//        DynamicArrayList<Tarea> necesidades = new DynamicArrayList<>();
//        necesidades.pushBack(tarea);
        
        
//        gestorTareas.encolarTarea(tarea);
//        gestorTareas.agregarNecesidadAnimal(tarea);
//        gestorTareas.agregarNecesidadCultivo(tarea);
        
//        System.out.println(gestorTareas.verTarea());
//        System.out.println(gestorTareas.buscarNecesidadAnimal("T25"));
//        System.out.println(gestorTareas.buscarNecesidadCultivo("T25"));
    
//        gestorTareas.desencolarTarea();
//        gestorTareas.eliminarNecesidadAnimalReciente();
//        gestorTareas.eliminarNecesidadCultivoReciente();

//        gestorTareas.editarDescripcion("auauaua");
        
//         System.out.println(ganado.leerNecesidad().length());
//         System.out.println(tarea.leerNecesidad().length());
//
//        tarea.leer().output();
//        ganado.leerNecesidad().print();
//        tarea.leerNecesidad().print();
//
//        cereal.leer().print();
//        frutal.leer().print();
//        hortaliza.leer().print();
//        leguminosa.leer().print();
//        ornamental.leer().print();
//        oleaginosa.leer().print();
//        raiz_y_tuberculo.leer().print();
//
//            bovino.leer().print();
//            ave.leer().print(); 
//            caballo.leer().print();
//            ovino.leer().print();
//            pez.leer().print();
//            porcino.leer().print();
        
//        necesidades.print();
//        gestorProductos.agregarProducto("1", "prueba", 250, 1000);
//        producto.leer().print();
        
//        String id = sc.nextLine();
//        System.out.println(gestorProductos.buscarIdProducto(id));
//        gestorProductos.apartarProducto(gestorProductos.buscarIdProducto(id), 0);
        
//        gestorProductos.desapartarProducto();
//        gestorProductos.actualizarProductoNombre(id, id);
//        gestorProductos.eliminarProducto("P1");
//        System.out.println("\nPeek");
//        System.out.println(gestorProductos.verProductoApartado());
//        System.out.println("");
////        
//        gestorProductos.editarCantidadUltimoApartado(250);
////        
//        System.out.println("\nPeek luego de editar");
//        System.out.println(gestorProductos.verProductoApartado());
//        System.out.println("");
//        
//        System.out.println("Output");
//        producto.leerApartado().output();
//        
//        System.out.println("");
//        System.out.println("Lista productos");
//        producto.leer().print();
//        
        
//        producto.leer().print();
//        String id = sc.nextLine();
//        String salud = sc.nextLine();
//        int edad = sc.nextInt();       
//        double peso = sc.nextDouble();
//        sc.nextLine();
//        
//        ganado.leer().print();
//        gestorAnimales.agregarGanado("1", ave, necesidades);
//        gestorAnimales.agregarGanado("2", bovino, necesidades);
//        gestorAnimales.agregarGanado("3", caballo, necesidades);
//        gestorAnimales.agregarGanado("4", ovino, necesidades);
//        gestorAnimales.agregarGanado("5", pez, necesidades);
//        gestorAnimales.agregarGanado("6", porcino, necesidades);
//        
//        id = sc.nextLine();      
//        
//        gestorAnimales.agregarBovino(id, edad, salud, peso);
//        
//        id = sc.nextLine();     
//        caballo.leer().print();
//          gestorAnimales.agregarBovino("40", 0, "a", 1);
//          gestorAnimales.agregarAve("20", 0, "a", 1);
//          gestorAnimales.agregarCaballo("20", 0, "a", 1);
//          gestorAnimales.agregarOvino("20", 0, "a", 1);
//          gestorAnimales.agregarPez("20", 0, "a", 1);
//          gestorAnimales.agregarPorcino("20", 0, "a", 1);

//        gestorCultivos.agregarCereal("15", "X", necesidades);
//        gestorCultivos.agregarFrutal("15", "X", necesidades);
//        gestorCultivos.agregarHortaliza("15", "X", necesidades);
//        gestorCultivos.agregarLeguminosa("15", "X", necesidades);
//        gestorCultivos.agregarOrnamental("15", "X", necesidades);
//        gestorCultivos.agregarRaiz_y_Tuberculo("15", "X", necesidades);
//        gestorCultivos.agregarOleaginosa("15", "X", necesidades);
//        

//           ganado.leer().print();

        
            
          
////     
//        String id = sc.nextLine();
//        System.out.println(gestorAnimales.buscarIdBovino(id));
//        System.out.println(gestorAnimales.buscarIdAve("AA20"));
//            bovino.leer().print();
//            ave.leer().print(); 
//            caballo.leer().print();
//            ovino.leer().print();
//            pez.leer().print();
//            porcino.leer().print();
////        
//        id = sc.nextLine();
 
        
//        try{
//            int edad = sc.nextInt();
//            gestorAnimales.actualizarBovinoEdad(id, edad);
//        }catch(InputMismatchException e){
//            System.out.println("tipo de dato ingresado erroneo");     
//        int edad = sc.nextInt();      
//        gestorAnimales.actualizarBovinoEdad(id, edad);
//        bovino.leer().print();
//        sc.nextLine();
        
//        String id = sc.nextLine();
//        gestorAnimales.eliminarCaballo(id);
//        System.out.println(caballo.leer().size());
//        caballo.leer().print();
//    System.out.println("\n¡¡Bienvenido a Agri-UN!!\n A continuación seleccione una opicón de nuestro menú:\n");
//    Menu();
//    
//    }
//    public void Menu(){
//        private Scanner scanner = new Scanner(System.in);
//        private Stack<String> historial = new Stack<>();
//        private int opcion;
//        mainMenu();
//        
//        public void mainMenu(){
//            System.out.println("1) Animales");
//            System.out.println("2) Cultivos");
//            System.out.println("3) Productos");
//            System.out.println("4) Tareas");
//            System.out.println("5) Salir");
//            
//            System.out.println("\n Ejemplo: para seleccionar 1) Animales --> Escrbia '1' \n");
//            opcion = scanner.nextInt();
//            
//            switch (opcion) {
//                case 1:
//                    historial.push("Animales");
//                    menuAnimales();
//                    break;
//                case 2:
//                    historial.push("Cultivos");
//                    menuCultivos();
//                    break;
//                case 3:
//                    historial.push("Productos");
//                    menuProductos();
//                    break;
//                case 4:
//                    historial.push("Tareas");
//                    menuTareas();
//                    break;
//                case 5:
//                    return;
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//            
//            public void menuAnimales(){
//                
//            }
//            public void menuCultivos(){
//                
//            }
//            public void menuTareas(){
//                
//            }
//        }
//    }
//    
    }

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
import Structures.Stack;
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
    
    public UNCampesino(){}
    public static UNCampesino UNCampesino = new UNCampesino();
    

    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
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
    System.out.println("\n¡¡Bienvenido a UN Campesino!!\n A continuación seleccione una opicón de nuestro menú:\n");
    UNCampesino.Menu();
    
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        mainMenu(scanner);
    }
    public static void mainMenu(Scanner scanner){
            System.out.println("\n Menú Principal:");
            System.out.println("1) Animales");
            System.out.println("2) Cultivos");
            System.out.println("3) Productos");
            System.out.println("4) Tareas");
            System.out.println("5) Salir");
            
            System.out.println("\n   Ejemplo: para seleccionar 1) Animales --> Escriba '1' \n");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: menuAnimales(scanner);  break;
                case 2: menuCultivos(scanner);  break;
                case 3: menuProductos(scanner); break;
                case 4: menuTareas(scanner);    break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    mainMenu(scanner);
            }
        }
        
        public static void menuAnimales(Scanner scanner){
            System.out.println("\n Animales || Elija una opción:");
            System.out.println("1) Ave");
            System.out.println("2) Bovino");
            System.out.println("3) Caballo");
            System.out.println("4) Ovino");
            System.out.println("5) Pez");
            System.out.println("6) Porcino");
            System.out.println("7) Regresar al menú principal");
            System.out.println("8) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: CRUDanimal("Ave", scanner);     break;
                case 2: CRUDanimal("Bovino", scanner);  break;
                case 3: CRUDanimal("Caballo", scanner); break;
                case 4: CRUDanimal("Ovino", scanner);   break;
                case 5: CRUDanimal("Pez", scanner);     break;
                case 6: CRUDanimal("Porcino", scanner); break;
                case 7: mainMenu(scanner);          break;
                case 8: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuAnimales(scanner);
            }
            
            
        }
        public static void CRUDanimal(String animal, Scanner scanner){
            String id, salud;
            int edad;
            double peso;
            
            System.out.println("\n CRUD " + animal +" || Elija una opción:");
            System.out.println("1) Agregar");
            System.out.println("2) Buscar");
            System.out.println("3) Actualizar");
            System.out.println("4) Eliminar");
            System.out.println("5) Regresar al menú anterior");
            System.out.println("6) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  //Agregar
                    System.out.println("\n  Ingrese los datos del animal:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    System.out.print("    edad:");
                        edad = scanner.nextInt();
                    System.out.print("    salud:");
                        salud = scanner.next();
                    System.out.print("    peso:");
                        peso = scanner.nextDouble();
                        
                        
                    switch (animal){
                        case "Ave":
                                gestorAnimales.agregarAve(id,edad,salud,peso);
                                System.out.println("Se agrego correctamente: ");
                                System.out.println(gestorAnimales.buscarIdAve("AA" + id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDanimal(animal,scanner);
                    }
                break;
                    
                case 2: //Buscar
                    System.out.println("\n  Ingrese los datos del animal:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    switch (animal){
                        case "Ave":
                                System.out.println(gestorAnimales.buscarIdAve(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDanimal(animal,scanner);
                    }
                        
                break;
                    
                case 3: //Actualizar
                    System.out.println("\n  Ingrese los datos del animal:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    CRUDanimalActualizar(animal,scanner, id);
                break;
                    
                case 4:  //Eliminar
                    System.out.println("\n  Ingrese los datos del animal:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    switch (animal){
                        case "Ave":
                                gestorAnimales.eliminarAve(id);
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            menuAnimales(scanner);
                    }
                break;
                    
                case 5: menuAnimales(scanner);          break;
                case 6: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDanimal(animal,scanner);
            }
        }
        public static void CRUDanimalActualizar(String animal,Scanner scanner, String id){
            System.out.println("\n CRUD " + animal +" ACTUALIZAR || Elija una opción:");
            System.out.println("1) Edad");
            System.out.println("2) Salud");
            System.out.println("3) Peso");
            System.out.println("4) Regresar al menú anterior");
            System.out.println("5) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: //edad
                    System.out.println("    nueva edad:");
                        int edad = scanner.nextInt();                        
                        
                    switch (animal){
                        case "Ave":
                                gestorAnimales.actualizarAveEdad(id, edad);
                                System.out.println(gestorAnimales.buscarIdAve(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDanimal(animal,scanner);
                    }
                break;
                case 2: //salud
                    System.out.println("    nueva salud:");
                        String salud = scanner.next();
                    switch (animal){
                        case "Ave":
                                gestorAnimales.actualizarAveSalud(id, salud);
                                System.out.println(gestorAnimales.buscarIdAve(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDanimal(animal,scanner);
                    }
                break;
                case 3: //peso
                    System.out.println("    nuevo peso:");
                        double peso = scanner.nextDouble();
                    switch (animal){
                        case "Ave":
                                gestorAnimales.actualizarAvePeso(id, peso);
                                System.out.println(gestorAnimales.buscarIdAve(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDanimal(animal,scanner);
                    }
                break;
                
                
                case 4: CRUDanimal(animal,scanner);          break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDanimalActualizar(animal,scanner,id);
            }
        }
        
        public static void menuCultivos(Scanner scanner){
            System.out.println("\n Cultivos || Elija una opción:");
            System.out.println("1) Cereal");
            System.out.println("2) Frutal");
            System.out.println("3) Hortaliza");
            System.out.println("4) Leguminosa");
            System.out.println("5) Oleaginosa");
            System.out.println("6) Ornamental");
            System.out.println("7) Raíces y Tuberculos");
            System.out.println("8) Regresar al menú principal");
            System.out.println("9) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: CRUDcultivo("Cereal", scanner);             break;
                case 2: CRUDcultivo("Frutal", scanner);             break;
                case 3: CRUDcultivo("Hortaliza", scanner);          break;
                case 4: CRUDcultivo("Leguminosa", scanner);         break;
                case 5: CRUDcultivo("Oleaginosa", scanner);         break;
                case 6: CRUDcultivo("Ornamental", scanner);         break;
                case 7: CRUDcultivo("Raiz y Tuberculo", scanner);   break;
                case 8: mainMenu(scanner);                          break;
                case 9: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuCultivos(scanner);
            }
            
            
        }
        public static void CRUDcultivo(String cultivo, Scanner scanner){
            String id, nombre;
            Tarea tarea = new Tarea(null,null);
            DynamicArrayList<Tarea> necesidades = new DynamicArrayList<>();
            
            System.out.println("\n CRUD " + cultivo +" || Elija una opción:");
            System.out.println("1) Agregar");
            System.out.println("2) Buscar");
            System.out.println("3) Actualizar");
            System.out.println("4) Eliminar");
            System.out.println("5) Regresar al menú anterior");
            System.out.println("6) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  //Agregar
                    System.out.println("\n  Ingrese los datos del cultivo:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    System.out.print("    nombre:");
                        nombre = scanner.next();
                    System.out.print("    lista de necesidades:");
                        necesidades = tarea.leerNecesidad();
                        
                    switch (cultivo){
                        case "Cereal":
                                gestorCultivos.agregarCereal(id,nombre,necesidades);
                                System.out.println("Se agrego correctamente: ");
                                System.out.println(gestorCultivos.buscarIdCereal("CC" + id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDcultivo(cultivo,scanner);
                    }
                break;
                    
                case 2: //Buscar
                    System.out.println("\n  Ingrese los datos del cultivo:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    switch (cultivo){
                        case "Cereal":
                                System.out.println(gestorCultivos.buscarIdCereal(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDcultivo(cultivo,scanner);
                    }
                        
                break;
                    
                case 3: //Actualizar
                    System.out.println("\n  Ingrese los datos del cultivo:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    CRUDcultivoActualizar(cultivo,scanner, id);
                break;
                    
                case 4:  //Eliminar
                    System.out.println("\n  Ingrese los datos del cultivo:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    switch (cultivo){
                        case "Cereal":
                                gestorCultivos.eliminarCereal(id);
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            menuCultivos(scanner);
                    }
                break;
                    
                case 5: menuCultivos(scanner);          break;
                case 6: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDcultivo(cultivo,scanner);
            }
        }
        public static void CRUDcultivoActualizar(String cultivo,Scanner scanner, String id){
            System.out.println("\n CRUD " + cultivo +" ACTUALIZAR || Elija una opción:");
            System.out.println("1) Nombre");
            System.out.println("2) Necesidades");
            System.out.println("3) Regresar al menú anterior");
            System.out.println("4) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: //nombre
                    System.out.println("    nuevo nombre:");
                        String nombre = scanner.next();                        
                        
                    switch (cultivo){
                        case "Cereal":
                                gestorCultivos.actualizarCerealNombre(id, nombre);
                                System.out.println(gestorCultivos.buscarIdCereal(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDcultivo(cultivo,scanner);
                    }
                break;
                case 2: //necesidades
                    System.out.println("    nuevas necesidades:");
                    DynamicArrayList<Tarea> necesidades = tarea.leerNecesidad();
                    switch (cultivo){
                        case "Cereal":
                                gestorCultivos.actualizarCerealNecesidades(id, necesidades);
                                System.out.println(gestorCultivos.buscarIdCereal(id));
                            break;
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDcultivo(cultivo,scanner);
                    }
                break;

                
                case 3: CRUDcultivo(cultivo,scanner);          break;
                case 4: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDcultivoActualizar(cultivo,scanner,id);
            }
        }
        
        public static void menuTareas(Scanner scanner){
            System.out.println("\n Tareas Varias || Elija una opción:");
            System.out.println("1) Tareas");
            System.out.println("2) Necesidades Cultivos");
            System.out.println("3) Necesidades Ganado");
            System.out.println("4) Regresar al menú principal");
            System.out.println("5) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: CRUDtarea("Gestión Tareas", scanner);                   break;
                case 2: CRUDnecesidad("Cultivo", scanner);         break;
                case 3: CRUDnecesidad("Ganado", scanner);           break;
                case 4: mainMenu(scanner);                                      break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuTareas(scanner);
            }
            
            
        }
        public static void CRUDtarea(String tarea, Scanner scanner){            
            Tarea curr = new Tarea(null,null);
            String id, descripcion;
             
            System.out.println("\n CRUD " + tarea +" || Elija una opción:");
            System.out.println("1) Encolar");
            System.out.println("2) Desencolar");
            System.out.println("3) Editar Descripción");
            System.out.println("4) Regresar al menú anterior");
            System.out.println("5) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  //Encolar
                    System.out.println("\n  Ingrese los datos de la tarea:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                        curr.setId(id);
                    System.out.print("    descripción:");
                        descripcion = scanner.next();
                        curr.setDescripcion(descripcion);
                        
                    gestorTareas.encolarTarea(curr);
                break;
                    
                case 2: //Desencolar
                    gestorTareas.verTarea();
                    gestorTareas.desencolarTarea();  
                break;
                    
                case 3: //Editar Descripción
                    System.out.println("\n  Ingrese los datos del tarea:\n   Recuerde que se editará la primera tarea en cola");
                    
                    //Datos:
                    System.out.println("    descripción:");
                        descripcion = scanner.next();
                    gestorTareas.editarDescripcion(descripcion);
                break;
                    
                case 4: menuTareas(scanner);          break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDtarea(tarea,scanner);
            }
        }
        public static void CRUDnecesidad(String necesidad, Scanner scanner){            
            Tarea curr = new Tarea(null,null);
            String id, descripcion;
             
            System.out.println("\n CRUD " + necesidad +" || Elija una opción:");
            System.out.println("1) Agregar");
            System.out.println("2) Eliminar más reciente");
            System.out.println("3) Buscar");
            System.out.println("4) Regresar al menú anterior");
            System.out.println("5) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  //Agregar
                     System.out.println("\n  Ingrese los datos de la necesidad:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                        curr.setId(id);
                    System.out.print("    descripción:");
                        descripcion = scanner.next();
                        curr.setDescripcion(descripcion);
                        
                    switch (necesidad) {
                        case "Cultivo":
                            gestorTareas.agregarNecesidadCultivo(curr);
                        break;
                        case "Ganado":
                            gestorTareas.agregarNecesidadAnimal(curr);
                        break;
                        
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDnecesidad(necesidad,scanner);
                    }
                break;
                    
                case 2: //Eliminar más reciente
                    switch (necesidad) {
                        case "Cultivo":
                            gestorTareas.eliminarNecesidadCultivoReciente();
                        break;
                        case "Ganado":
                            gestorTareas.eliminarNecesidadAnimalReciente();
                        break;
                        
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDnecesidad(necesidad,scanner);
                    }
                break;
                    
                case 3: //Buscar    
                    System.out.println("\n  Ingrese los datos del necesidad:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    switch (necesidad) {
                        case "Cultivo":
                            gestorTareas.buscarNecesidadCultivo(id);
                        break;
                        case "Ganado":
                            gestorTareas.buscarNecesidadAnimal(id);
                        break;
                        
                        default:
                            System.out.println("\n---   Opción no disponible por el momento...   ---");
                            CRUDnecesidad(necesidad,scanner);
                    }
                break;
                    
                case 4: menuTareas(scanner);          break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDnecesidad(necesidad,scanner);
            }
        }
        
        public static void menuProductos(Scanner scanner){
            String id, nombre;
            double precio;
            int cantidad;
            Producto curr = new Producto();
            
            System.out.println("\n Productos || Elija una opción:");
            System.out.println("1) Agregar");
            System.out.println("2) Buscar");
            System.out.println("3) Actualizar");
            System.out.println("4) Eliminar");
            System.out.println("5) Ver producto apartado");
            System.out.println("6) Apartar");
            System.out.println("7) Cancelar apartado de producto");
            System.out.println("8) Editar cantidad apartada");
            System.out.println("9) Regresar al menú principal");
            System.out.println("10) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:  //Agregar
                    System.out.println("\n  Ingrese los datos del producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    System.out.print("    nombre:");
                        nombre = scanner.next();
                    System.out.print("    precio:");
                        precio = scanner.nextDouble();
                    System.out.print("    Cantidad:");
                        cantidad = scanner.nextInt();
                        
                    gestorProductos.agregarProducto(id,nombre,precio,cantidad);
                break;
                    
                case 2: //Buscar
                    System.out.println("\n  Ingrese los datos del producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    gestorProductos.buscarIdProducto(id);
                        
                break;
                    
                case 3: //Actualizar
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    CRUDproductoActualizar(scanner, id);
                break;
                    
                case 4:  //Eliminar
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    gestorProductos.eliminarProducto(id);
                break;
                
                case 5: 
                    System.out.println("\n A continuación el primer producto apartado:");
                    gestorProductos.verProductoApartado();
                break;
                
                case 6:
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    System.out.println("    cantidad a apartar:");
                        cantidad = scanner.nextInt();
                    
                    curr = gestorProductos.buscarIdProducto(id);
                    gestorProductos.apartarProducto(curr, cantidad);
                break;
                
                case 7:
                    gestorProductos.desapartarProducto();
                break;
                
                case 8:
                    System.out.println("       Recuerde que la cantidad se cambiará al último apartado");
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    cantidad a apartar:");
                        cantidad = scanner.nextInt();
                        
                    gestorProductos.editarCantidadUltimoApartado(cantidad);
                break;
                
                case 9: mainMenu(scanner);                          break;
                case 10: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuProductos(scanner);
            }
            
            
        }
        
        public static void CRUDproductoActualizar(Scanner scanner, String id){
            System.out.println("\n CRUD Producto ACTUALIZAR || Elija una opción:");
            System.out.println("1) Nombre");
            System.out.println("2) Precio");
            System.out.println("3) Cantidad");
            System.out.println("3) Regresar al menú anterior");
            System.out.println("4) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: //nombre
                    System.out.println("    nuevo nombre:");
                        String nombre = scanner.next();                        
                            
                    gestorProductos.actualizarProductoNombre(id,nombre);
                    
                break;
                
                case 2: //precio
                    System.out.println("    nuevo precio:");
                        double precio = scanner.nextDouble();                        
                            
                    gestorProductos.actualizarProductoPrecio(id,precio);
                break;
                
                case 3: //cantidad
                    System.out.println("    nueva cantidad:");
                        int cantidad = scanner.nextInt();                        
                            
                    gestorProductos.actualizarProductoCantidad(id,cantidad);
                break;

                
                case 4:menuProductos(scanner);          break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDproductoActualizar(scanner,id);
            }
        }
    
}

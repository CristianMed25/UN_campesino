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
import Classes.Pendientes;
import Classes.Tarea;
import Classes.User.Campesino;
import Classes.User.Usuario;
import Funcionalidades.GestorAnimales;
import Funcionalidades.GestorComprasQuaHeap;
import Funcionalidades.GestorProductos;
import Funcionalidades.GestorTareas;
import Funcionalidades.GestorCultivos;
import Funcionalidades.GestorPendientes;
import Funcionalidades.GestorUsuarios;
import static Funcionalidades.GestorUsuarios.listaUsuarios;
import Structures.DynamicArrayList;
import java.util.Scanner;
import java.util.List;

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
    public static GestorUsuarios gestorUsuarios = new GestorUsuarios();
    public static GestorComprasQuaHeap gestorCompras = new GestorComprasQuaHeap();
    public static GestorPendientes gestorPendiente = new GestorPendientes();
    
    
    public UNCampesino(){}     public static UNCampesino UNCampesino = new UNCampesino();
    

    public static void main(String[] args) {
        System.out.println("\n¡¡Bienvenido a UN Campesino!!\n A continuación seleccione una opicón de nuestro menú:\n");
        UNCampesino.Menu();  
    }
    
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        loggeo(scanner);
    }
    
    //LOGGEO
    public static void loggeo(Scanner scanner){
        System.out.println("\n Bienvenido a UN Campesino:");
        System.out.println("1) Ingreso");
        System.out.println("2) Registro");
        System.out.println("3) Cerrar");

        System.out.println("\n   Ejemplo: para seleccionar 1) Ingreso --> Escriba '1' \n");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: menuIngreso(scanner);  break;
            case 2: menuRegistro(scanner);  break;
            case 3: return;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                loggeo(scanner);
        }
    }
        public static void menuIngreso(Scanner scanner){
            String user, contraseña;
            Boolean registered = false;

            System.out.println("\n¿Desea regresar al menú anterior?");
            System.out.println("1) Si");
            System.out.println("2) No");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    loggeo(scanner);  break;
                case 2:
                    System.out.println("\nPor favor ingrese la información de su cuenta.");
                    System.out.println("Usuario:");
                    user =  scanner.next();
                    System.out.println("Contraseña:");
                    contraseña =  scanner.next();

                    for (Usuario usuario : gestorUsuarios.listaUsuarios) {
                        if (usuario.getUser().equals(user) && usuario.getPasword().equals(contraseña)) {
                            System.out.println("¡Ingreso exitoso, bienvenido " + usuario.getNombre() + "!");
                            registered = true;
                            if (gestorUsuarios.controlVerDos.isConnected(usuario.getId(), gestorUsuarios.rol.leer().get(0).getId())) menuCampesino(scanner);
                            if (gestorUsuarios.controlVerDos.isConnected(usuario.getId(), gestorUsuarios.rol.leer().get(1).getId())) mainMenu(scanner);
                            if (gestorUsuarios.controlVerDos.isConnected(usuario.getId(), gestorUsuarios.rol.leer().get(2).getId())) menuConsultores(scanner); 

                            break;
                        }
                    }

                    if (!registered) {
                        System.out.println("\nUsuario o contraseña incorrectos. Inténtelo de nuevo.");
                        loggeo(scanner); 
                    }
                    break;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    registroCampesino(scanner);
            }
        }
        public static void menuRegistro(Scanner scanner){
        System.out.println("\nIngrese el tipo de usuario que desea registrar");
        System.out.println("1) Campesino");
        System.out.println("2) Trabajador");
        System.out.println("3) Consultor");
        System.out.println("4) Regresar");
        System.out.println("5) Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: registroCampesino(scanner);  break;
            case 2: 
                System.out.println("\nPara el registro de trabajadores es necesario comunicarse con un Administrador (CAMPESINO)");
                loggeo(scanner);
                break;
            case 3: registroConsultor(scanner);  break;
            case 4: loggeo(scanner);  break;
            case 5: return;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                loggeo(scanner);
        }
    }
            public static void registroCampesino(Scanner scanner){
                String nombre, user, contraseña;

                System.out.println("\n Si desea ingresar al menú anterior ingrese 0, en caso contrario, ingrese la clave de administración:");
                int adminCode = scanner.nextInt();

                switch (adminCode) {
                    case 0:
                        menuRegistro(scanner);
                        break;
                    case 123456789:
                        System.out.println("\nBienvenido. Por favor ingrese la información de su nuevo Campesino");
                        System.out.println("     Nombre:");
                        nombre =  scanner.next();
                        
                        System.out.println("     Usuario:");
                        user =  scanner.next();
                        
                        System.out.println("     Contraseña:");
                        contraseña =  scanner.next();
                        gestorUsuarios.crearUsuarioCampesino(nombre,user,contraseña);
                        System.out.println("Cuenta creada exitosamente. Usuario y Contraseña registrados.");
                        loggeo(scanner);
                        break;
                    default:
                        System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                        registroCampesino(scanner);
                        break;
                }
            }
            public static void registroConsultor(Scanner scanner){
        String nombre, user, contraseña;
        
        System.out.println("\n¿Está seguro de su elección?");
        System.out.println("1) Si");
        System.out.println("2) No");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nBienvenido. Por favor ingrese la información de su nuevo Consultor");
                
                System.out.println("Nombre:");
                nombre =  scanner.next();
                
                System.out.println("Usuario:");
                user =  scanner.next();
                
                System.out.println("Contraseña:");
                contraseña =  scanner.next();
                
                gestorUsuarios.crearUsuarioConsultor(nombre,user,contraseña);
                System.out.println("\nCuenta creada exitosamente. Usuario y Contraseña registrados.");
                
                loggeo(scanner);
                
                break;
            case 2: menuRegistro(scanner);  break;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                registroConsultor(scanner);
        }
    }
    
    //OPCIONES CAMPESINO
    public static void menuCampesino(Scanner scanner){
        System.out.println("\n Menú Aministrativo:");
        System.out.println("1) Gestión de usuarios");
        System.out.println("2) Sistema de Gestión | Menú principal");
        System.out.println("3) Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: menuGestionUsuarios(scanner);  break;
            case 2: mainMenu(scanner);  break;
            case 3: return;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                menuCampesino(scanner);
        }
    }
        public static void menuGestionUsuarios (Scanner scanner){
            System.out.println("\n Operaciones:");
            System.out.println("1) Registrar trabajadores");
            System.out.println("2) Buscar información de usuario");
            System.out.println("3) Regresar");
            System.out.println("4) Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: registroTrabajador(scanner);  break;
                case 2: gestionUsuarios(scanner);  break;
                case 3: menuCampesino(scanner); break;
                case 4: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuGestionUsuarios(scanner);
            }
        }
        public static void registroTrabajador(Scanner scanner){
            String nombre, user, contraseña;

            System.out.println("\n¿Está seguro de su elección?");
            System.out.println("1) Si");
            System.out.println("2) No");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nBienvenido. Por favor ingrese la información de su nuevo Trabajador");
                    System.out.println("Nombre:");
                    nombre =  scanner.next();
                    System.out.println("Usuario:");
                    user =  scanner.next();
                    System.out.println("Contraseña:");
                    contraseña =  scanner.next();

                    gestorUsuarios.crearUsuarioTrabajador(nombre,user,contraseña);
                    System.out.println("\nCuenta creada exitosamente. Usuario y Contraseña registrados.");
                    menuGestionUsuarios(scanner);

                    break;
                case 2: menuGestionUsuarios(scanner);  break;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    registroTrabajador(scanner);
            }
        }
        public static void gestionUsuarios(Scanner scanner){
        String nombre, user;
        Boolean registered = false;
        
        System.out.println("\nTipo de busqueda:");
        System.out.println("1) Nombre");
        System.out.println("2) User");
        System.out.println("Otras opciones:");
        System.out.println("3) Regresar");
        System.out.println("4) Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nPor favor ingrese el nombre del usuario.");
                System.out.println("Nombre:");
                nombre =  scanner.next();
                
                for (Usuario usuario : gestorUsuarios.listaUsuarios) {
                    if (usuario.getNombre().equals(nombre)) {
                        System.out.println("Usuario encontrado: ");
                        System.out.println("Nombre: " + usuario.getNombre() + "   Usuario: " + usuario.getUser() + "   Rol: " + usuario.getRol());
                        registered = true;
                        gestionUsuarios(scanner); 
                        
                        break;
                    }
                }

                if (!registered) {
                    System.out.println("\nUsuario o Nombre incorrectos. Inténtelo de nuevo.");
                    gestionUsuarios(scanner); 
                }
            case 2:
                System.out.println("\nPor favor ingrese el usuario.");
                System.out.println("Usuario:");
                user =  scanner.next();
                
                for (Usuario usuario : gestorUsuarios.listaUsuarios) {
                    if (usuario.getUser().equals(user)) {
                        System.out.println("Usuario encontrado: ");
                        System.out.println("Nombre: " + usuario.getNombre() + "   Usuario: " + usuario.getUser() + "   Rol: " + usuario.getRol());
                        registered = true;
                        gestionUsuarios(scanner);
                        
                        break;
                    }
                }

                if (!registered) {
                    System.out.println("\nUsuario o Nombre incorrectos. Inténtelo de nuevo.");
                    gestionUsuarios(scanner); 
                }
                break;
            case 3: menuGestionUsuarios(scanner);  break;
            case 4: return;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                gestionUsuarios(scanner);
        }
    }
    
    
    //MENU TRABAJADORES & CAMPESINO
    public static void mainMenu(Scanner scanner){
            System.out.println("\n Menú Principal:");
            System.out.println("1) Animales");
            System.out.println("2) Cultivos");
            System.out.println("3) Productos");
            System.out.println("4) Tareas");
            System.out.println("5) Salir");

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
                case 7: mainMenu(scanner);              break;
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
                        mainMenu(scanner);
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
                         mainMenu(scanner);   
                    break;

                    case 3: //Actualizar
                        System.out.println("\n  Ingrese los datos del animal:");

                        //Datos:
                        System.out.println("    id:");
                            id = scanner.next();
                        CRUDanimalActualizar(animal,scanner, id);
                        mainMenu(scanner);
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
                        mainMenu(scanner);
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
                        mainMenu(scanner);
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
                        mainMenu(scanner);
                    break;

                    case 3: //Actualizar
                        System.out.println("\n  Ingrese los datos del cultivo:");

                        //Datos:
                        System.out.println("    id:");
                            id = scanner.next();
                        CRUDcultivoActualizar(cultivo,scanner, id);

                        mainMenu(scanner);
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
                        mainMenu(scanner);
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
            System.out.println("1) CRUD Tareas");
            System.out.println("2) Gestión Tareas");
            System.out.println("3) Necesidades Cultivos");
            System.out.println("4) Necesidades Ganado");
            System.out.println("5) Regresar al menú principal");
            System.out.println("6) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: CRUDtarea("Tareas", scanner);                   break;
                case 2: menuGestionTarea(scanner);                   break;
                case 3: CRUDnecesidad("Cultivo", scanner);         break;
                case 4: CRUDnecesidad("Ganado", scanner);           break;
                case 5: mainMenu(scanner);                                      break;
                case 6: return;
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

                        mainMenu(scanner);
                    break;

                    case 2: //Desencolar
                        System.out.println(gestorTareas.verTarea());
                        gestorTareas.desencolarTarea();  

                        mainMenu(scanner);                   
                    break;

                    case 3: //Editar Descripción
                        System.out.println("\n  Ingrese los datos del tarea:\n   Recuerde que se editará la primera tarea en cola");

                        //Datos:
                        System.out.println("    descripción:");
                            descripcion = scanner.next();
                        gestorTareas.editarDescripcion(descripcion);

                        mainMenu(scanner);
                    break;

                    case 4: menuTareas(scanner);          break;
                    case 5: return;
                    default:
                        System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                        CRUDtarea(tarea,scanner);
                }
            }
            public static void menuGestionTarea(Scanner scanner){
                int prioridad; String descripcion;
                
                System.out.println("\n Elija una opción:");
                System.out.println("1) Agregar Pendiente");
                System.out.println("2) Completar Pendiente");
                System.out.println("3) Eliminar Pendiente");
                System.out.println("4) Buscar Pendiente por Prioridad Exacta");
                System.out.println("5) Busqueda por Mayor o Menor Prioridad ");
                System.out.println("6) Lista de Pendientes");
                System.out.println("7) Regresar al menú principal");
                System.out.println("8) Salir");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese la información del pendiente:");
                        System.out.println("Prioridad: ");
                        prioridad = scanner.nextInt();
                        
                        System.out.println("Descripción: ");
                        descripcion = scanner.next();
                        
                        gestorPendiente.agregarPendiente(prioridad, descripcion);
                        menuGestionTarea(scanner);
                        
                        break;
                    case 2:
                        System.out.println("\n Ingrese la información del pendiente:");
                        System.out.println("Prioridad: ");
                        prioridad = scanner.nextInt();
                        System.out.println("Descripción: ");
                        descripcion = scanner.next();
                        
                        Pendientes pendiente = new Pendientes(prioridad, descripcion, false);
                        
                        gestorPendiente.marcarCompletada(pendiente);
                        menuGestionTarea(scanner);
                        break;
                    case 3:
                        System.out.println("\n Ingrese la información del pendiente:");
                        System.out.println("Prioridad: ");
                        prioridad = scanner.nextInt();
                        System.out.println("Descripción: ");
                        descripcion = scanner.next();
                        
                        gestorPendiente.eliminarPendiente(prioridad, descripcion);
                        menuGestionTarea(scanner);
                        break;
                    case 4: 
                        System.out.println("\n Ingrese la información de busqueda:");
                        System.out.println("Prioridad: ");
                        prioridad = scanner.nextInt();
                        
                        gestorPendiente.buscarPorPrioridadExacta(prioridad);
                        menuGestionTarea(scanner);
                        break;
                    case 5: 
                        System.out.println("\n Ingrese la información de busqueda:");
                        System.out.println("Prioridad: ");
                        prioridad = scanner.nextInt();
                        
                        gestorPendiente.buscarPorPrioridad(prioridad);
                        menuGestionTarea(scanner);
                        break;
                    case 6: 
                        System.out.println("\n Lista de Pendientes:");
                        
                        gestorPendiente.mostrarPendientesOrdenadas();
                        menuGestionTarea(scanner);
                        break;
                    case 7: menuTareas(scanner);                                      break;
                    case 8: return;
                    default:
                        System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                        menuGestionTarea(scanner);
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
                            System.out.println(gestorTareas.buscarNecesidadCultivo(id));
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
                    System.out.println(gestorProductos.buscarIdProducto("P" + id));
                break;
                    
                case 2: //Buscar
                    System.out.println("\n  Ingrese los datos del producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    System.out.println(gestorProductos.buscarIdProducto(id));
                        
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
                    System.out.println(gestorProductos.verProductoApartado());
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
                    System.out.println(gestorProductos.buscarIdProducto(id));
                break;
                
                case 7:
                    Producto pro  = gestorProductos.desapartarProducto();
                    System.out.println(gestorProductos.buscarIdProducto(pro.getId()));
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
                    System.out.println(gestorProductos.buscarIdProducto(id));
                    
                    mainMenu(scanner);
                break;
                
                case 2: //precio
                    System.out.println("    nuevo precio:");
                        double precio = scanner.nextDouble();                        
                            
                    gestorProductos.actualizarProductoPrecio(id,precio);
                    
                    mainMenu(scanner);
                break;
                
                case 3: //cantidad
                    System.out.println("    nueva cantidad:");
                        int cantidad = scanner.nextInt();                        
                            
                    gestorProductos.actualizarProductoCantidad(id,cantidad);
                    
                    mainMenu(scanner);
                break;

                
                case 4:menuProductos(scanner);          break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    CRUDproductoActualizar(scanner,id);
            }
        }
        
    //MENU CONSULTORES
    public static void menuConsultores(Scanner scanner){
        System.out.println("\n Menú para Consultores:");
        System.out.println("1) Productos");
        System.out.println("2) Gestor de Compras");
        System.out.println("3) Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: menuProductosConsultores(scanner); break;
            case 2: menuGestorCompras(scanner);    break;
            case 3: return;
            default:
                System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                menuConsultores(scanner);
        }
    }
        public static void menuProductosConsultores(Scanner scanner){
            String id;
            int cantidad;
            Producto curr = new Producto();
            
            System.out.println("\n Productos || Elija una opción:");
            System.out.println("1) Buscar");
            System.out.println("2) Ver producto apartado");
            System.out.println("3) Apartar");
            System.out.println("4) Cancelar apartado de producto");
            System.out.println("5) Editar cantidad apartada");
            System.out.println("6) Regresar al menú principal");
            System.out.println("7) Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: //Buscar
                    System.out.println("\n  Ingrese los datos del producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    
                    System.out.println(gestorProductos.buscarIdProducto(id));
                        
                break;
                
                case 2: 
                    System.out.println("\n A continuación el primer producto apartado:");
                    System.out.println(gestorProductos.verProductoApartado());
                break;
                
                case 3:
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    id:");
                        id = scanner.next();
                    System.out.println("    cantidad a apartar:");
                        cantidad = scanner.nextInt();
                    
                    curr = gestorProductos.buscarIdProducto(id);
                    gestorProductos.apartarProducto(curr, cantidad);
                    System.out.println(gestorProductos.buscarIdProducto(id));
                break;
                
                case 4:
                    Producto pro  = gestorProductos.desapartarProducto();
                    System.out.println(gestorProductos.buscarIdProducto(pro.getId()));
                break;
                
                case 5:
                    System.out.println("       Recuerde que la cantidad se cambiará al último apartado");
                    System.out.println("\n  Ingrese los datos del Producto:");
                    
                    //Datos:
                    System.out.println("    cantidad a apartar:");
                        cantidad = scanner.nextInt();
                        
                    gestorProductos.editarCantidadUltimoApartado(cantidad);
                break;
                
                case 6: menuConsultores(scanner);                          break;
                case 7: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuProductosConsultores(scanner);
            }
            
            
        }  
        public static void menuGestorCompras(Scanner scanner){
            double Precio;
            String Nombre;
            
            System.out.println("\n El presente menú está enfocado en guiar la compra prioritaria de productos. Puede crear una lista de compras y realizar las siguientes operaciones");
            System.out.println("1) Insertar productos");
            System.out.println("2) Tomar producto más barato");
            System.out.println("3) Consultar lista");
            System.out.println("4) Regresar");
            System.out.println("5) Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: 
                    System.out.println("\n  Ingrese los datos del producto:");
                    System.out.println("     Nombre");
                    Nombre = scanner.next();
                    System.out.println("     Precio");
                    Precio = scanner.nextDouble();
                    
                    gestorCompras.Insertar(Precio, Nombre);
                    System.out.println("\n  Producto insertado correctamente");
                    menuGestorCompras(scanner);
                    
                    break;
                case 2:
                    System.out.println("\n  El producto más barato es:");
                    System.out.println(gestorCompras.ExtraerDato());
                    
                    menuGestorCompras(scanner);
                    break;
                case 3:
                    System.out.println("\n  Lista de productos:");
                    System.out.println(gestorCompras.ExtraerDatos());
                    
                    menuGestorCompras(scanner);
                    break;
                case 4: menuConsultores(scanner); break;
                case 5: return;
                default:
                    System.out.println("\n ----    Opción no válida || Intentando nuevamente    ----\n");
                    menuGestorCompras(scanner);
            }
        }
    
        
    
}

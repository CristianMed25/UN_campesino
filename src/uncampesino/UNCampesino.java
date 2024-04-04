package uncampesino;
import Classes.Animal.Ave;
import Classes.Animal.Bovino;
import Classes.Animal.Caballo;
import Classes.Animal.Ganado;
import Classes.Animal.Ovino;
import Classes.Animal.Pez;
import Classes.Animal.Porcino;
import Funcionalidades.GestorAnimales;
import java.util.Scanner;
public class UNCampesino {
    
    public static final Ave ave = new Ave();
    public static final Bovino bovino = new Bovino();
    public static final Caballo caballo= new Caballo();
    public static final Ganado ganado = new Ganado();
    public static final Ovino ovino = new Ovino();
    public static final Pez pez = new Pez();
    public static final Porcino porcino = new Porcino();
    
    public static GestorAnimales gestorAnimales = new GestorAnimales();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
//        String id = sc.nextLine();
//        String salud = sc.nextLine();
//        int edad = sc.nextInt();       
//        double peso = sc.nextDouble();
//        sc.nextLine();
//        
//        gestorAnimales.agregarBovino(id, edad, salud, peso);
//        
//        id = sc.nextLine();      
//        
//        gestorAnimales.agregarBovino(id, edad, salud, peso);
//        
//        id = sc.nextLine();     
        caballo.leer().print();
//          gestorAnimales.agregarBovino("40", 0, "a", 1);
//          gestorAnimales.agregarAve("20", 0, "a", 1);
          gestorAnimales.agregarCaballo("20", 0, "a", 1);
//          gestorAnimales.agregarOvino("20", 0, "a", 1);
//          gestorAnimales.agregarPez("20", 0, "a", 1);
//          gestorAnimales.agregarPorcino("20", 0, "a", 1);
          
//           bovino.leer().print();
//     
//        String id = sc.nextLine();
//        System.out.println(gestorAnimales.buscarIdBovino(id));
//        System.out.println(gestorAnimales.buscarIdAve("AA20"));
//            bovino.leer().print();
//            ave.leer().print(); 
            caballo.leer().print();
//            ovino.leer().print();
//            pez.leer().print();
//            porcino.leer().print();
////        
//        id = sc.nextLine();
//        int edad = sc.nextInt();      
//        gestorAnimales.actualizarBovinoEdad(id, edad);
//        bovino.leer().print();
//        sc.nextLine();
        
//        String id = sc.nextLine();
//        gestorAnimales.eliminarCaballo(id);
        System.out.println(caballo.leer().size());
//        caballo.leer().print();
    }
    
}

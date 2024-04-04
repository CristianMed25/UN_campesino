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
import Classes.Tarea;
import Funcionalidades.GestorAnimales;
import Funcionalidades.GestorCultivos;
import structures.DynamicArrayList;
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
    
    public static GestorAnimales gestorAnimales = new GestorAnimales();
    public static GestorCultivos gestorCultivos = new GestorCultivos();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarea tarea = new Tarea();
        DynamicArrayList<Tarea> necesidades = new DynamicArrayList<>();
        necesidades.pushBack(tarea);
        
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
        cereal.leer().print();
        frutal.leer().print();
        hortaliza.leer().print();
        leguminosa.leer().print();
        ornamental.leer().print();
        raiz_y_tuberculo.leer().print();
        oleaginosa.leer().print();
          
//           bovino.leer().print();
//     
//        String id = sc.nextLine();
//        System.out.println(gestorAnimales.buscarIdBovino(id));
//        System.out.println(gestorAnimales.buscarIdAve("AA20"));
            bovino.leer().print();
            ave.leer().print(); 
            caballo.leer().print();
            ovino.leer().print();
            pez.leer().print();
            porcino.leer().print();
////        
//        id = sc.nextLine();
//        int edad = sc.nextInt();      
//        gestorAnimales.actualizarBovinoEdad(id, edad);
//        bovino.leer().print();
//        sc.nextLine();
        
//        String id = sc.nextLine();
//        gestorAnimales.eliminarCaballo(id);
//        System.out.println(caballo.leer().size());
//        caballo.leer().print();
    }
    
}

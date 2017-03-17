package cinema;
import java.util.Scanner;

/**
 * @author Anggy Arguello - Holmes Ayala
 */
public class Cinema {
    Scanner leer = new Scanner(System.in);
    private Sala sala1;
    private Usuario usuarios[];
    private int contador = 0;
    
    public Cinema() {
        caracteristicasCinema();
        sala1.imprimirSala();
        menu();
    }
     
    
    
    private void caracteristicasCinema(){
        int filas,columnas;
        System.out.println("Ingrese numero de filas: ");
        filas = leer.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        columnas = leer.nextInt();
        usuarios = new Usuario[filas * columnas];
        boolean validar;
        int generales, preferenciales, ejecutivas;
        do{
            validar = true;
            System.out.println("Numero de sillas");
            System.out.print("Generales: ");
            generales = leer.nextInt();
            System.out.print("Preferenciales: ");
            preferenciales = leer.nextInt();
            System.out.print("Ejecutivas: ");
            ejecutivas = leer.nextInt();
            if(generales + preferenciales + ejecutivas != filas){
                System.out.println("Configuracion no valida!");
                validar = false;
            }
        }while(!validar);
        sala1 = new Sala(filas, columnas, generales, preferenciales, ejecutivas);
    }
    
    private void menu(){
        boolean validar;
        int opcion = 0;
        do{
            validar = true;
            System.out.println("1- Ingresar usuario\n2- Rendicion de cuentas\nOpcion: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    solicitarUsuario();
                    break;
                case 2:
                    
                    break;
            }
            /*
            if(opcion < 1 || opcion > 2){
                System.out.println("Opcion NO valida");
                validar = false;
            }
            */
        }while(opcion != 2);
        
    }
    
    private void solicitarUsuario(){
        System.out.println("Datos del cliente");
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Genero (M/F): ");
        String genero = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("Identificacion: ");
        int identificacion = leer.nextInt();
        sala1.imprimirSala();
        boolean validar;
        do{
            validar = true;
            System.out.print("Escoja una silla (x = No disponibles)\n");
            System.out.print("G: General = 5000\nP: Preferencial = 7000\nE: Ejecutiva = 10000\nNumero silla: ");
            int silla = leer.nextInt();
            validar = sala1.disponibilidadSilla(silla);
            if(!validar){
                System.out.println("La silla ya esta Ocupada.");
            }
        }while(!validar);
        usuarios[contador] = new Usuario(nombre, genero, edad, identificacion);
        contador++;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
    }
    
}

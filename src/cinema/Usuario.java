
package cinema;

/**
 *
 * @author Anggy Arguello - Holmes Ayala
 */
public class Usuario {
    
    private final String nombre;
    private final String genero;
    private final int edad;
    private final int identificacion;

    public Usuario(String nombre, String genero, int edad, int identificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    
    public void obtenerDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
        System.out.println("Identificacion: "+identificacion);
    }
    
    
}

package cinema;

/**
 *
 * @author Anggy Arguello - Holmes Ayala
 */
public class Sala {
    
    private int filas;
    private int columnas;
    private int generales;
    private int preferenciales;
    private int ejecutivas;
    private Silla sillas[][];
    
    public Sala(int filas, int columnas, int generales, int preferenciales, int ejecutivas) {
        this.filas = filas;
        this.columnas = columnas;
        this.generales = generales;
        this.preferenciales = preferenciales;
        this.ejecutivas = ejecutivas;
        this.sillas = new Silla[filas][columnas];
        llenarSillas();
    }

    private void llenarSillas(){
        int numeroSilla = 1;
        int contarFilas = 0;
        for(int i = 0; i < generales; i++){
            contarFilas++;
            for(int j = 0; j < columnas; j++){
                sillas[i][j] = new Silla(1, numeroSilla, 5000);
                numeroSilla++;
            }
        }
        for(int i = contarFilas; i < preferenciales + generales; i++){
            contarFilas++;
            for(int j = 0; j < columnas; j++){
                sillas[i][j] = new Silla(2, numeroSilla, 7000);
                numeroSilla++;
            }
        }
        for(int i = contarFilas; i < ejecutivas + preferenciales + generales; i++){
            contarFilas++;
            for(int j = 0; j < columnas; j++){
                sillas[i][j] = new Silla(3, numeroSilla, 11000);
                numeroSilla++;
            }
        }
    }
    
    public void imprimirSala(){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(sillas[i][j].getNumeroSilla() != 0){
                    System.out.print(sillas[i][j].getNumeroSilla() + " ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }
    
    public boolean disponibilidadSilla(int silla){
        boolean validar = false;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(sillas[i][j].getNumeroSilla() == silla){
                    silla = 0;
                    sillas[i][j].setNumeroSilla(silla);
                    validar = true;
                    return validar;
                }
            }
        }
        return validar;
    }
    
}
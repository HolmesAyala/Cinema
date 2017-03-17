package cinema;

/**
 *
 * @author Anggy Arguello - Holmes Ayala
 */
public class Silla {
    int tipoSilla;
    int numeroSilla;
    int precio;

    public Silla(int tipoSilla, int numeroSilla, int precio) {
        this.tipoSilla = tipoSilla;
        this.numeroSilla = numeroSilla;
        this.precio = precio;
    }

    public int getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(int tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public int getNumeroSilla() {
        return numeroSilla;
    }

    public void setNumeroSilla(int numeroSilla) {
        this.numeroSilla = numeroSilla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

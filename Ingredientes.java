package practica_10;

/**
 *
 * @author MauriRod
 */
public abstract class Ingredientes {

    private String nombre;

    public Ingredientes(String _nombre) {
        this.nombre = _nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public abstract int getTipo();
}

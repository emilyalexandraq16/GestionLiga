/**
 * Clase que representa un equipo de la Liga
 */

public class Equipo {
    private String nombre;

    public Equipo (String nombre) {
        this.nombre= nombre;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre= nombre;}
}

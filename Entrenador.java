/**
 * Clase que representa el entrenador de un equipo
 */

public class Entrenador{
    private String nombre;
    private String formacionPref;

    public Entrenador(String nombre, String formacionPref) {
        this.nombre=nombre;
        this.formacionPref=formacionPref;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    public String getFormacionPref() {return formacionPref;}
    public void setFormacionPreferida(String formacionPref) {this.formacionPref=formacionPref;}

    public String toString() {
        return "ENTRENADOR: " + nombre + " FORMACION: " + formacionPref;
    }
}

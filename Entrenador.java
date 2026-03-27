/**
 * Clase que representa el entrenador de un equipo
 */

public class Entrenador{
    /**Contador total de entrenadores creados */
    private static int contadorEntre= 0;

    private String nombre;
    private String formacionPref;

    /**
     * Contructor de Entrenador
     * @param nombre Nombre completo
     * @param formacionPref Sistema táctico
     */

    public Entrenador(String nombre, String formacionPref) {
        this.nombre=nombre;
        this.formacionPref=formacionPref;
        contadorEntre++;
    }

/** @return El nombre del entrenador */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

/**@return La fromacion preferida del jugador*/
    public String getFormacionPref() {return formacionPref;}
    public void setFormacionPreferida(String formacionPref) {this.formacionPref=formacionPref;}


@Override
    public String toString() {
        return "ENTRENADOR: " + nombre + " FORMACION: " + formacionPref;
    }

/** @return Cantidada total de entrenadores*/
    public static int getContadorEntre() {
        return contadorEntre;
    }
}

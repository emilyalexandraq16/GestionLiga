import java.time.LocalDate;
/** Clase para representar un jugador de la Liga */
public class Jugador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;

    /**
     * Constructor de Jugador
     * @param nombre Nombre en la camiseta.
     * @param fechaNacimiento Fecha de nacimineto.
     * @param posicion Posicion del jugador en el campo.
     */

    public Jugador(String nombre, LocalDate fechaNacimiento, String posicion) {
        this.nombre= nombre;
        this.fechaNacimiento= fechaNacimiento;
        this.posicion= posicion;
        this.traspasoSolicitado= false;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre= nombre;}

    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento= fechaNacimiento;}

    public String getPosicion() {return posicion;}
    public void setPosicion (String posicion) {this.posicion= posicion;}

    public boolean traspasoSolicitado() {return traspasoSolicitado;}
    public void setTraspasoSolicitado(boolean traspasoSolicitado) {this.traspasoSolicitado= traspasoSolicitado;}

    public String toString() {
        return "JUGADOR: " + nombre + " FECHA DE NACIMIENTO: " + fechaNacimiento + " POSICION: " + posicion + " TRASPASO: " + (traspasoSolicitado ? "si" : "no");
    }
}

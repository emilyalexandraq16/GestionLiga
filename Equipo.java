import java.util.ArrayList;

/**
 * Clase que representa un equipo de la Liga
 */

public class Equipo {
    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo (String nombre) {
        this.nombre= nombre;
        this.entrenador= null;
        this.jugadores= new ArrayList<Jugador>();
    }

    public void añadirJugador(Jugador j) {
        this.jugadores.add(j);
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador= entrenador;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre= nombre;}

    public String toString() {
        return "EQUIPO: " + nombre;
    }
}

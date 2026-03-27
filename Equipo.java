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
        String nombreEntrenador = (entrenador!= null)? entrenador.getNombre() : "Sin entrenador";
        return "EQUIPO: " + nombre + "ENTRENADOR: " + nombreEntrenador + "Nº JUGADORES: " + jugadores.size();
    }

    public void verPlantilla() {
            System.out.println("Plantilla del " + this.nombre);
            for(Jugador j: jugadores) {
                System.out.println(j.toString());
            }
        }

        public void transferirJugador(Jugador jug, Equipo destino) {
            if (this.jugadores.contains(jug)&& jug.traspasoSolicitado()) {
                this.jugadores.remove(jug);
                destino.añadirJugador(jug);
                jug.cancelaTraspaso();

                System.out.println("Traspaso realizado: El jugador " + jug.getNombre() + " ahora juega en " + destino.getNombre());
            } else {
                System.out.println("Traspaso no no realizado: El jugador no pertenece al equipo o no ha solicitado el traslado");
            }
        }
}

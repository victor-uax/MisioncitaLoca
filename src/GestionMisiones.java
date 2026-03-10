import java.util.ArrayList;

public class GestionMisiones {

    // atributos
    private ArrayList<Mision> misiones;

    /**
     * Metodo constructor de la clase GestionMisiones
     * Defino el ArrayList misiones
     */
    public GestionMisiones() {
        this.misiones = new ArrayList<>();
    }

    /**
     * Devuelve el id de la nueva misión creada
     *
     * @param id
     * @param nombre
     * @param dificultad
     * @param nivelRecomendado
     * @param recompensaExperiencia
     * @param completada
     * @return id de la misión creada
     */
    public int crearMision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada){

        int idMisionCreada;

        //  creamos la misión
        Mision mision = new Mision(id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        //  agregamos la misión
        idMisionCreada = agregarMision(mision);

        return idMisionCreada;
    }

    public int agregarMision(Mision mision){
        this.misiones.add(mision);

        return mision.getId();
    }
}

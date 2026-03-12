package cocineros;

import platosCombinados.Mision;

import java.util.ArrayList;

public class GestionMisiones {

    // atributos
    private ArrayList<Mision> misiones;

    /**
     * Metodo constructor de la clase cocineros.GestionMisiones
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

    /**
     * Devuelve un en una cadena de texto todas las misiones con su información
     * @return String lista de las misiones
     */
    public String listarMisiones(){
        StringBuilder lista;

        lista = new StringBuilder("\nLista de misiones:\n");

        for( Mision mision : misiones){
            lista.append("\t");
            lista.append(this.misiones.toString());
            lista.append("\n");
        }
        lista.append("}");

        return lista.toString();
    }

    /**
     * Busca una Mision por su id en el ArrayList misiones mientras la condición
     * seguirBuscando sea true y si la encuentra el boolean es false y se sale
     * del while. Devuelve la Mision entera si la encuentra o null si no la encuentra
     * @param id
     * @return Mision misionBuscada si la encuentra o null si no la encuentra
     */
    public Mision buscarMisionPorId(int id){
        Mision misionBuscada = null;
        boolean seguirBuscando = true;
        int posicion = 0;

        while(!misiones.isEmpty() && seguirBuscando) {
                misionBuscada = misiones.get(posicion);

                if (misionBuscada.getId() == id) {
                    //misionBuscada = misiones.get(posicion);
                    seguirBuscando = false;
                }
            posicion++;
        }
        return misionBuscada;
    }

    /**
     *Busca la misión y el resultado lo guarda en una variable que luego va acomprobar
     * @param id de la Mision
     * @return misionEliminada que va a ser la Mision entera si la encuentra o null
     * si no lo encuentra
     */
    public Mision eliminarMisionPorId(int id){
        Mision misionEliminada = null;

        misionEliminada = buscarMisionPorId(id);

        if( misionEliminada != null ){
            misiones.remove(misionEliminada);
        }
        return misionEliminada;
    }

    /**
     *      POLIMORFISMO:
     *      - dos o más métodos
     *      - tienen el mismo nombre
     *      - no tienen por qué hacer lo mismo
     *      - reciben distintos tipos de parámetros
     * @param mision
     * @return
     */
    public String eliminarMision(Mision mision){
        String respuesta = "No se ha podido eliminar la misión " + mision;

        if( mision != null ){
            misiones.remove(mision);
            respuesta = "Se ha eliminado correctamente la misión: ";
        }
        return respuesta + mision.toString();
    }

    /**
     * Cuenta las misiones del array dinámico
     * @return int numMisiones
     */
    public int contarMisiones(){
        return misiones.size();
    }

}
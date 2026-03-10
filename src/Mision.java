public class Mision {

    // atributos
    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private int recompensaExperiencia;
    private boolean completada;

    /**
     * Metodo constructor de la clase Mision
     * @param id
     * @param nombre
     * @param dificultad
     * @param nivelRecomendado
     * @param recompensaExperiencia
     * @param completada
     */
    public Mision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomendado = nivelRecomendado;
        this.recompensaExperiencia = recompensaExperiencia;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del objeto Mision
     * @return String nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve la dificultad del objeto Mision
     * @return String dificultad
     */
    public String getDificultad(){
        return dificultad;
    }
    /**
     * Devuelve el nivel recomendado del objeto Mision
     * @return int nivelRecomendado
     */
    public int getNivelRecomendado(){
        return nivelRecomendado;
    }
    public int getRecompensaExperiencia(){
        return recompensaExperiencia;
    }
    public boolean getCompletada(){
        return completada;
    }

    @Override
    public String toString(){
        String resultado;

        resultado = String.format(new String("Misión{ id: %d, nombre: %s, dificultad: %s, nivel recomendado: %d, recompensa experiencia: %d, completada %b"), id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        return resultado;
    }
}

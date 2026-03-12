package camareros;

import cocineros.GestionMisiones;

import java.lang.System;
import java.util.Scanner;

public class InterfazConsola {

    // atributos
    private final GestionMisiones gestor;
    private final Scanner sc;

    /**
     * Constructor del metodo
     * @param gestor
     */
    public InterfazConsola(GestionMisiones gestor){
        this.gestor = gestor;
        this.sc = new Scanner(System.in);
    }

    /**
     * Metodo que inicia la consola muestra el menú, lee la opción del usuario y realiza la
     * opción elegida
     */
    public void iniciar(){
        int opcion;

        System.out.println("Iniciando consola...");

        mostrarMenu();

        opcion = leerOpcion();

        lanzarAccion(opcion);
    }

    /**
     * Imprime el menú que verá el usuario
     */
    public void mostrarMenu(){
        System.out.println("\t MENÚ DE LA GESTIÓN DE MISIONES, BIENVENIDO CAPITÁN");
        System.out.println("================================================================");
        System.out.println("1. Listar misiones");
        System.out.println("2. Crear misión");
        System.out.println("3. Buscar mision");
        System.out.println("\n");
        System.out.println("9. Eliminar misión");
        System.out.println("\n");
        System.out.println("0. Salir");
        System.out.println("================================================================");
        System.out.println("¿Que desea hacer?");
    }

    /**
     * Mediante un escáner lee la opción elegida por el usuario y la devuelve
     * @return int opcionElegida
     */
    private int leerOpcion(){
        int opcion;
        //Scanner sc = new Scanner(System.in);

       opcion = sc.nextInt();

       return opcion;
    }

    /**
     * Realiza la acción recibida
     * @param opcion
     */
    public void lanzarAccion(int opcion){

        switch(opcion){
            case 0:
                System.out.println("Chao pescao");
                break;
            case 1:
                accionMostrarTexto(gestor.listarMisiones());
                break;
            case 2:
                this.accionCrearMision();
        }
    }
    // mostrar menú

    // pedir distintos tipos de datos
    // llamar a las distintas funcionalidades del gestor

    /**
     * Metodo para mostrar textos en otros metodos
     * @param texto
     */
    private void accionMostrarTexto(String texto){
        System.out.println(texto);
    }

    /**
     * Crea la misión con sus diferentes atributos
     */
    private void accionCrearMision(){
        int id;
        String nombre;
        String dificultad;
        int nivelRecomendado;
        int recompensaExperiencia;
        boolean completada;

        //Scanner sc = new Scanner(System.in);

        System.out.println("Dime los datos de la nueva misión: ");

        nombre = pedirTexto("\tNombre: ");

        dificultad = pedirTexto("\tDificultad: ");

        nivelRecomendado = pedirEntero("\tNivel Recomendado: ");

        recompensaExperiencia = pedirEntero("\tRecompensa experiencia: ");

        completada = false;
    }

    /**
     * Imprime un mensaje y guarda la respuesta para el meotodo accionCrearMision porque el codigo se repite, en este caso sirve para los atributos de tipo String
     * @param mensaje
     * @return String respuesta
     */
    private String pedirTexto(String mensaje){
        String respuesta;
        //Scanner sc = new Scanner(System.in);

        System.out.println(mensaje);
        respuesta = sc.nextLine();

        return respuesta;
    }

    /**
     * Imprime un mensaje y guarda la respuesta para el meotodo accionCrearMision porque el codigo se repite, en este caso sirve para los atributos de tipo int
     * @param mensaje
     * @return int entero
     */
    private int pedirEntero(String mensaje){
        int entero;
        //Scanner sc = new Scanner(System.in);

        System.out.println(mensaje);
        entero = sc.nextInt();

        return entero;
    }
}

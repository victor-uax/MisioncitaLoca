package camareros;

import cocineros.GestionMisiones;

import java.lang.System;
import java.util.Scanner;

public class InterfazConsola {

    // atributos
    private GestionMisiones gestor;
    private Scanner sc;

    /**
     * Constructor del metodo
     * @param gestor
     */
    public InterfazConsola(GestionMisiones gestor){
        this.gestor = gestor;
    }

    public void iniciar(){
        int opcion;

        System.out.println("Iniciando consola...");

        mostrarMenu();

        opcion = leerOpcion();

        lanzarAccion(opcion);
    }

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

    private int leerOpcion(){
        int opcion;
        //Scanner sc = new Scanner(System.in);

       opcion = sc.nextInt();

       return opcion;
    }

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

    private void accionMostrarTexto(String texto){
        System.out.println(texto);
    }

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



        System.out.println("\tRecompensa experiencia: ");
        recompensaExperiencia = sc.nextInt();

        completada = false;
    }

    private String pedirTexto(String mensaje){
        String respuesta;
        //Scanner sc = new Scanner(System.in);

        System.out.println(mensaje);
        respuesta = sc.nextLine();

        return respuesta;
    }

    private int pedirEntero(String mensaje){
        int entero;
        //Scanner sc = new Scanner(System.in);

        System.out.println(mensaje);
        entero = sc.nextInt();

        return entero;
    }

}

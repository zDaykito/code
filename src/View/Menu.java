package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Juegos;
import Model.Libros;
import Model.Peliculas;
import Model.Usuario;

public class Menu {

    public void mostrarUsuarios(ArrayList<Usuario> listaUsuarios){
        for (Usuario u : listaUsuarios) {
            System.out.println(u.toString());
        }
    }

    public void mostrarPeliculas(ArrayList<Peliculas> listaPeliculas){
        for (Peliculas p : listaPeliculas) {
            System.out.println(p.toString());
        }
    }

    public void mostrarLibros(ArrayList<Libros> listaLibros){
        for (Libros l : listaLibros) {
            System.out.println(l.toString());
        }
    }

    public void mostrarJuegos(ArrayList<Juegos> listaJuegos){
        for (Juegos j : listaJuegos) {
            System.out.println(j.toString());
        }
    }

    /* LOGIN */

    public int menuLogin() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una opción: ");
            System.err.println("------------------------");
            System.out.println("1. Iniciar sesión [Admin]");
            System.out.println("2. Iniciar sesión [Cliente]");
            System.err.println("3. Registrarse");
            System.out.println("4. Salir");
            System.err.println("------------------------");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    /* ADMIN */

    public int menuAdmin() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una opción: ");
            System.err.println("------------------------");
            System.out.println("1. Agregar Contenido");
            System.out.println("2. Eliminar Contenido");
            System.out.println("3. Editar Contenido");
            System.out.println("4. Banear Usuario");
            System.out.println("5. Ver Lista de Amigos de Usuario");
            System.out.println("6. Ver Biblioteca Personal de Usuario");
            System.err.println("------------------------");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public 

    public int menuVerAdmin() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una opción: ");
            System.err.println("------------------------");
            System.out.println("1. Ver Biblioteca de Peliculas");
            System.out.println("2. Ver Biblioteca de Libros");
            System.out.println("3. Ver Biblioteca de Juegos");
            System.err.println("------------------------");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    /* CLIENTE */

    public int menuCliente() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una Opción: ");
            System.err.println("------------------------");
            System.out.println("1. Ver Contenidos");
            System.out.println("2. Ver Lista de Amigos");
            System.out.println("3. Ver Lista de Deseos");
            System.out.println("4. Ver Lista de Favoritos");
            System.err.println("------------------------");
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public int menuVerContenidoCliente() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una opción: ");
            System.err.println("------------------------");
            System.out.println("1. Ver Biblioteca de Peliculas");
            System.err.println("2. Agregar Pelicula por Nombre");
            System.out.println("3. Agregar Pelicula por Director");
            System.err.println("------------------------");
            System.out.println("4. Ver Biblioteca de Libros");
            System.err.println("5. Agregar Libro por Nombre");
            System.out.println("6. Agregar Libro por Autor");
            System.err.println("------------------------");
            System.out.println("7. Ver Biblioteca de Juegos");
            System.err.println("8. Agregar Juego por Nombre");
            System.out.println("9. Agregar Juego por Plataforma");
            System.err.println("------------------------");
            opcion = sc.nextInt();
        }
        return opcion;
    }
}
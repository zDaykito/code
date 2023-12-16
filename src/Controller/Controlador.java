package Controller;

import java.util.ArrayList;

import Model.Data;
import Model.Juegos;
import Model.Libros;
import Model.Peliculas;
import Model.Usuario;
import View.Menu;

public class Controlador {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Peliculas> listaPeliculas;
    private ArrayList<Libros> listaLibros;
    private ArrayList<Juegos> listaJuegos;
    private String directorioUsuarios;
    private String directorioPeliculas;
    private String directorioLibros;
    private String directorioJuegos;
    private Menu menu;
    private Data data;

    public Controlador() {
        menu = new Menu();
        data = new Data();
    }

    public void iniciarMenuLogin() {
        int opcion;
        do {
            opcion = menu.menuLogin();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error, elige una opción válida.");
            }
        } while (opcion != 4); 
    }
}
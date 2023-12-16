package Model;

import java.util.ArrayList;
public class Usuario {
    private int id;
    private String tipoUsuario;
    private String nombreUsuario;
    private String contrasena;
    private ArrayList<Contenido> bibliotecaPersonal;
    private ArrayList<String> listaAmigos;
    private ArrayList<String> listaDeseos;

    /* CONSTRUCTOR */

    public Usuario(int id, String tipoUsuario, String nombreUsuario, String contrasena) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.bibliotecaPersonal = new ArrayList<Contenido>();
        this.listaAmigos = new ArrayList<String>();
        this.listaDeseos = new ArrayList<String>();
    }

    /* GETTERS */

    public int getId() {
        return id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public ArrayList<Contenido> getBibliotecaPersonal() {
        return bibliotecaPersonal;
    }

    public ArrayList<String> getListaAmigos() {
        return listaAmigos;
    }

    public ArrayList<String> getListaDeseos() {
        return listaDeseos;
    }

    /* SETTERS */

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setBibliotecaPersonal(ArrayList<Contenido> bibliotecaPersonal) {
        this.bibliotecaPersonal = bibliotecaPersonal;
    }

    public void setListaAmigos(ArrayList<String> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public void setListaDeseos(ArrayList<String> listaDeseos) {
        this.listaDeseos = listaDeseos;
    }

    /* METODOS */
    
    @Override
    public String toString(){
        return id + tipoUsuario + nombreUsuario + contrasena;
    }
}
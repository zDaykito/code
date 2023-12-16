package Model;

import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Usuario> listaBaneados;

    public Administrador(String tipoUsuario, String nombreUsuario, String contrasena) {
        super(tipoUsuario, nombreUsuario, contrasena);
        this.listaBaneados = new ArrayList<>();
    }

    public ArrayList<Usuario> getListaBaneados() {
        return listaBaneados;
    }

    public void setListaBaneados(ArrayList<Usuario> listaBaneados) {
        this.listaBaneados = listaBaneados;
    }
}
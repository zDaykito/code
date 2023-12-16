package Model;

public class Juegos extends Contenido {
    private String genero;
    private String plataforma;
    private String desarrollador;

    public Juegos(String nombre, int id, int precio, String genero, String plataforma, String desarrollador) {
        super(nombre, id, precio);
        this.genero = genero;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString(){
        return super.toString() + genero + plataforma + desarrollador;
    }
}

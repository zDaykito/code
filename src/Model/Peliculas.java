package Model;

public class Peliculas extends Contenido {
    private String director;
    private String genero;
    private int duracion;

    /* CONSTRUCTOR */

    public Peliculas(String nombre, int id, int precio, String director, String genero, int duracion) {
        super(nombre, id, precio);
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    /* GETTERS */

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    /* SETTERS */

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /* METODOS */

    @Override
    public String toString() {
        return super.toString() + director + genero + duracion;
    }
}

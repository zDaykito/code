package Model;

public class Libros extends Contenido {
    private String autor;
    private String categoria;
    private int capitulos;

    /* CONSTRUCTOR */

    public Libros(String nombre, int id, int precio, String autor, String categoria, int capitulos) {
        super(nombre, id, precio);
        this.autor = autor;
        this.categoria = categoria;
        this.capitulos = capitulos;
    }

    /* GETTERS */

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCapitulos() {
        return capitulos;
    }

    /* SETTERS */

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    /* METODOS */

    @Override
    public String toString(){
        return super.toString() + autor + categoria + capitulos;
    }
}

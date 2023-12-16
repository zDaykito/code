package Model;

public class Contenido {
    private String nombre;
    private int id;
    private int precio;

    /* CONSTRUCTOR */

    public Contenido(String nombre, int id, int precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    /* GETTERS */

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    /* SETTERS */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /* METODOS */

    @Override
    public String toString(){
        return nombre + id + precio;
    }
}

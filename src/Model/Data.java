package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private String directorioUsuarios;
    private String directorioPeliculas;
    private String directorioLibros;
    private String directorioJuegos;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Peliculas> listaPeliculas;
    private ArrayList<Libros> listaLibros;
    private ArrayList<Juegos> listaJuegos;

    /* CONSTRUCTOR */
    public Data() {}
    public Data(String directorioUsuarios, String directorioPeliculas, String directorioLibros, String directorioJuegos) {
        this.directorioUsuarios = directorioUsuarios;
        this.directorioPeliculas = directorioPeliculas;
        this.directorioLibros = directorioLibros;
        this.directorioJuegos = directorioJuegos;
    }

    /* GETTERS */

    public String getDirectorioUsuarios() {
        return directorioUsuarios;
    }

    public String getDirectorioPeliculas() {
        return directorioPeliculas;
    }

    public String getDirectorioLibros() {
        return directorioLibros;
    }

    public String getDirectorioJuegos() {
        return directorioJuegos;
    }

    /* SETTERS */

    public void setDirectorioPeliculas(String directorioPeliculas) {
        this.directorioPeliculas = directorioPeliculas;
    }

    public void setDirectorioLibros(String directorioLibros) {
        this.directorioLibros = directorioLibros;
    }

    public void setDirectorioJuegos(String directorioJuegos) {
        this.directorioJuegos = directorioJuegos;
    }

    public void setDirectorioUsuarios(String directorioUsuarios) {
        this.directorioUsuarios = directorioUsuarios;
    }

    /* METODOS ADMIN */

    /* METODOS USUARIO */

    /* METODOS CSV */

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    public void leerCSVUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(directorioUsuarios))) {
            br.readLine();
            String linea;

            while((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                int id = Integer.valueOf(dato[0]);
                Usuario nuevoUsuario = new Usuario(id, dato[1], dato[2], dato[3]);
                agregarUsuario(nuevoUsuario);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarCSVUsuarios() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directorioUsuarios))) {
            for (Usuario usuario : this.listaUsuarios) {
                bw.write(String.join(",", String.valueOf(usuario.getId()), usuario.getTipoUsuario(), usuario.getNombreUsuario(), usuario.getContrasena()));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarPelicula(Peliculas pelicula) {
        this.listaPeliculas.add(pelicula);
    }

    public void leerCSVPeliculas() {
        try (BufferedReader br = new BufferedReader(new FileReader(directorioPeliculas))) {
            br.readLine();
            String linea;

            while((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                int id = Integer.valueOf(dato[1]);
                int precio = Integer.valueOf(dato[2]);
                int duracion = Integer.valueOf(dato[5]);
                Peliculas nuevaPelicula = new Peliculas(dato[0], id, precio, dato[3], dato[4], duracion);
                agregarPelicula(nuevaPelicula);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarCSVPeliculas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directorioPeliculas))) {
            for (Peliculas pelicula : this.listaPeliculas) {
                bw.write(String.join(",", pelicula.getNombre(), String.valueOf(pelicula.getId()), String.valueOf(pelicula.getPrecio()), pelicula.getDirector(), pelicula.getGenero(), String.valueOf(pelicula.getDuracion())));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarLibro(Libros libro) {
        this.listaLibros.add(libro);
    }

    public void leerCSVLibros() {
        try (BufferedReader br = new BufferedReader(new FileReader(directorioLibros))) {
            br.readLine();
            String linea;

            while((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                int id = Integer.valueOf(dato[1]);
                int precio = Integer.valueOf(dato[2]);
                int capitulos = Integer.valueOf(dato[5]);
                Libros nuevoLibro = new Libros(dato[0], id, precio, dato[3], dato[4], capitulos);
                agregarLibro(nuevoLibro);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarCSVLibros() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directorioLibros))) {
            for (Libros libro : this.listaLibros) {
                bw.write(String.join(",", libro.getNombre(), String.valueOf(libro.getId()), String.valueOf(libro.getPrecio()), libro.getAutor(), libro.getCategoria(), String.valueOf(libro.getCapitulos())));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarJuego(Juegos juego) {
        this.listaJuegos.add(juego);
    }

    public void leerCSVJuegos() {
        try (BufferedReader br = new BufferedReader(new FileReader(directorioJuegos))) {
            br.readLine();
            String linea;

            while((linea = br.readLine()) != null) {
                String[] dato = linea.split(",");
                int id = Integer.valueOf(dato[1]);
                int precio = Integer.valueOf(dato[2]);
                Juegos nuevoJuego = new Juegos(dato[0], id, precio, dato[3], dato[4], dato[5]);
                agregarJuego(nuevoJuego);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarCSVJuegos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directorioJuegos))) {
            for (Juegos juego : this.listaJuegos) {
                bw.write(String.join(",", juego.getNombre(), String.valueOf(juego.getId()), String.valueOf(juego.getPrecio()), juego.getGenero(), juego.getPlataforma(), juego.getDesarrollador()));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarUsuarioRegistro(Usuario usuario) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            System.out.print("Ingrese Nombre de Usuario: ");
            String nombreUsuario = sc.nextLine();
            System.out.print("Ingrese Contraseña: ");
            String contrasena = sc.nextLine();
            System.out.print("Ingrese Tipo de Usuario: ");
            String tipoUsuario = sc.nextLine();

            Usuario nuevoUsuario = new Usuario(id, nombreUsuario, contrasena, tipoUsuario);
            agregarUsuario(nuevoUsuario);
        }
    }

    /* CONTENIDOS */

    public void eliminarPeliculaId(int id) {
        for (int i = 0; i < this.listaPeliculas.size(); i++) {
            if (this.listaPeliculas.get(i).getId() == id) {
                this.listaPeliculas.remove(i);
                return;
            }
        }
    }

    public void eliminarLibroId(int id) {
        for (int i = 0; i < this.listaLibros.size(); i++) {
            if (this.listaLibros.get(i).getId() == id) {
                this.listaLibros.remove(i);
                return;
            }
        }
    }

    public void eliminarJuegoId(int id) {
        for (int i = 0; i < this.listaJuegos.size(); i++) {
            if (this.listaJuegos.get(i).getId() == id) {
                this.listaJuegos.remove(i);
                return;
            }
        }
    }
}





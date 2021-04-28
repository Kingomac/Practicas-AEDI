package ej5;

import java.util.List;

/**
 *
 * @author Mario
 */
public class CD {

    private String autor;
    private String titulo;
    private List<Cancion> canciones;

    public CD(String a, String t, List<Cancion> c) {
        canciones = c;
        autor = a;
        titulo = t;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

}

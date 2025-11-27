/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author nancy
 */
public class Publicacion {
    private String usuario;
    private String contenido;
    private int likes;
    private int vistas;

    public Publicacion(String usuario, String contenido, int likes, int vistas) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.likes = likes;
        this.vistas = vistas;
    }

    public String getUsuario()   { return usuario; }
    public String getContenido() { return contenido; }
    public int getLikes()        { return likes; }
    public int getVistas()       { return vistas; }

    // Crear nueva publicación con likes modificados (inmutable)
    public Publicacion conLikes(int nuevosLikes) {
        return new Publicacion(usuario, contenido, nuevosLikes, vistas);
    }

    @Override
    public String toString() {
        return usuario + ": \"" + contenido + "\" | likes=" + likes + ", vistas=" + vistas;
    }
}

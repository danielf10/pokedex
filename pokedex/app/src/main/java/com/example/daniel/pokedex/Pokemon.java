package com.example.daniel.pokedex;

/**
 * Created by Daniel on 19/06/2017.
 */

public class Pokemon {

    private String nombre;
    private String  tipo;
    private String ataques;
    private String area;
    private String urlImangen;
    private String urlVideo;

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    private String evolucion;


    public Pokemon() {

    }

    public Pokemon(String nombre, String tipo, String urlImangen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.urlImangen = urlImangen;
    }

    public Pokemon(String nombre, String tipo, String ataques, String area, String urlImangen, String urlVideo,String evolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataques = ataques;
        this.area = area;
        this.urlImangen = urlImangen;
        this.urlVideo = urlVideo;
        this.evolucion= evolucion;
    }
    public Pokemon(String nombre, String tipo, String ataques, String area, String urlImangen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataques = ataques;
        this.area = area;
        this.urlImangen = urlImangen;

    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtaques() {
        return ataques;
    }

    public void setAtaques(String ataques) {
        this.ataques = ataques;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUrlImangen() {
        return urlImangen;
    }

    public void setUrlImangen(String urlImangen) {
        this.urlImangen = urlImangen;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}

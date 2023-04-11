/*
Ckase molde de usuario. Esta clase representaría a los usuarios 
del programa y almacenaría su información personal y sus pronósticos 
deportivos.
 */
package Entidades;

public class Usuario {
    private String nombre;
    private int puntaje;
    private int[][] pronostico;

    public Usuario() {
    }

    public Usuario(String nombre, int puntaje, int[][] pronostico) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.pronostico = pronostico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int[][] getPronostico() {
        return pronostico;
    }

    public void setPronostico(int[][] pronostico) {
        this.pronostico = pronostico;
    }


    }

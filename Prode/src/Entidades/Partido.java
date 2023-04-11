/*
Esta clase representaría a cada partido y almacenaría 
información sobre los equipos involucrados, la fecha y hora del juego, 
y el resultado.
 */
package Entidades;

import java.util.Date;

public class Partido {
    
    private String local;
    private String visitante;
    
    private int fecha;
    private int orden;
    
    // Un atributo Pronósticos que sea un arreglo con dimensión Cantidad de jugadores
    
    // Constructores

    public Partido() {
    }

    public Partido(String local, String visitante, int fecha, int orden) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.orden = orden;
    }
    
    // Getter y setter

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }


    
    
    
}

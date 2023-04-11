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
    
    private int[][] fixture;
    
    // Constructores

    public Partido() {
    }

    public Partido(String local, String visitante, int fecha, int orden, int[][] fixture) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.orden = orden;
        this.fixture = fixture;
    }

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

    public int[][] getFixture() {
        return fixture;
    }

    public void setFixture(int[][] fixture) {
        this.fixture = fixture;
    }

       
}

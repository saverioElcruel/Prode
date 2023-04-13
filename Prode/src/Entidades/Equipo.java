/*
Esta clase representaría a los equipos deportivos y 
almacenaría información sobre sus jugadores, estadísticas 
y resultados anteriores.


ESTA CLASE TODAVÍA NO ESTÄ VINCULADA AL FIXTURE QUE SE ALMACENA EN LA CLASE PARTIDO
HACER ESO ANTES DE ACTUALIZAR PUNTAJE DE EQUIPO

 */
package Entidades;


public class Equipo {
    private String nombre;
    private String nombreSimplificado;
    private String dt;
    
//    private String[] arqueros;
//    private String[] defensores;
//    private String[] mediocampistas;
//    private String[] delanteros;
    
    // Atributos estadísticos
    private int puntajeGeneral;
    private int pg;
    private int pe;
    private int pp;
    private int gf;
    private int gc;
    
        // Opcionales
//            private double posesionDeLaPelota;
//            private String goleador;
    
    
    // Constructores

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntajeGeneral(int puntajeGeneral) {
        this.puntajeGeneral = puntajeGeneral;
    }
    
    
    
}






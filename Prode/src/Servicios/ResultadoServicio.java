/*

 */
package Servicios;

import Entidades.Resultado;

public class ResultadoServicio {
    
    
    
    // obtenerResultado() --> Método para simular resultado 
    
    public Resultado crearResultado(){
        int golesLocal = (int)(Math.random()*5+0);
        int golesVisitante = (int)(Math.random()*5+0);
        
        return new Resultado(golesLocal,golesVisitante);
    }
    
 
}

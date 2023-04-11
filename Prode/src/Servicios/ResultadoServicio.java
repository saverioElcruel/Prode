/*

 */
package Servicios;

import Entidades.Resultado;

public class ResultadoServicio {
    
    
    
    // obtenerResultado() --> Método para simular resultado 
    
    
    public Resultado crearResultado(){
        int resultado[][]= new int[26][27];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                resultado[i][j]=(int)(Math.random()*5+0);
            } 
        }
        return new Resultado(resultado);
    }
    
 
}

/*
    a) Un método para Llamar a fixture, iterar una fecha y cargar todos los equipos.
    b) Un método para actualizar puntaje del equipo.
 */
package Servicios;

import Entidades.Equipo;
import Entidades.Partido;
import Entidades.Resultado;
import java.util.Scanner;

public class EquipoServicios {
    
    private Scanner sc = new Scanner(System.in);
    
    public Equipo crearEquipo(){
        String equipo= sc.next();
        return new Equipo(equipo);
    }
    
//    public void actualizarPuntaje(Equipo equipo, Resultado resultado, Partido partido){
//        for (int i = 0; i < 26; i++) {
//            for (int j = 0; j < 27; j++) {
//                
//                
//            }
//            
//        }
//        while()
//        if(equipo.equals(partido.getLocal())){
//            if(resultado.resultado[][]>resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+3);
//            }else if(resultado.getGolesLocal()<resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+0);
//            }else if(resultado.getGolesLocal()==resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+1);
//        }
//    }else if(equipo.equals(partido.getVisitante())){
//        if(resultado.getGolesLocal()>resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+0);
//            }else if(resultado.getGolesLocal()<resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+3);
//            }else if(resultado.getGolesLocal()==resultado.getGolesVisitante()){
//                equipo.setPuntajeGeneral(+1);
//        }
//    }
    
    // Método para actualizar puntaje. Recibe resultado y 
    // coteja si equipo es local o visitante y le asigna 3 ptos si ganó, 1 por empate y los goles
    
    // Si equipo es igual a local
}


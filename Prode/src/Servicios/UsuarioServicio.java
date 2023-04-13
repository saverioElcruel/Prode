/*
a)  Un método que crea un usuario
b)  Un método que inicializa el pronóstico en 9 (u otra suma de goles irrisoria).
c)  Un método que consulta la clase partido para saber la fecha en juego, 
    muestra local y visitante, fecha y orden del partido y 
    actualiza el pronóstico del usuario.
d)  Un método que actualiza el puntaje del usuario.

 */
package Servicios;

import Entidades.Partido;
import Entidades.Resultado;
import Entidades.Usuario;
import java.util.Scanner;

public class UsuarioServicio {

    private Scanner sc = new Scanner(System.in);
    
    public Usuario crearUsuario(){
        Usuario jugador = new Usuario();
        return jugador;
    }
    
    public void inicializarPronostico(Usuario jugador){
        int vaticinio[][] = new int[26][27];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 27; j++) {
                vaticinio[i][j] = 9;
                jugador.setPronostico(vaticinio);
            }  
        }
    }
    
    public void pedirPronostico(Partido doparti, Usuario jugador){
        
        System.out.println("Se juega la fecha "+doparti.getFecha()+". Partido N° "+doparti.getOrden());
        
        System.out.println(doparti.getLocal() + " Vs. " + doparti.getVisitante());
        
        System.out.println("¿Cómo sale el partido?");
        
        System.out.println("Goles local:");
        int golesLocal = sc.nextInt();
       
        System.out.println("Goles visitante:");
        int golesVisitante = sc.nextInt();
        
        int pronostico[][] = new int[26][27];
        
    }

    public void actualizarPuntaje(Usuario usuario,Resultado resultado){
                
            //  Matriz de comprobación. Solo cargada para la fecha 11
        for (int i = 0; i < usuario.getPronostico().length; i++) {
            for (int j = 0; j < usuario.getPronostico()[0].length; j++) {
                if(resultado.getResultado()==usuario.getPronostico()){
                    usuario.setPuntaje(+3);
                }else{
                    
                }
            }
        }
    }
    }
//        for (int i = 0; i < 26; i++) {
//            for (int j = 0; j < 27; j++) {
//                Object object = arr[j];  
//            }
//        }
//        if(usuario.pronostico[][]==resultado.resultado)
//    }



/*

 */
package Servicios;

import Entidades.Partido;
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
    
    public void crearPronostico(Partido doparti, Usuario jugador){
        System.out.println("Se juega la fecha "+doparti.getFecha()+ ". Partido N° "+doparti.getOrden());
        System.out.println(doparti.getLocal() + " Vs. " + doparti.getVisitante());
        System.out.println("¿Cómo sale el partido?");
        
        
        System.out.println("Goles local:");
        int golesLocal = sc.nextInt();
       
       
        System.out.println("Goles visitante:");
        int golesVisitante = sc.nextInt();
        
        int pronostico[][] = new int[26][27];
        
        
        //Matriz de comprobación. Solo cargada para la fecha 11
        
        for (int i = 0; i < pronostico.length; i++) {
            for (int j = 0; j < pronostico[0].length; j++) {
                if(doparti.getFecha()==10 && doparti.getOrden()==0){
                    pronostico[i][j]=golesLocal;
                }else if(doparti.getFecha()==10 && doparti.getOrden()==1){
                    pronostico[i][j]=golesVisitante;
                }
                
            }
            
        }
        
    }
    
//    public void actualizarPuntaje(Usuario usuario,Resultado resultado,Partido partido){
//        
//        for (int i = 0; i < 26; i++) {
//            for (int j = 0; j < 27; j++) {
//                Object object = arr[j];
//                
//            }
//            
//        }
//        
//        if(usuario.pronostico[][]==resultado.resultado)
//    }

    
}

/*
Ejecución principal.
Esta clase sería el punto de entrada del programa y se encargaría 
de inicializar las demás clases y de coordinar el flujo de información 
entre ellas.
 */
package prode;

import Entidades.Partido;
import Entidades.Usuario;
import Servicios.PartidoServicio;
import Servicios.ResultadoServicio;
import Servicios.UsuarioServicio;

public class prode {

    public static void main(String[] args) {
        PartidoServicio periodista = new PartidoServicio();
        
        periodista.crearFixture();
        
        UsuarioServicio hincha = new UsuarioServicio();
        
        Usuario j1 = hincha.crearUsuario();
        
        hincha.inicializarPronostico(j1);
        
        
        Partido elPrimeroDeLaFecha = periodista.crearPartido();
        
        hincha.crearPronostico(elPrimeroDeLaFecha, j1);
        
        ResultadoServicio grondona = new ResultadoServicio();
        
        grondona.crearResultado();
        
        
        
        
        System.out.println(" ronda en juego");
        System.out.println("----------------------");
        
    }
    
}

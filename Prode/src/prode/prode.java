/*
Ejecución principal.
Esta clase sería el punto de entrada del programa y se encargaría 
de inicializar las demás clases y de coordinar el flujo de información 
entre ellas.

Debe llevar un menú que dé las opciones: 1-CargarUsuario 2-Vaticinar 
3-ConsultarTabladePosicionesProde 4-ConsultarTablaDePosicionesTorneo
5- Simular resultado de la fecha

CargarUsuario debe llamar a un método de UsuarioServicio que cree el usuario
e inicialice la matriz pronostico con un valor irrisorio.

Vaticinar debe preguntar la fecha y con ese dato ingresado por teclado
mostrar local visitante y orden del partido. 

Debe preguntar el pronóstico y actualizar la matriz pronostico del Usuario.



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
        
//        periodista.crearFixture();
        
        UsuarioServicio hincha = new UsuarioServicio();
        
        Usuario j1 = hincha.crearUsuario();
        
        hincha.inicializarPronostico(j1);
        
        
//        Partido elPrimeroDeLaFecha = periodista.crearPartido();
//        
//        hincha.crearPronostico(elPrimeroDeLaFecha, j1);
        
        ResultadoServicio grondona = new ResultadoServicio();
        
        grondona.crearResultado();
        
        
        
        
        System.out.println(" ronda en juego");
        System.out.println("----------------------");
        
    }
    
}

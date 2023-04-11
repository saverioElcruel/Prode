/*

 */
package Entidades;

public class Resultado {
    
    private int resultado[][];

    public Resultado() {
    }

    public Resultado(int[][] resultado) {
        this.resultado = resultado;
    }

    public int[][] getResultado() {
        return resultado;
    }

    public void setResultado(int[][] resultado) {
        this.resultado = resultado;
    }
}


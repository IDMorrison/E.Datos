import java.util.*;
public class ej27 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    int[][] matriz = new int[3][3];
    
    matriz = Funciones1.llenarMatrizRandom(matriz,5);
    
    Funciones1.imprimirMatriz(matriz);
    
    int acum = Funciones1.sumarDiagonalPrincipal(matriz);
    
    System.out.println(acum);
  }
}
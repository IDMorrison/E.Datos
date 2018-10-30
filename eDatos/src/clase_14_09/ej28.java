package clase_14_09;

import java.util.*;
public class ej28 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    int[][] matriz = new int[3][3];
    
    matriz = Funciones1.llenarMatrizRandom(matriz,1);

//    TEST
//    matriz[0][0]=1;
//    matriz[1][1]=1;
//    matriz[1][2]=1;
    
    Funciones1.imprimirMatriz(matriz);
    
    boolean acum = Funciones1.esMatrizDiagonal(matriz);
    System.out.println(acum);
  }
}
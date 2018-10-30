package clase_14_09;

import java.util.*;
public class ej26 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    float[][] matrizFloat = new float[3][3];
    
    matrizFloat = Funciones1.llenarMatrizRandomFloat(matrizFloat,5);
    
    Funciones1.imprimirMatrizFloat(matrizFloat);
    
    float acum = Funciones1.sumarSuperior(matrizFloat);
    System.out.println(acum);
    System.out.println("2da matriz");
    float acum1 = Funciones1.sumarInferiorConDiagonalS(matrizFloat);
    System.out.println(acum1);
    
  }
}
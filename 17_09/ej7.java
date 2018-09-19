import java.util.*;

public class ej7 {
  public static void main (String[] args){
    int[][] matriz0 = new int[3][3];
    int[][] matriz1 = new int[3][3];
    
    matriz0 = cargarMatriz(matriz0);
    matriz1 = cargarMatriz(matriz1);
    sumarMatrices(matriz0,matriz1);
  }
  
  public static int[][] cargarMatriz(int matriz0[][]){
    Random ran = new Random();
    for (int i=0;i<matriz0.length;i++){
      for (int j=0;j<matriz0.length;j++){
        matriz0[i][j]=ran.nextInt(30);
      }
    }
    return matriz0;
  }
  
  public static void sumarMatrices(int matriz0[][],int matriz1[][]){
    int acum=0;
    
    for (int i=0;i<matriz0.length;i++){
      for (int j=0;j<matriz1.length;j++){
        acum= acum + matriz0[i][j]+matriz1[i][j];
      }
    }
    System.out.println(acum);
  }
}
package clase17_09;

public class ej6 {
  public static void main (String[] args){
    int[][] matriz = new int[5][5];
    llenarMatriz(matriz);
    
  }
  
  public static void llenarMatriz (int matriz[][]){
    for (int i=0;i<5;i++){
      for (int j=0;j<5;j++){
        matriz[i][j]=i+j;
      }
    }
    imprimir(matriz);
  }
  
  public static void imprimir (int matriz[][]){
    for (int i=0;i<matriz.length;i++){
      for (int j=0;j<matriz.length;j++){
        System.out.println(matriz[i][j]+"  posicion: ["+i+"]["+j+"]");
      }
    }
  }
}
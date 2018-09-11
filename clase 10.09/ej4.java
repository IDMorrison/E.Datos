public class ej4 {
  public static void main (String[] args){
    int[] vect = {1,2,2};
    int i=0;
    
    int salida = multiVector(vect,i);
    System.out.println(salida);
    
  }
  
  public static int multiVector (int vector[], int i){
    if (i<vector.length) { return vector[i] * multiVector(vector,i+1); }
    else return 1;
  }
}

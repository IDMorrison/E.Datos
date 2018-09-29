public class ej4 {
  public static void main (String[] args){
    
    int i=0;
    Fecha date = new Fecha();
    int[] vect = {1,2,2,date};
    int salida = multiVector(vect,i,date);
    System.out.println(salida);
    
  }
  
  public static int multiVector (int vector[], int i, Fecha date){
    if (i<vector.length) { return vector[i] * multiVector(vector,i+1,date); }
    else return 1;
  }
}

public class ej3{
  public static void main (String[] args){
    
    int i = 0;
    int[] vector1 = {2,3,2,3};
    
    int salida= sumarVector(vector1,i);
    
    System.out.println(salida);
  }
  
  public static int sumarVector (int vector[], int i){
    if (i<vector.length) { return vector[i] + sumarVector(vector,i+1); }
    else return 0;
  }
  
  
//  return vector[0]==2 + vector[1]==3 + vector[2]==2 + vector[3]==3 + 0 
}
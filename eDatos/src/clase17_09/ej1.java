package clase17_09;

import java.util.*;

public class ej1 {
  public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    int[] array1 = {1,2,3,4,5};   // para declarar array y llenarla, si no usar // int[] array1 = new int[100];
  
    for (int i = array1.length-1; i >-1;i--){
     // System.out.println(array1[i]);
    }
    
    System.out.println("");
    
    for ( int array : array1 ){   // ambos for tendran el mismo resultado // defino una variable, para usar en el print como referencia de la posicion.
     // System.out.println(array);
    }
    
    int[] num = new int[5];
    
    for ( int i = 0; i<num.length; i++){
      System.out.println("Ingrese un num para la posicion: "+ (i+1));
      num[i]=teclado.nextInt();
    } 
    
    for ( int i = 0; i<num.length; i++){
      System.out.print("Posicion "+(i+1)+": "+num[i]+". ");
    }
      
    
  }
}
package clase17_09;

import java.util.*;

public class ej5 {
  
  public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    
    int[] vector = new int[7];
    int j=0;
    int i=vector.length-1;
    int aux=0;
    int aux2=0;
    vector= cargarVector(vector,j,teclado);
    
    vector= bajarPosicion(vector,i,aux);
    imprimirVector(vector,j);
    
  
      
  }
  
  public static int[] cargarVector(int vector[], int i,Scanner teclado){
    if (i<vector.length) { 
      System.out.println("Ingrese un valor");
      vector[i]= teclado.nextInt();
      return cargarVector(vector,i+1, teclado);
    }
    else { return vector; } 
  }
  
  public static int[] bajarPosicion(int vector[], int i, int aux){
    
    if (i==vector.length-1) { 
      aux=vector[vector.length-1];
      return bajarPosicion(vector,i-1,aux);
    }
    
    if (i>=0 && i!= vector.length-1 ) {
      vector[i+1]=vector[i];
      return bajarPosicion(vector,i-1,aux);
    }
    
    else { 
      vector[0]=aux;
      return vector;
    }
  }
  
  public static void imprimirVector(int vector[],int i){
    if (i<vector.length){ 
      System.out.println(vector[i]);
      imprimirVector(vector,i+1);
    }
  }
}
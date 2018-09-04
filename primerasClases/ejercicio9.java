/*ej 9 , escribir un programa que pida por pantalla con cuantos numeros se van a trabajar , luego pida los X numeros por
 * pantalla y luego de introducir los X numeros ,se mostrara un mensaje por pantalla indicando cual es el mayor , cual 
 * es el menor y cual es el promedio.*/ 

import java.util.*;
  
public class ejercicio9{
  public static void main (String[] args) {
    
    Scanner teclado=new Scanner(System.in);
    
    
    int numAIngresar;
    int num;
    int mayor=-999999999;
    int menor=999999999;
    System.out.println("Ingrese la cantidad de numeros a trabajar"); 
    numAIngresar=teclado.nextInt() ;
      
      for (int i=0;i<=numAIngresar-1;i++) {
      System.out.println("Ingrese el numero " + (i+1)) ;
      num=teclado.nextInt();
      
        if (num<menor){
        menor=num;
      }
      if (num>mayor){
        mayor=num;
      }
      }
      System.out.println("El numero mayor es: " + mayor) ;
      System.out.println("El numero menor es: " + menor) ;
      System.out.println("El promedio es: " + (mayor+menor/2));
                         }
}

      
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
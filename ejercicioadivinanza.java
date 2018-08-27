//1- realizar un juego para adivinar un numero para ello pedir un numero n y luego ir pidiendo numeros indicando mayor o menor

import java.util.*;
  
  public class ejercicioadivinanza {
  public static void main (String[] args){
    
    Scanner teclado = new Scanner(System.in) ;
    
    int num = 0 ;
    int num1 = 0 ;
    int contador = 0 ;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    System.out.println("Ahora adivinemos... a continuacion ingrese un numero");
    num1=teclado.nextInt();
    
    while (num1 != num){
      if (num1>num) {
        System.out.println("Intente de nuevo, el numero que ingreso es mayor que el buscado");
        
      }
      else { 
        System.out.println("Intente de nuevo, el numero que ingreso es menor que el buscado");
      }
      num1=teclado.nextInt();
    }
   
    System.out.println("Usted a encontrado el numero buscado!");
  
  
    }
  
  }
  

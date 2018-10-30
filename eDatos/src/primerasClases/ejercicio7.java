/* hacer un programa que ingrese un numero real positivo que represente el radio de un circulo
 * . Hacer un menu de dos opciones que diga "Que desea hacer,calcular su perimetro o area?"
 * , calcular su perimetro y su area , debe tener 
 * definida la constante pi en su programa.
 */

package primerasClases;

import java.util.*;
  
  public class ejercicio7 {
  public static final double PI=3.14159265;
  public static void main (String[]args) {
    
  Scanner teclado= new Scanner(System.in);
  double radio;
  double resultado=0;
  int var=0;
  System.out.println("Ingrese el radio de un circulo") ; 
  radio=teclado.nextFloat() ;
  if (radio<0) 
    System.out.println("Ingrese un numero real positivo"); 
  
  
  System.out.println("1--Calcular el area") ;
  System.out.println("2--Calcular el perimetro") ;
  var=teclado.nextInt();
  
    switch (var) {
    
      case 1: resultado=PI*(radio*radio);
      System.out.println("El resultado es :" + resultado) ;
    break;
    
      case 2: resultado= 2*PI*radio ; 
      System.out.println("El resultado es: " + resultado) ;
    break;
  
    
      default: System.out.println("Ingrese una opcion correcta") ;
      break;
    }
  }
 }
  
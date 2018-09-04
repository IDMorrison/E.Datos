/* diseñar un algoritmo que permita ingresar N empleados de una fabrica y su peso, primero debe permitir 
 * luego mostrar por pantalla cuantos pesan mas que 80 y cuantos menos de 80
 */

import java.util.*;

public class ejercicio8{
  public static void main (String[]args) {
    
   Scanner teclado= new Scanner(System.in) ;
   
   int numEmpleados=0;
   float peso;
   int empleadosPesoMayor=0;
   int empleadosPesoMenor=0;
   
   System.out.println("Cantidad de empleados a ingresar");
   numEmpleados=teclado.nextInt();
   
   for (int i=1; i <= numEmpleados;i++){ 
     System.out.println("Ingrese el peso del empleado" + i) ;
     peso=teclado.nextFloat();
    if (peso<80) 
      empleadosPesoMenor=empleadosPesoMenor+1 ;
     
     if (peso>80)
      empleadosPesoMayor=empleadosPesoMayor+1 ;
   }
  System.out.println("La cantidad de empleados con peso mayor a 80 es : " + empleadosPesoMayor);
  System.out.println("La cantidad de empleados con peso menor a 80 es: " + empleadosPesoMenor);
  }
}
    
      
    
     
     
   
   
   
    
    
    
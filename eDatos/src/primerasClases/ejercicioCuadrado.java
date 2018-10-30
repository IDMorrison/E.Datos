package primerasClases;

import java.util.*;

public class ejercicioCuadrado {
public static void main (String[] args){ 
  Scanner teclado = new Scanner(System.in);  
  
  int i=0;
  int j=0;
  int n=0;
  System.out.println("Ingrese un numero");
  n=teclado.nextInt();
  for (i=0; i<n; i++) {
    System.out.println("*");
    for (j=0; j<n; j++) {
      System.out.println("*");
    }
  }
}
}
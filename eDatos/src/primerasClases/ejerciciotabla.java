package primerasClases;

import java.util.*;
  
  public class ejerciciotabla {
  public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    int num=0;
    int i=0;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    for (i=0; i<=10; i++) {
      System.out.println(num+" x "+i+" = "+(num*i));
    }
  }
  }  
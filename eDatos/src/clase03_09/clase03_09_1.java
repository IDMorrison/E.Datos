//Ejercicios clase 03/09/2018
//1) Crear un programa que ejemplifique el paso de parámetros por valor y por referencia, para lo cual:
//a. Crear un tipo de Datos Nombre
//b. En la parte principal del programa llamar a una función pasándole una variable nombre y un Tipo de Dato Nombre.
//c. Crear la función que tome por parámetros una variable y un objeto del tipo creado en el punto a). Permitir que se ingrese el nombre por teclado y modificar ambos parámetros.
//d. En el programa principal imprimir la variable nombre y el tipo de Datos Nombre.
//e. Que observa? A que se debe? Utilizar el debbug y puntualizar en que línea se produce el cambio.
package clase03_09;

import java.util.* ;
public class clase03_09_1 {
    
  public static void main(String []args){
    
    Nombre var1 = new Nombre();
    
    String var2="";
   
    imprimir(var1, var2);
    
    System.out.println("Referencial:"+var1.nombre); 
    System.out.println("Valor:"+var2); 
   
  }
  
  public static void imprimir(Nombre par1,String par2) {
    
    Scanner teclado=new Scanner (System.in);
    
    par1.nombre=teclado.nextLine();
    par2=par1.nombre;
   
  }
}
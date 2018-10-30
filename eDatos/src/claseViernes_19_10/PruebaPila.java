package claseViernes_19_10;

import java.util.*;

public class PruebaPila {

 public static void main(String[] args) {
   Scanner tecl = new Scanner(System.in);
   int i = 0, valor = 0; 
   int suma = 0, acarreo = 0, valor1 = 0, valor2 = 0;
   
   
   Pila pila1 = new Pila();
   Pila pila2 = new Pila();
   Pila pila3 = new Pila();
   
   
   while (valor>-1){
     System.out.println("Ingrese el valor"+" "+(i+1));
     i++;
     valor = tecl.nextInt();
     while (valor>9) {
       System.out.println("Ingrese un solo digito");
       valor = tecl.nextInt();
     }
     if(valor>-1)
     pila1.apilar(valor);
   }
   valor=0; i=0;
   System.out.println("Pila 2");
   
     while (valor>-1){
     System.out.println("Ingrese el valor"+" "+(i+1));
     i++;
     valor = tecl.nextInt();
     while (valor>9) {
       System.out.println("Ingrese un solo digito");
       valor = tecl.nextInt();
     }
     if(valor>-1)
     pila2.apilar(valor);
   }
   
   while (!(pila1.estaVacia() && pila2.estaVacia())){
     if (pila1.estaVacia()){
       valor1=0;
     }else {
         valor1=pila1.desApilar();
     }
     if (pila2.estaVacia()){
       valor2=0;
     }else {
         valor2=pila2.desApilar();
     }
     
     suma=valor1+valor2+acarreo;
     if (valor1+valor2>9){
       suma-=10;
       acarreo=1;
     } else acarreo=0;
     pila3.apilar(suma);
   }
   if (suma>0) 
     pila3.apilar(acarreo);
   
   while(!pila3.estaVacia()){
     System.out.print(""+pila3.desApilar());
   }
   



//   for(int i=1; i<11; i++)
//     pila.apilar(i);
//  
//  
//   while(!pila.estaVacia())
//     System.out.println("Elementos>"+pila.tamanio()+" Valor: "+pila.desApilar());
  
 }

}

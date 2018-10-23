import java.util.*;

public class ejCantElementos{
  public static void main (String[] args){
    Scanner tecl = new Scanner(System.in); 
    int valor = 0, i=0;
    Pila pila1 = new Pila();
    
    System.out.println("Ingrese un elemento");
    valor = tecl.nextInt();
    while(valor!=0){
      pila1.apilar(valor);
      System.out.println("Ingrese un elemento");
      valor = tecl.nextInt();
    }
    
    System.out.println("Cantidad de elementos: "+pila1.tamanio());
    System.out.println(pila1.desApilar());
    System.out.println(pila1.desApilar());
    System.out.println("Cantidad de elementos: "+pila1.tamanio());
    
  }
  
}

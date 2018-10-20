import java.util.*;

public class ejPilaEstatica{
  public static void main (String[] args){
    Scanner tecl = new Scanner(System.in); 
    int valor = 0, i=0;
    
    PilaEstatica pilaE1 = new PilaEstatica(3);
    
    while (valor>-1 && !pilaE1.estaLlena()){
     System.out.println("Ingrese el valor"+" "+(i+1));
     i++;
     valor = tecl.nextInt();
     while (valor>9) {
       System.out.println("Ingrese un solo digito");
       valor = tecl.nextInt();
     }
     if(valor>-1)
     pilaE1.apilar(valor);
   }
   while(!pilaE1.estaVacia()){
     System.out.println(pilaE1.desApilar());
   }
  }
  
}

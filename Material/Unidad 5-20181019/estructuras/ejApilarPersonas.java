import java.util.*;

public class ejApilarPersonas{
  public static void main (String[] args){
    Scanner tecl = new Scanner(System.in); 
    Persona valor = new Persona();
    PilaPersona pila1 = new PilaPersona();
    int j = 0,  i=0;
    
    System.out.println("Persona n° "+i+1);
    for (i=0; i<11; i++){
      System.out.println("Ingrese el nombre");
      valor.nombre() = tecl.nextLine();
      System.out.println("Ingrese el apellido");
      valor.apellido() = tecl.nextLine();
      System.out.println("Ingrese la edad");
      valor.edad() = tecl.nextInt();
      pila1.apilar(valor);
    }
    
    System.out.print("Ingrese la cantidad de elementos a desapilar: ");
    j = tecl.nextInt();
    
    for (j=0; j<j+1; j++){
      valor = pila1.desApilar();
      
      System.out.println(valor.nombre);
      System.out.println(valor.apellido);
      System.out.println(valor.edad);
    }
  }
  
}

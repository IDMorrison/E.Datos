import java.util.*;

public class ejApilarPersonas{
  public static void main (String[] args){
    Scanner tecl = new Scanner(System.in); 

    PilaPersona pila1 = new PilaPersona();
    int j = 0,  i=0;
    
    
    for (i=0; i<4; i++){
      Persona valor = new Persona();
      System.out.println("Persona n° "+(i+1));
      System.out.println("Ingrese el nombre");
      if (i>0){
        valor.nombre = tecl.nextLine();
      }
      valor.nombre = tecl.nextLine();
      System.out.println("Ingrese el apellido");
      valor.apellido = tecl.nextLine();
      System.out.println("Ingrese la edad");
      valor.edad = tecl.nextInt();
      
      pila1.apilar(valor);
    }
    
    System.out.print("Ingrese la cantidad de elementos a desapilar: ");
    int cuantos = tecl.nextInt();
    
    for (j=0; j<cuantos; j++){
      Persona vPersona = pila1.desApilar();
      
      System.out.println(vPersona.nombre);
      System.out.println(vPersona.apellido);
      System.out.println(vPersona.edad);
    }
  }
  
}

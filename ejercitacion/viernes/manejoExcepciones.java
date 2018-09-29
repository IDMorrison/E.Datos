import java.util.*;
public class manejoExcepciones {
  public static void main (String[] args){
    
    try {
      Scanner teclado = new Scanner(System.in);
      int entero = teclado.nextInt();  
          
    }catch (InputMismatchException e){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Debe ser un entero");
      int entero = teclado.nextInt();
    }
    finally {
      System.out.println("Gracias");
    }
  }
}
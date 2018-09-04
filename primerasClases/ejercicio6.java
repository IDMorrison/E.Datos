import java.util.*;
public class ejercicio6
{
  public static void main (String[]args)
  {
    Scanner teclado=new Scanner (System.in); // la inicializo una sola vez
    float sumador=0;
    float valor=1; // debe ser distinto de cero
   
    System.out.println("ingrese valores reales distintos de 0");
   
    for (   ;valor!=0;   ){ // esta variable funciona como un mientras y los demas quedan vacios
      valor=teclado.nextFloat();
      sumador=sumador+valor;
    }
    System.out.println("la suma total es " + sumador);
  }
}
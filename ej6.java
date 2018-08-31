import java.util.*;

public class ej6 {
  public static void main (String[]args) 
  {
  Scanner tec=new Scanner (System.in) ;
  float sumador=0 ;
  float valor=1;
  
    System.out.println("Ingrese valores reales distinto de 0");
    
    for (  ;valor!=0;  ); {
      valor=tec.nextFloat();
      sumador = sumador+valor; 
    }
    
    System.out.println("La suma total es" + sumador) ;
  }
}
    
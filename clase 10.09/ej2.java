import java.util.*;

public class ej2 {
  public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    
    
    Fecha[] fecha1 = new Fecha[5]; 
    
    for (int i = 0; i<fecha1.length;i++){
      fecha1[i]= new Fecha();
      System.out.println("Fecha n°: "+(i+1));
      
      System.out.println("Ingrese el dia");
      fecha1[i].dia= teclado.nextInt();
      
      System.out.println("Ingrese el mes");
      fecha1[i].mes= teclado.nextInt();
      
      System.out.println("Ingrese el anio");
      fecha1[i].anio= teclado.nextInt();
    }
    
     for (int i = 0; i<fecha1.length;i++){
       System.out.println("Fecha n°: "+(i+1));
       System.out.println(fecha1[i].dia);
       System.out.println(fecha1[i].mes);
       System.out.println(fecha1[i].anio);
     }
    
  }
}
import java.util.*;
import java.text.DecimalFormat;
public class ejercicios {
  public static void main (String[] args) {
    
//    int salidaM = Funciones1.multi(2,16); // ejercicio: 8 
//    System.out.println(salidaM);    

//    float contador=0;
//    float salidaDiv = Funciones1.div(9,5,contador); // ejercicio: 9
//    System.out.println(salidaDiv);     

//    int salidaN = Funciones1.sumaN(5);  // ejercicio: 10
//    System.out.println(salidaN);

//    int i=1; int numPares=2;
//    int salida = Funciones1.sumaPares(numPares,i); // ejercicio: 11
//    System.out.println("Resultado suma primeros "+numPares+" numeros pares: "+salida);
    
//    int n= 10;   // ejercicio 12
//    int salida = Funciones1.sumaParesHastaN(n);
//    System.out.println("Suma numeros pares hasta "+n+": "+salida);
 
//    int i = 2; int num = 215;     // ejercicio 13
//    String salida = Funciones1.numPrimo(num,i);
//    System.out.println(salida);

//    Fecha cumple = new Fecha();   // ejercicio14
//    cumple.dia=02;
//    cumple.mes=2;
//    cumple.anio=1995;
//    String validacion = Funciones1.checkFecha(cumple);
//    System.out.println(validacion);
    Fecha cumple = new Fecha();   // ejercicio14
    cumple.dia=5;
    cumple.mes=12;
    cumple.anio=1995;
    System.out.println("Dia: "+cumple.dia+" Mes: "+cumple.mes+" A�o: "+cumple.anio);
    Funciones1.nuevoDia(cumple);
    System.out.println("Dia: "+cumple.dia+" Mes: "+cumple.mes+" A�o: "+cumple.anio);
    
  }




}
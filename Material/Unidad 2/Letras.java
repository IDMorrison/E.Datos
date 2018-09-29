import java.util.Scanner;

public class Letras {
  public static void main(String[] args) {
    int numero;
    
    String mostrar;
// esta versión muesrta 11 como diez y uno.
// es una forma de hacerlo bastante burda.
// se puede poner algunos condicionales para los números especiales: 11,12,...
// y otro condicional para mostrar "y"
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número (0 a 99): ");
    numero=entrada.nextInt();
    mostrar = convLetra(numero);
    System.out.print(mostrar);  
  } 
  
  static String convLetra(int num){
    int unidades, decenas;
    String resultado = ""; 
    unidades = num % 10;
    decenas = num / 10;
    switch(decenas){
      case 0:
        //System.out.print("");
        resultado = resultado + "";
        break;
      case 1:
        //System.out.print("diez");
        if (unidades > 5)
            resultado = resultado + "dieci";
        else
            resultado = resultado + "diez";
        break;
      case 2:
        //System.out.print("veinte");
        if (unidades ==0)
           resultado = resultado + "veinte";
        else
          resultado = resultado + "veinti";
        break;
      case 3:
        //System.out.print("treinta");
        resultado = resultado + "treinta";
        break;
      case 4:
        //System.out.print("cuarenta");
        resultado = resultado + "cuarenta";
        break;
      case 5:
        //System.out.print("cincuenta");
        resultado = resultado + "cincuenta";
        break;
      case 6:
        //System.out.print("sesenta");
        resultado = resultado + "sesenta";
        break;
      case 7:
        //System.out.print("setenta");
        resultado = resultado + "setenta";
        break;
      case 8:
        //System.out.print("ochenta");
        resultado = resultado + "ochenta";
        break;
      case 9:
        //System.out.print("noventa");
        resultado = resultado + "noventa";
        break;
    }
    //System.out.print (" y ");
    if (decenas > 2)
        resultado = resultado + " y ";
    
    switch(unidades){
      case 0:
        //System.out.println("");
        resultado = resultado + "";
        break;
      case 1:
        // System.out.println("uno");
        if (decenas==1)
          resultado = "once";
        else
          resultado = resultado + "uno";
        break;
      case 2:
        // System.out.println("dos");
        if (decenas==1)
          resultado = "doce";
        else
          resultado = resultado + "dos";
        break;
        
      case 3:
        //System.out.println("tres");
        if (decenas==1)
          resultado = "trece";
        else
          resultado = resultado + "tres";
        break;
      case 4:
        //System.out.println("cuatro");
        if (decenas==1)
          resultado = "catorce";
        else
          resultado = resultado + "cuatro";
      case 5:
        //System.out.println("cinco");
        if (decenas==1)
          resultado = "quince";
        else
          resultado = resultado + "cinco";
        break;
      case 6:
        //System.out.println("seis");
        resultado = resultado + "seis";
        break;
      case 7:
        //System.out.println("siete");
        resultado = resultado + "siete";
        break;
      case 8:
        //System.out.println("ocho");
        resultado = resultado + "ocho";
        break;
      case 9:
        //System.out.println("nueva");
        resultado = resultado + "nueve";
        break;
    }
  return resultado;
  }
}

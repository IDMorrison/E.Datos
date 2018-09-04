//1. Crear una clase java llamada funciones, y hacer una funcion para calcular el factorial de un n° entero.
//2. Hacer una funcion para resolver la combinatoria de m elementos agrupados de a n.
      // C(m,n) =      m!
      //            (m-n)!n!

// para llamar a estas funciones dentro de Funciones.java = nombreDeClase.nombreDeFuncion  .

public class Funciones {

  public static long factorial (long entero) {
    long salida = entero;
    long i = 0;
    int factorizado = 0;
    
    if (entero==0) { 
      return 1;
    }
    
    if (entero>0){
      for (i=salida-1; i>0; i--){
        salida=salida*i;
      }
      return salida;
    }
    
    else { 
      return 0; 
    }
  }

}
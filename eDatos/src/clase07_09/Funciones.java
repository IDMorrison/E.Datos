//1. Crear una clase java llamada funciones, y hacer una funcion para calcular el factorial de un n° entero.
//2. Hacer una funcion para resolver la combinatoria de m elementos agrupados de a n.
      // C(m,n) =      m!
      //            (m-n)!n!

// para llamar a estas funciones dentro de Funciones.java = nombreDeClase.nombreDeFuncion  .
package clase07_09;

public class Funciones {
 
    public static long factorial (long fact) {
      if (fact == 0)  return 1;
      return fact*factorial(fact-1);
    }


    public static long combinatoria (long m, long n){
      long _m = factorial(m);
      long _mn = factorial(m-n);
      long _n = factorial(n);
    
      long salida = _m/(_mn*_n);
      return salida;
    }
}

// tp1 -- 2- 3- 4- 6- 8- 13- 15- 16- 18-
// tp2 -- 
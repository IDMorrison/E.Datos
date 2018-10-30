//1. Crear una clase java llamada funciones, y hacer una funcion para calcular el factorial de un n° entero.
//2. Hacer una funcion para resolver la combinatoria de m elementos agrupados de a n.
      // C(m,n) =      m!
      //            (m-n)!n!

// Para llamar a estas funciones fuera de Funciones.java = nombreDeClase.nombreDeFuncion(parametros)  .
// cuando es dentro de la misma class Funciones = nombreDeFuncion(parametros)
package clase31_08;

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
    
    public static int pertenece (int n1){
      if (n1>20)
        return 0;
      return n1+pertenece(n1);
    }
}

// tp1 -- 2- 3- 4- 6- 8- 13- 15- 16- 18-
// tp2 -- 
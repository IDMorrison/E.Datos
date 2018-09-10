//1. Crear una clase java llamada funciones, y hacer una funcion para calcular el factorial de un nÂ° entero.
//2. Hacer una funcion para resolver la combinatoria de m elementos agrupados de a n.
      // C(m,n) =      m!
      //            (m-n)!n!

// Para llamar a estas funciones fuera de Funciones.java = nombreDeClase.nombreDeFuncion(parametros)  .
// cuando es dentro de la misma class Funciones = nombreDeFuncion(parametros)

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
    
    
    
    public static int pertenece2 (int n){
      
      if (n>1){
          return pertenece2(n-1) + pertenece2(n-2);  //función recursiva
      }
      else if (n==1) {  // caso base
        return 1;
      }
      else if (n==0){  // caso base
        return 0;
      }
      else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
      }
    }
}


// tp1 -- 2- 3- 4- 6- 8- 13- 15- 16- 18-
// tp2 -- 
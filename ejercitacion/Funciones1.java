public class Funciones1 {

  public static int sumaN (int n){
    System.out.println(n);
    if (n==0) return 0;
    System.out.println(n);
    return n+(sumaN(n-1));
  }
  public static int multi (int n, int n1){
    if (n1==0) return 0;
    return n+ multi(n,n1-1);
  }
  
  public static float div (float a, float b, float contador){
    // 19-5=14 14-5=9 9-5=4 4-5=-1  else  return 4 como resto
    if (a-b>0){
      
      a=a-b;
      contador++;
      return div(a,b,contador);
    }
    else if (a-b==0) { return contador+1;}
    else if (a-b<0) {
      return contador+(a/10);
    }
    else { return contador; }
    }
  
  public static int sumaPares (int n, int i){
    if (i%2==0 && n>0) { 
      System.out.println(i);
      return i+sumaPares(n-1,i+1);
    }
    else if (n>0) {return sumaPares(n,i+1);}
    else {return 0;}
  
  }

  public static int sumaParesHastaN(int n){
    if (n%2==0 && n>0) {
      return n+sumaParesHastaN(n-1);
    }
    else if (n>0) return sumaParesHastaN(n-1);
    else return 0;
  }
  
  public static int checkFecha (Fecha cumple){
    if (cumple.dia>31 || cumple.mes>12 || cumple.anio>9999) return 0;
    else return 1;
  }
  
  public static String numPrimo (int n, int i){
    if (n%i!=0 && n>i){
      return numPrimo(n,i+1);
    }
    else if (n%1==0 && n>i) return n+" no es un numero Primo";
    else return n+" es un numero primo";
  }
  
  public static void nuevoDia (Fecha cumple){
    cumple.dia+=1;
    if (checkFecha(cumple)==0) {cumple.dia=1; cumple.mes+=1;}
    if (checkFecha(cumple)==0) {cumple.mes=1; cumple.anio+=1;}
  }

}
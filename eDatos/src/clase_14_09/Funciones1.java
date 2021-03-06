package clase_14_09;

import java.util.*;

public class Funciones1 {
  
  public static int[][] crearMatriz( int n) {
  int[][] nuevaMatriz = new int[n][n];
  return nuevaMatriz;
  }
  
  public static int[][] llenarMatrizRandom(int matriz[][], int n){
    Random ran = new Random();
    for (int i=0; i<matriz.length; i++){
      for (int j=0; j<matriz.length; j++){
        matriz[i][j] = ran.nextInt(n);
      }
    }
    return matriz;
  }
  
  public static void imprimirMatriz(int matriz[][]){
  
   for (int i=0; i<matriz.length; i++){
      for (int j=0; j<matriz.length; j++){
        System.out.println("Pos "+i+","+j+" : "+matriz[i][j]);
      }
    }
  }
  
  public static float[][] llenarMatrizRandomFloat(float matriz[][], int n){
    Random ran = new Random();
    for (int i=0; i<matriz.length; i++){
      for (int j=0; j<matriz.length; j++){
        matriz[i][j] = ran.nextInt(n)+ran.nextFloat();
      }
    }
    return matriz;
  }
  
  public static void imprimirMatrizFloat(float matriz[][]){
  
   for (int i=0; i<matriz.length; i++){
      for (int j=0; j<matriz.length; j++){
        System.out.println("Pos "+i+","+j+" : "+matriz[i][j]);
      }
    }
  }
  
  public static float sumarSuperior (float matriz[][]){
    float acum = 0;
    int j1=1;
    
    for (int i=0; i<matriz.length-1; i++){
      for (int j=j1; j<matriz.length; j++){
        acum = acum + matriz[i][j];
      }
      j1++;
    }
    return acum;
  }
  
  public static float sumarInferiorConDiagonalS (float matriz[][]){
    float acum = 0;
    int j1=0;
    
    
    
    for (int i=matriz.length-1; i>-1; i--){
      for (int j=j1; j<matriz.length; j++){
        acum = acum + matriz[i][j];
        System.out.println("*");
      }
      j1++;
    }
    return acum;
  }
    
  public static int sumarDiagonalPrincipal (int matriz[][]){
    int acum=0;
    for (int i=0; i<matriz.length; i++){
      acum = acum + matriz[i][i];
    }
    return acum;
  }
  
  public static boolean esMatrizDiagonal(int matriz[][]){
    int acum=0;
    int acum1=0;
    
    for (int i=0; i<matriz.length; i++){
      for (int j=0; j<matriz.length; j++){
        acum = acum + matriz[i][j];
      }
    }
    
    acum1 = sumarDiagonalPrincipal(matriz);
    if (acum-acum1==0) { return true; }
    else { return false;}
  }
    
  
  
  
  
  
    
//  public static int sumaN (int n){
//    System.out.println(n);
//    if (n==1) return 1;
//    System.out.println(n);
//    return n+(sumaN(n-1));
//  }
//  public static int multi (int n, int n1){
//    if (n1==0) return 0;
//    return n+ multi(n,n1-1);
//  }
//  
//  public static float div (float a, float b, float contador){
//    // 19-5=14 14-5=9 9-5=4 4-5=-1  else  return 4 como resto
//    if (a-b>0){
//      
//      a=a-b;
//      contador++;
//      return div(a,b,contador);
//    }
//    else if (a-b==0) { return contador+1;}
//    else if (a-b<0) {
//      return contador+(a/10);
//    }
//    else { return contador; }
//    }
//  
//  public static int sumaPares (int n, int i){
//    if (i%2==0 && n>0) { 
//      System.out.println(i);
//      return i+sumaPares(n-1,i+1);
//    }
//    else if (n>0) {return sumaPares(n,i+1);}
//    else {return 0;}
//  
//  }
//
//  public static int sumaParesHastaN(int n){
//    if (n%2==0 && n>0) {
//      return n+sumaParesHastaN(n-1);
//    }
//    else if (n>0) return sumaParesHastaN(n-1);
//    else return 0;
//  }
//  
//  public static int checkFecha (Fecha cumple){
//    if (cumple.dia>31 || cumple.mes>12 || cumple.anio>9999) return 0;
//    if (cumple.dia<1 || cumple.mes<1 || cumple.anio>9999) return 0;
//    else return 1;
//  }
//  
//  public static String numPrimo (int n, int i){
//    if (n%i!=0 && n>i){
//      return numPrimo(n,i+1);
//    }
//    else if (n%1==0 && n>i) return n+" no es un numero Primo";
//    else return n+" es un numero primo";
//  }
//  
//  public static void nuevoDia (Fecha cumple){
//    cumple.dia+=1;
//    if (checkFecha(cumple)==0) {cumple.dia=1; cumple.mes+=1;}
//    if (checkFecha(cumple)==0) {cumple.mes=1; cumple.anio+=1;}
//  }
//  
//  public static void nuevosNDias (Fecha cumple, int cantDias){
//    if (cantDias>0) {nuevoDia(cumple); nuevosNDias(cumple,cantDias-1);}
//  }
//  
//  
//  public static void cambiaDia (Fecha cumple, int direccion){
//    cumple.dia+=direccion;
//    int direccionDia; int direccionMes;
//    if (direccion>0) { direccionDia = 1; direccionMes = 1; }
//    else { direccionDia = 31; direccionMes=12; }
//    if (checkFecha(cumple)==0) {cumple.dia=direccionDia; cumple.mes+=direccion;}
//    if (checkFecha(cumple)==0) {cumple.mes=direccionMes; cumple.anio+=direccion;}
//  }
//  
//  public static void nuevosNDiasPolivalente (Fecha cumple, int direccion, int cantDias){
//    if (cantDias>0) { cambiaDia(cumple,direccion); nuevosNDiasPolivalente(cumple,direccion,cantDias-1) ;}
//  }
//
}
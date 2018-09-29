import java.util.*;
import java.io.*;

public class encontrarPalabra {
  public static void main (String[] args) throws Exception{
//    File f = new File(".");
//    
//    System.out.println("Puede leerse? "+f.canRead());
//    System.out.println("Puede escribirse? "+f.canWrite());
//    System.out.println("Puede escribirse? "+f.getName());
//    
//     ejercicio 2
//    String[] array = f.list();
//    for (int i=0; i<array.length; i++){
//      System.out.println(array[i]);
//      
//      File archivo = new File(array[i]);
//      System.out.println(archivo.length());
//    }
//    
//     ejercicio 3
//    
  

  // escritura
    String arch = "archivo.txt";    
  FileWriter fw = new FileWriter(arch,true);
  PrintWriter prin = new PrintWriter(fw);
  for (int i=0; i<5; i++){
    prin.println("Hola mundo");
    if (i==3) { prin.print("pepe"); }
  }
  
  prin.flush();
  prin.close();
  
  // lectura
  FileReader f = new FileReader(arch); 
   
  BufferedReader bufer = new BufferedReader(f); 
   
  String linea=bufer.readLine(); 
  char[] arrayDeChar; 
   
  while(linea!=null) { 
    
   arrayDeChar = linea.toCharArray(); 
   int salida = encontrarPepe(arrayDeChar);
   if (salida!=-1) { 
     System.out.println(linea); 
     System.out.println("Columna: "+salida);
     break;
   }
   System.out.println(linea); 
    
   linea=bufer.readLine();    
  } 
   
  bufer.close(); 
  
  
  
  
   
  } 
  
    
  public static int encontrarPepe (char[] a){
      for (int i=0; i<a.length; i++){
        if (a[i]=='p' && a[i+1]=='e' && a[i+2]=='p' && a[i+3]=='e'){
          return i;
        }
      }
      return -1;
  }
    
      
    
    
}
  

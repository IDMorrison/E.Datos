import java.util.*;
import java.io.*;

public class ejercicio1 {
  public static void main (String[] args) throws Exception{
    File f = new File(".");
    
    System.out.println("Puede leerse? "+f.canRead());
    System.out.println("Puede escribirse? "+f.canWrite());
    System.out.println("Puede escribirse? "+f.getName());
    
    // ejercicio 2
    String[] array = f.list();
    for (int i=0; i<array.length; i++){
      System.out.println(array[i]);
      
      File archivo = new File(array[i]);
      System.out.println(archivo.length());
    }
    
    // ejercicio 3
    
// String arch = "archivo.txt";    
// FileWriter fw = new FileWrite(arch,true);
// PrintWriter prin = new PrintWriter(fw);
// prin.print("Hola mundo");
//
// prin.flush();
// prin.close();
    
    // para leer
    FileReader

    
  }
}
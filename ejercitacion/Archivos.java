import java.io.*; 
import java.util.*; 
 
public class Archivos { 
  
 public static void main (String[] pepe) throws Exception { 
   
  String arch="archivo.txt"; 
   
  FileWriter fw = new FileWriter(arch, true); 
  //Hace append 
  PrintWriter prin = new PrintWriter(fw); 
   
   
  //PrintWriter prin = new PrintWriter(arch); 
  //No hace auto flush y no hace append. 
   
  for(int i=0; i<10; i++) 
  prin.print("Hola Mundo "+i); 
   
     
  prin.flush(); 
   
  prin.close(); 
   
  System.out.println("========FIN=========="); 
   
   
  FileReader f = new FileReader(arch); 
   
  BufferedReader bufer = new BufferedReader(f); 
   
  String linea=bufer.readLine(); 
  char[] arrayDeChar; 
   
  while(linea!=null) { 
    
   arrayDeChar = linea.toCharArray(); 
    
   System.out.println(linea); 
    
   linea=bufer.readLine();    
    
    
  } 
   
  bufer.close(); 
   
 } 
 
  
 /* 
 public static void main (String[] pepe) throws Exception { 
   
  File file = new File("."); 
   
  System.out.println("file.getAbsolutePath(): "+file.getAbsolutePath()); 
   
  System.out.println("file.getPath(): "+file.getPath()); 
   
  System.out.println("file.list(): "+file.list()); 
   
   
  String[] vect = file.list(); 
   
  File f; 
  for(int i=0; i<vect.length; i++) { 
   f = new File(vect[i]); 
   System.out.println(f.length()); 
  } 
   
  System.out.println("file.Fecha: "+new Date(file.lastModified())); 
   
  System.out.println(file.canRead()); 
  System.out.println(file.canWrite()); 
   
  System.out.println(file.getName()); 
  //System.out.println(file.getParentFile().getAbsolutePath()); 
  System.out.println(file.length()); 
   
 } 
 
 */ 
}
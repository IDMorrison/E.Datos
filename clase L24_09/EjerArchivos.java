import java.util.*;
import java.io.*;

public class EjerArchivos {
  public static void main (String[] args) {
    // instanciamos File
    File paper = new File ("prueba.txt");
    File paper2 = new File (".");
    boolean leer; 
    String path;
    String nombre;
    String pathPadre;
    boolean fichero;
    String ficheros[];
    
    leer = paper.canRead();
    System.out.println(leer);
    
    path = paper.getAbsolutePath();
    System.out.println(path);
    
    nombre = paper.getName();
    System.out.println(nombre);
    
    pathPadre=paper.getParent();
    System.out.println(pathPadre);
    
    fichero = paper.isFile();
    System.out.println("Es fichero?: "+fichero);
    
    ficheros=paper2.list();
    
    
    for (int i = 0 ; i < ficheros.length ; i++){
      System.out.println(ficheros[i]);
    }
    
    
  }
}
package mover;

import java.io.*;

public class ejercicio {
  public static void main (String[] args) throws Exception{
    
    FileOutputStream fos = new FileOutputStream("archivo.bin");
    ObjectOutputStream file = new ObjectOutputStream(fos);
    
    Alumno a1 = new Alumno();
    Alumno a2 = new Alumno();
    Alumno a3 = new Alumno();
    
    a1.nombre="Juan";
    a1.legajo=1;
    a1.fecha.dia=11;
    a1.fecha.mes=8;
    a1.fecha.anio=1995;
    
    a2.nombre="Mateo";
    a2.legajo=2;
    a2.fecha.dia=16;
    a2.fecha.mes=6;
    a2.fecha.anio=1998;
    
    a3.nombre="Pedro";
    a3.legajo=3;
    a3.fecha.dia=1;
    a3.fecha.mes=4;
    a3.fecha.anio=1994;
    
    file.writeObject(a1);
    file.writeObject(a2);
    file.writeObject(a3);
    
    file.flush();
    file.close();
    
    main2(null);
    
  }
  public static void main2 (String[] args) throws Exception{
    
    FileInputStream fis = new FileInputStream("archivo.bin");
    ObjectInputStream file = new ObjectInputStream(fis);
    
    Object objeto = null;
    objeto = file.readObject();
    
    System.out.println(((Alumno)objeto).legajo);
    
    file.close();
  }
}
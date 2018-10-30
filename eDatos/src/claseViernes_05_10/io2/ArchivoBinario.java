package claseViernes_05_10.io2;

import java.io.*;

public class ArchivoBinario {
	
	public static void main2(String[] pepe) throws Exception {
		
		/*Para escribir en archivos Binarios, tipos de datos primitivos
		y tipos de datos definidos por el usuario.
		*/
		
		FileOutputStream fos = new FileOutputStream("Archivo2.bin");
		ObjectOutputStream file = new ObjectOutputStream(fos);
		
		Persona p1  = new Persona();
		Persona p2  = new Persona();
		Fecha fecha = new Fecha();
		
		p1.edad=10;
		p1.nombre="Pepe";
		p2.edad=20;
		p2.nombre="Juan";
		
		
		fecha.anio=2018;
		fecha.mes=9;
		fecha.dia=20;
		
		file.writeObject("Objeto tipo Texto");
		
		file.writeObject(p1);
		file.writeObject(fecha);//Escribe cualquier Object
		file.writeObject(p2);
		
		file.writeLong(2000);//Por cada tipo primitivo, hay un write
		
		file.flush();
		
		file.close();
	
	}
	
	public static void main(String[] pepe) throws Exception {
		
		FileInputStream fis = new FileInputStream("Archivo.bin");
		
		ObjectInputStream file = new ObjectInputStream(fis);
		
		Object objeto=null;
		
		objeto = file.readObject();
		
		String texto = (String)objeto;
		
		System.out.println(texto);//El primero es un String
			
			objeto = file.readObject();
			Persona p = (Persona)objeto;
			
			System.out.println("Nombre de la persona: "+ p.nombre );//El segundo es una Persona
			

			objeto = file.readObject();
			System.out.println("Anio de la fecha: "+ ((Fecha)objeto).anio );//El tercero es una Fecha
			
			objeto = file.readObject();//Persona
			
			long valorLong  =file.readLong();
			
			System.out.println("Tipo de dato Long: "+valorLong);
			
		file.close();
	}

}
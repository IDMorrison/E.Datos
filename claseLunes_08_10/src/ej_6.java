import java.io.*;
import java.util.*;

public class ej_6 {
	public static void main (String[] args) throws Exception {
		String arch ="archivo1.bin";
		imprimir(arch);
	}
	
	public static void imprimir(String arch) throws Exception {
		FileInputStream fis = new FileInputStream(arch);
		ObjectInputStream file = new ObjectInputStream(fis);
		
		Object objeto = null;
	    objeto = file.readObject();
	    
	    while (objeto!=null) {
	    	System.out.println(((Alumno)objeto).dni);
	    	System.out.println(((Alumno)objeto).apellido);
	    	System.out.println(((Alumno)objeto).nombre);
	    	System.out.println(((Alumno)objeto).sueldo);
	    	
	    	objeto = file.readObject();
	    }
		
	}
}
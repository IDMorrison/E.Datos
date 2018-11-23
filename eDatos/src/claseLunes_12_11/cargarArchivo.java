package claseLunes_12_11;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class cargarArchivo{
	public static void main (String[] args) throws Exception{
		Scanner tecl = new Scanner(System.in);
		
		String nombreArchivo = tecl.nextLine();
		
		FileOutputStream fos = new FileOutputStream(nombreArchivo);
		ObjectOutputStream file = new ObjectOutputStream(fos);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		p1.edad = 10;
		p1.nombre = "Pepe";
		p2.edad = 20;
		p2.nombre = "Juan";
		p3.edad = 5;
		p3.nombre = "Ruperta";

		

		file.writeObject(p1);// Escribo un tipo de dato 'Persona'.
		file.writeObject(p2);// Escribo un tipo de dato 'Persona'.
		file.writeObject(p3);

		file.flush();
		file.close();

	}
}
package claseLunes_12_11;
import java.io.*;
import java.util.*;

public class ejercicio{
	public static void main (String[] args) throws Exception{
		Scanner tecl = new Scanner(System.in);
		int menu=-1;
		boolean leido = false;
		Lista lista = null;
		while (menu!=0){
			System.out.println("Opciones: ");
			if (leido == false)System.out.println("1: Leer Archivo ");
			System.out.println("2: Mostrar Lista ");
			System.out.println("2: Insertar dato en Lista ");
			menu = tecl.nextInt();
			switch (menu) {
			case 1: {lista = leerArchivo(tecl.nextLine()); 
				leido=true;}
			case 2: mostrarLista(lista); 
			default: System.out.println("Menu inexistente");
			}
		}
		
	}
	
	public static void mostrarLista(Lista lista){
		for(int i=0;i<lista.getSize();i++){
			System.out.print("Posicion :"+i);
			System.out.println(lista.get(i));
		}
	}
	
	public static Lista leerArchivo(String nombreArchivo) throws Exception {
		FileInputStream fis = new FileInputStream(nombreArchivo);
		ObjectInputStream file = new ObjectInputStream(fis);
		
		Lista lista = new Lista();
		
		Persona p = null;
		EOFException eofEx = null; // end of file exception
		
		while (eofEx==null){
			try {
				p = (Persona) file.readObject();
				lista.agregar(p);
			}
			catch (EOFException e){
				eofEx = e;
			}
		}
		file.close();
		
		return lista;
	}
}
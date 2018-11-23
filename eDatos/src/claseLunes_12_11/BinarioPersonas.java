package claseLunes_12_11;

import java.io.*;


public class BinarioPersonas {

	public static void main2(String[] var) throws Exception {

		/*
		 * (ObjectOutputStream). Para escribir en archivos Binarios. Tipos de datos
		 * primitivos y tipos de datos definidos por el usuario (Objetos).
		 */

		String nombreArchivo = "Archivo.bin";

		FileOutputStream fos = new FileOutputStream(nombreArchivo);
		/**
		 * Creates an ObjectOutputStream that writes to the specified OutputStream. This
		 * constructor writes the serialization stream header to the underlying stream;
		 * callers may wish to flush the stream immediately to ensure that constructors
		 * for receiving ObjectInputStreams will not block when reading the header.
		 */
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

		// Una vez escrito, ahora lo leemos:
		leerArchivoBinario(nombreArchivo);

	}
	public static void main(String[] var) throws Exception {
		String nombreArchivo = "Archivo.bin";
		leerArchivoBinario(nombreArchivo);
		
	}

	public static void leerArchivoBinario(String nombreArchivo) throws Exception {

		FileInputStream fis = new FileInputStream(nombreArchivo);
		/**
		 * Creates an ObjectInputStream that reads from the specified InputStream. A
		 * serialization stream header is read from the stream and verified. This
		 * constructor will block until the corresponding ObjectOutputStream has written
		 * and flushed the header.
		 */
		ObjectInputStream file = new ObjectInputStream(fis);
		Lista lista = new Lista();
		Persona p = null;
		EOFException eofEx = null;//Esta Exception se lanza al llegar al final del archivo.

		System.out.println("------Archivo Binario------------");
		
		while (eofEx == null) {

			try {
				p = (Persona) file.readObject();
				System.out.println("Persona: " + p.nombre);
				
				lista.agregar(p);

			} catch (EOFException e) {
				eofEx = e;//Llego al final del archivo, ahora (eofEx!=null) sale del while
			}

		}
		
		System.out.println("------LISTA------------");
		
		for(int i=1; i<=lista.getSize(); i++) {
			
			p = lista.get(i);
			System.out.println(p.nombre);
			
		}
		
		p = new Persona();
		p.nombre = "Inserto en posicion 2";
		
		lista.insertar(2, p);
		
		System.out.println("------LISTA 2-----------");
		
		for(int i=1; i<=lista.getSize(); i++) {
			
			p = lista.get(i);
			System.out.println(p.nombre);
			
		}
				
		file.close();
	}

}
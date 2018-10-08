package io;

import java.io.*;
import java.util.*;

public class Archivos {
	
	public static void main (String[] pepe) throws Exception {
		
		String arch="archivo.txt";
		
		//FileWriter fw = new FileWriter(arch, true);
		//Hace append
		//PrintWriter prin = new PrintWriter(fw);
		
		
		PrintWriter prin = new PrintWriter(arch);
		//No hace auto flush y no hace append.
		
		for(int i=0; i<90; i++)
		prin.println("Hola Mundo"+i+"regrtgtrhgfthgyhyhjgyytjyujyujyjyu");
		
				
		prin.flush();
		
		prin.close();
		
		System.out.println("========FIN==========");
		
		
		FileReader f = new FileReader(arch);
		
		BufferedReader bufer = new BufferedReader(f);
		
		String linea=bufer.readLine();
		char[] arrayDeChar;
		
		int fila = 0;
		int columna;
		
		String txt="Mundo20";
		
		while(linea!=null) {			
			
			
			arrayDeChar = linea.toCharArray();
			
			columna = buscarPalabra(arrayDeChar, txt);
			
			System.out.println(linea);
			
			linea=bufer.readLine();			
			
			fila++;
			
			if(columna>-1) {
				System.out.println("Palabra encontrada "+txt+", en fila "+fila+", columna "+columna);
				
				//return;
			}
				
		}
		
		bufer.close();
		
	}

	
	/*
	public static void main (String[] pepe) throws Exception {
		
		File file = new File(".");
		
		System.out.println("file.getAbsolutePath(): "+file.getAbsolutePath());
		
		System.out.println("file.getPath(): "+file.getPath());
		
		System.out.println("file.list(): "+file.list());
		
		MiEstructora[] a = new MiEstructora[10];
		
		a[5]= new MiEstructora();
		
		a[5].atr = 7;
		
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
	public static int buscarPalabra(char[] arrayDeChar, String pal) {
		
		char[] palabra = pal.toCharArray();
		boolean encontre = false;
		
		for(int i=0; i<arrayDeChar.length-palabra.length+1; i++) {
			
			for(int j=0; j<palabra.length; j++)
				if(arrayDeChar[i+j]==palabra[j])
					encontre=true;
				else
				{ 
					 encontre=false;
					 break;
				}
			
			if(encontre)
				return i;
		}
		
		
		return -1;
	}
}

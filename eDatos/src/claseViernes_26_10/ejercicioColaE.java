package claseViernes_26_10;

import paquete1.*;

public class ejercicioColaE{
	public static void main (String[] args){
		int tamanio = 4;
		ColaE colaE1 = new ColaE(tamanio);
		llenar(colaE1,4);
		desencolar(colaE1,5);
		
	}
	public static void llenar(ColaE cola, int tamanio){
		for (int i=0; i<tamanio; i++){
			cola.encolar(i);
		}
	}
	
	public static void desencolar(ColaE cola, int tamanio){
		for (int i=0; i<tamanio; i++){
			System.out.println(cola.desencolar());
		}
	}
}
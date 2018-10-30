package claseViernes_26_10;

import paquete1.*;

public class PruebaCola {

	public static void main(String[] args) {

		Cola cola = new Cola();
						
		for(int i=0; i<10; i++) {
			System.out.println("Ponemos: "+i);
			cola.encolar(i);			
		}
		System.out.println("****************************");
		while(!cola.vacia()) 
			System.out.println("Sacamos: "+cola.desencolar());					
				
	}

}

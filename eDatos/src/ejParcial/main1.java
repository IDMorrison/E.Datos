package ejParcial;
import java.util.*;

import paquete1.Persona;
public class main1{
	public static void main (String[] args) {
		Scanner tecl = new Scanner(System.in);
		
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		Persona pers3 = new Persona();
		Persona pers4 = new Persona();
		Lista<Persona> lista = new Lista<Persona>();
		
		pers1.apellido = "Gomez";
		pers1.nombre = "Juan";
		pers1.edad = 22;
		
		pers2.apellido = "Sadran";
		pers2.nombre = "Ari";
		pers2.edad = 25;
		
		pers3.apellido = "Talarga";
		pers3.nombre = "JuanCho";
		pers3.edad = 30;

		pers4.apellido = "Talarga";
		pers4.nombre = "Rosa";
		pers4.edad = 30;
		
		lista.agregar(pers1); //Juan	
		lista.borrar(0);
		lista.colocar(pers2,0); // Ari [0]
		lista.agregar(pers3); // JuanCho
		lista.colocar(pers4,0); // Rosa
		
		System.out.println("Mostrando Lista");
		for (int i = 0; i<3 ; i++) {
			System.out.println(lista.get(i).nombre);
		}
		System.out.println("------------------------------------");
		lista.borrar(0);
		for (int i = 0; i<2 ; i++) {
			System.out.println(lista.get(i).nombre);
		}
		
//		System.out.println("------------ desapilando");
//		
//		cola.desEnconlar();
//		
//		imprimirArray(cola.mostraCola());
//		
//		System.out.println(cola.desEnconlar().nombre);
//		
//		imprimirArray(cola.mostraCola());
//		cola.desEnconlar();
//		imprimirArray(cola.mostraCola());
//		System.out.println(cola.tamanio());
	}
	
	public static void imprimirArray(Persona[] array) {
		int tamanio = array.length;
		for (int i = 0; i<tamanio; i++) {
			System.out.println(array[i].nombre);
		}
		if (tamanio==0) System.out.println("Vacio");
	}
}

package ejParcial;

import paquete1.Persona;

public class Pila {
	Nodo <Persona> ultimo;
	int tamanio;
	
	public Pila() {
		ultimo = new Nodo <Persona>();
		tamanio=0;
	}
	
	public int tamanio() {
		return tamanio;
	}
	
	public boolean vacio() {
		return (tamanio==0);
	}
	
	public void apilar(Persona persona1) {
		Nodo <Persona> nuevo = new Nodo <Persona>();
		nuevo.persona = persona1;
		if (tamanio==0) {
			ultimo = nuevo;
		} else {
			nuevo.siguiente = ultimo;
		}
		ultimo=nuevo;
		tamanio++;
	}
	
	public Persona desApilar() {
		Persona devolver = new Persona();
		devolver = ultimo.persona;
		ultimo = ultimo.siguiente;
		tamanio--;
		return devolver;
	}
	
	public Persona[] mostrarPila() {
		Persona[] array = new Persona[tamanio];
		Nodo <Persona> aux = ultimo;
		for (int i = 0; i<tamanio;i++) {
			array[i] = aux.persona;
			aux = aux.siguiente;
		}
		return array;
	}
}

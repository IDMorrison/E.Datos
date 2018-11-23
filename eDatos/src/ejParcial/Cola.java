package ejParcial;

import paquete1.Persona;

public class Cola {
	Nodo <Persona> primero;
	Nodo <Persona> ultimo;
	int tamanio;
	
	public Cola() {
		tamanio=0;
	}
	
	public boolean vacio() {
		return (tamanio==0);
	}
	
	public int tamanio() {
		return tamanio;
	}
	
	public void enColar(Persona pers) {
		Nodo <Persona> nuevo = new Nodo <Persona>();
		nuevo.persona = pers;
		if (tamanio==0) {
			primero = nuevo;
		} else {
			ultimo.siguiente=nuevo;
		}
		ultimo = nuevo;
		tamanio++;
	}
	
	public Persona desEnconlar() {
		Persona devolver = primero.persona;
		primero = primero.siguiente;
		tamanio--;
		return devolver;
	}
	
	public Persona[] mostraCola() {
		Nodo<Persona> aux = primero;
		Persona[] array = new Persona[tamanio];
		for (int i = 0; i<tamanio; i++) {
			array[i] = aux.persona;
			aux = aux.siguiente;
		}
		return array;
	}
	
}

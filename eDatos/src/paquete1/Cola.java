package paquete1;

public class Cola {

	private Nodo primero;
	private Nodo ultimo;
	private int elementos;

	public Cola() {
		primero = null;
		ultimo = null;
		elementos = 0;
	}

	public void encolar(int valor) {
		Nodo nuevo = new Nodo();
		nuevo.dato = valor;
		nuevo.siguiente = null;
		if (primero == null)
			primero = nuevo;
		else
			ultimo.siguiente = nuevo;
		ultimo = nuevo;
		elementos++;
	}

	public int desencolar() {

		int valor = primero.dato;
		primero = primero.siguiente;
		elementos--;
		
		return valor;
	}

	public boolean vacia() {
		return (primero == null);
	}
	
	public boolean llena() {
		return false;
	}

	public int size() {
		return elementos;
	}
}

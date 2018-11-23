package claseLunes_12_11;

public class Lista {

	private NodoLista ultimo;
	private NodoLista primero;
	private int elementos;

	public Lista() {
		elementos = 0;
		ultimo = null;
		primero = null;
	}

	public void insertar(int posicion, Persona persona) {
		
		if(posicion >= (elementos+1) ) {//Mas atras del final, lo pongo al final
			agregar(persona);
			return;
		}

		NodoLista nuevo = new NodoLista();
		nuevo.dato = persona;

		NodoLista actual = primero;
		NodoLista anterior;
		
		if (posicion <= (elementos / 2)) {// Busco desde adelante.
			for (int i = 1; i < posicion; i++)
				actual = actual.siguiente;
		} else {// Caso contrario, busco desde el final.

			actual = ultimo;
			for (int i = elementos; i > posicion; i--)
				actual = actual.anterior;

		}	
		//Quedamos posicionados en la posicion a eliminar.

		anterior = actual.anterior;
		
		nuevo.anterior = anterior;
		actual.anterior = nuevo;
		nuevo.siguiente = actual;
		
		if (anterior != null)
			anterior.siguiente = nuevo;
		else // estoy insertando en el primero:
			primero = nuevo;
		
		elementos++;
	}

	public void agregar(Persona persona) {

		NodoLista actual = new NodoLista();
		actual.dato = persona;

		if (primero == null) {// Lista vacia
			primero = actual;
		} else {
			ultimo.siguiente = actual;
			actual.anterior = ultimo;
		}
		// Pase lo que pase
		// El ultimo de la lista es el que acaba de llegar.
		ultimo = actual;
		elementos++;
	}

	public Persona get(int posicion) {

		NodoLista actual = primero;

		if (posicion <= (elementos / 2)) {// Busco desde adelante.

			for (int i = 1; i < posicion; i++)
				actual = actual.siguiente;

		} else {// Caso contrario, busco desde el final.

			actual = ultimo;
			for (int i = elementos; i > posicion; i--)
				actual = actual.anterior;
		}

		return actual.dato;
	}

	public Persona borrar(int posicion) {
		// Modificar esta logica, para recorrer desde atras, cuando sea conveniente.

		NodoLista actual = primero;
		NodoLista anterior;
		NodoLista siguiente;

		if (posicion <= (elementos / 2)) {// Busco desde adelante.
			for (int i = 1; i < posicion; i++)
				actual = actual.siguiente;
		} else {// Caso contrario, busco desde el final.

			actual = ultimo;
			for (int i = elementos; i > posicion; i--)
				actual = actual.anterior;

		}	
		//Quedamos posicionados en la posicion a eliminar.

		anterior = actual.anterior;
		siguiente = actual.siguiente;

		if (anterior != null)
			anterior.siguiente = siguiente;
		else // estoy borrando el primero:
			primero = siguiente;

		if (siguiente != null)
			siguiente.anterior = anterior;
		else //Estoy borrando el ultimo.
			ultimo = anterior;

		Persona dato = actual.dato;

		actual = null; // "Borra"

		elementos--;

		return dato;
	}

	public int getSize() {
		return elementos;
	}

	public boolean estaVacia() {

		if (elementos == 0)
			return true;

		return false;
	}
	
	public boolean exists(Persona dato) {

		//Debe buscarlo y devolver true si lo encuentra

		return false;
	}

	public void borrarTodo() {
		elementos = 0;
		ultimo = null;
		primero = null;
	}
}

package claseViernes_09_11;

public class Lista {

	private NodoLista ultimo;
	private NodoLista primero;
	private int elementos;

	public Lista() {
		elementos = 0;
		ultimo = null;
		primero = null;
	}

	public void insertar(int posicion, int elemento) {
		if (posicion>elementos){
			agregar(elemento);
			return;
		}
		NodoLista actual = new NodoLista();
		NodoLista posicionBuscada = new NodoLista();
		NodoLista anterior = new NodoLista();
		NodoLista siguiente = new NodoLista();
		actual.dato = elemento;
		

		if (posicion<elementos/2){
			posicionBuscada=primero;
			for (int i = 1; i<posicion;i++){
				posicionBuscada=posicionBuscada.siguiente;
			}
		} else {
			posicionBuscada=ultimo;
			for (int i=elementos;i>posicion;i--){
				posicionBuscada=posicionBuscada.anterior;
			}
		}
		
		anterior=posicionBuscada.anterior;
		
		actual.siguiente=posicionBuscada;
		posicionBuscada.anterior=actual;
		
		if (posicionBuscada.siguiente==null || anterior!=null) {
			actual.anterior=anterior;
			anterior.siguiente=actual;
		} else { primero=actual; } 		
		
		// COMPLETAR!!!!!!!
		//Hay que buscar la posicion donde insertar y hacer el desplazamiento correcto para la insercion.

		elementos++;
	}
	public int primero(){
		return primero.dato;
	}
	public void agregar(int elemento) {

		NodoLista actual = new NodoLista();
		actual.dato = elemento;

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

	public int get(int posicion) {

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

	public int borrar(int posicion) {
		
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

		int dato = actual.dato;

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
	
	public boolean exists(int dato) {

		//Debe buscarlo y devolver true si lo encuentra

		return false;
	}

	public void borrarTodo() {
		elementos = 0;
		ultimo = null;
		primero = null;
	}
}

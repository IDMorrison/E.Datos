package ejParcial;

public class Lista <T>{
	Nodo <T> primero;
	Nodo <T> ultimo;
	int tamanio;
	
	public Lista() {
		tamanio=0;
	}
	
	public boolean vacio() {
		return tamanio==0;
	}
	
	public int tamanio() {
		return tamanio;
	}
	
	public void agregar(T objeto) {
		Nodo <T> nuevo = new Nodo <T>();
		nuevo.persona = objeto;
		if (tamanio==0) {
			primero = nuevo;
		} else {
			ultimo.siguiente=nuevo;
			nuevo.anterior=ultimo;
		}
		ultimo = nuevo;
		tamanio++;
	}
	
	public void colocar(T objeto, int posicion) {
		Nodo <T> nuevo = new Nodo <T>();
		Nodo<T> anterior = new Nodo <T>();
		nuevo.persona=objeto;
		Nodo <T> buscado=primero;
		
		
		
		if (posicion>=tamanio) {
			this.agregar(objeto);
			return;
		}
		if (posicion<=tamanio/2) {
			for (int i = 0;i<posicion;i++) {
				buscado = buscado.siguiente;
			}
		} else {
			buscado=ultimo;
			for (int i = tamanio-1;i>posicion;i--) {
				buscado = buscado.anterior;
			}
		}
		
		anterior = buscado.anterior;
		nuevo.siguiente=buscado;
		buscado.anterior = nuevo;
		
		if (anterior != null) {
			anterior.siguiente=nuevo;
			nuevo.anterior = anterior;
		} else {primero = nuevo;}
		tamanio++;
	} 
	
	public T get (int posicion) {
		
		Nodo <T> buscado;
		buscado=primero;
		if (posicion<=tamanio/2) {
			for (int i = 0; i<posicion; i++) {
				buscado=buscado.siguiente;
			}
		} else {
			buscado=ultimo;
			for (int i = tamanio-1; i>posicion; i--) {
				buscado=buscado.anterior;
			}
		}
		return buscado.persona;
	}
	
public void borrar (int posicion) {
		Nodo <T> anterior;
		Nodo <T> siguiente;
		Nodo <T> buscado;
		buscado=primero;
		if (tamanio==1) {
			primero=new Nodo <T>();
			ultimo=new Nodo <T>();
			tamanio--;
			return;
		}
		if (posicion<=tamanio/2) {
			for (int i = 0; i<posicion; i++) {
				buscado=buscado.siguiente;
			}
		} else {
			buscado=ultimo;
			for (int i = tamanio-1; i>posicion; i--) {
				buscado=buscado.anterior;
			}
		}
		anterior=buscado.anterior;
		siguiente=buscado.siguiente;
		if (anterior!=null && siguiente!=null) {
			anterior.siguiente=siguiente;
			siguiente.anterior = anterior;
		} else if(siguiente==null){
			anterior.siguiente=null;
			ultimo=anterior;
		} else {
			siguiente.anterior=null;
			primero = siguiente;
		}
		tamanio--;
	}
}

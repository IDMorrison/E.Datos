package claseLunes05_11;

public class ColaInt{
	NodoInt primero;
	NodoInt ultimo;
	int tamanio;
	public ColaInt(){
		tamanio = 0;
		primero = null;
		ultimo = null;
	}
	
	public boolean colaVacia(){
		return (tamanio==0);
	}
	
	public int tamanio(){
		return tamanio;
	}
	
	public void encolar(int valor){
		NodoInt nuevo = new NodoInt();
		nuevo.dato = valor;
		nuevo.siguiente = null;
		
		if (primero==null){
			primero=nuevo;
		} else { ultimo.siguiente = nuevo; }
		
		ultimo=nuevo;
		tamanio++;
	}
	
	public int desEncolar(){
		int valor = primero.dato;
		primero=primero.siguiente;
		tamanio--;
		return valor;
	}
	
	public int mostrarPrimero(){
		return primero.dato;
	}
	
	public int[] mostrarCola(){
		NodoInt posicion = new NodoInt();
		int[] array1 = new int[tamanio];
		int valor1;
		
		for (int i=0; i<tamanio; i++){
			if (i==0){
				posicion=primero.siguiente;
				array1[i] = primero.dato;
			} else { 
				valor1 = posicion.dato;
				posicion = posicion.siguiente;
				array1[i] = valor1;
			}  
		}
		return array1;
	}
}
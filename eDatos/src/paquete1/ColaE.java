package paquete1;
public class ColaE {
	int[] cola;
	int tamanio;
	int posicion; 
	int posicionPrimero;
	int primero;
	
	public ColaE(int size1) {
		 tamanio=size1;
		 cola = new int[tamanio];
	}
	
	public void encolar(int dato) {
		if (!this.lleno()){
			cola[posicion]=dato;
			posicion++;
		}
	}
	
	public int desencolar(){
		if (!this.vacio()){
			int sacar = cola[posicionPrimero];
			posicionPrimero++;
			return sacar;
		} else  return -1;	
	}
	
	public boolean lleno(){
		return (posicion>tamanio-1);
	}
	public boolean vacio(){
		return (posicionPrimero>tamanio-1);
	}

}
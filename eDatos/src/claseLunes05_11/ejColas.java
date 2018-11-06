package claseLunes05_11;

public class ejColas{
	public static void main (String[] args){
		ColaInt cola1 = new ColaInt();
		cola1.encolar(5);
		cola1.encolar(4);
		cola1.encolar(3);
		cola1.encolar(2);
		cola1.encolar(1);
		
		int[] cola = cola1.mostrarCola();
		for (int i = 0; i < cola1.tamanio ; i++){
			System.out.println(cola[i]);
		}
	}
}
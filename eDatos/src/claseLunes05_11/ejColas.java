package claseLunes05_11;
import java.util.*;
public class ejColas{
	public static void main (String[] args){
		Scanner tecl = new Scanner(System.in);
		ColaInt cola1 = new ColaInt();
		int menu = -1;
		
		while(menu!=0){
			
			if (cola1.tamanio()==5){
				cola1.desEncolar();
			}
			switch (menu){
				case 1: System.out.println(cola1.tamanio());
						break;
				case 2: System.out.println(cola1.colaVacia());
						break;
				case 3: cola1.encolar(tecl.nextInt());
						break;
				case 4: System.out.println(cola1.desEncolar());
						break;
				case 5: imprimirArray(cola1.mostrarCola());
						break;
			}
			System.out.println("Ingrese un numero:");
			menu=tecl.nextInt();
		}
	}
	public static void imprimirArray(int[] array){
		for (int i = 0; i<array.length;i++){
			System.out.println("Posicion: "+(i+1)+" :"+array[i]);
		}
	}
}
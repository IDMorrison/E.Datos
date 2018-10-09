import java.util.*;

public class ejercicio1 {
	public static void main (String[] args){
		Scanner sn = new Scanner(System.in);
		
		Libro libro1 = new Libro(1,"El Principito","Wilde",1934);
		libro1.setIsbn(01);
		System.out.println("Ingrese el titulo del libro:");
		String titulo = sn.nextLine();
		libro1.setTitulo(titulo);
		libro1.getTitulo();
	}
}
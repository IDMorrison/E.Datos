
public class Libro {
	int isbn;
	String titulo;
	String autor;
	int numPaginas;
	
	public Libro (int pIsbn,String pTitulo, String pAutor, int pNumPaginas ){
		isbn=pIsbn;
		titulo=pTitulo;
		autor=pAutor;
		numPaginas=pNumPaginas;
	}
	public void setIsbn(int pIsbn){
		isbn=pIsbn;
	}
	public int getIsbn(){
		return isbn;
	}
	public void setTitulo(String pTitulo){
		titulo=pTitulo;
	}
	public String getTitulo(){
		return titulo;
	}
}

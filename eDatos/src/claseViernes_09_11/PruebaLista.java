package claseViernes_09_11;

public class PruebaLista {
  
  
  public static void main(String[] args) {
    
    Lista lista = new Lista();
    
    for(int i=1;i<21; i++)
     lista.agregar(i);
     
    
    for(int i=1; i<=lista.getSize(); i++)
     System.out.println("En la lista hay "+lista.get(i));
    
    System.out.println("================================================");
    
    for(int i=lista.getSize(); i>0; i--)
        System.out.println("En la lista hay "+lista.get(i));
    
   
    while(!lista.estaVacia()) {
    	
    	
        System.out.println("En la lista hay "+lista.borrar(lista.getSize()));
    }
       
    
  }
  
  
}
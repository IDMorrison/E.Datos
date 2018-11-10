package claseViernes_09_11;

public class PruebaLista2 {
  
  
  public static void main(String[] args) {
    
    Lista lista = new Lista();
    
    for(int i=1;i<6; i++)
     lista.agregar(i);
     
    lista.insertar(2, 99);
    System.out.println(lista.getSize());
    System.out.println(lista.get(2));
    System.out.println(lista.primero());
  }
  
  
}
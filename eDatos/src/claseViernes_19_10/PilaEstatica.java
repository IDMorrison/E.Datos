package claseViernes_19_10;

public class PilaEstatica{
  private int[] datos = null;
  private int tamanio = 0;
  private int posicion=-1;
  
  public PilaEstatica(int size){
    tamanio=size; 
    datos = new int[tamanio];
  }
  
  public boolean estaVacia(){
    if (posicion==-1){
      return true;
    } else return false;
  }
  
  public void apilar(int valor){
    if (!this.estaLlena()){
      posicion++;
      datos[posicion]=valor; 
    }
  }
  
  public int desApilar(){
    int devolver=datos[posicion];
    posicion--;
    return devolver;
  }
  
  public int tamanio() {
    return tamanio;
  }

  public boolean estaLlena() {
    if (posicion==tamanio-1)
      return true;
    else return false;
  }

  public int cima() {
    return datos[posicion];
  }
}


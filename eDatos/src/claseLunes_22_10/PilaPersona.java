package claseLunes_22_10;

public class PilaPersona {

 private NodoPersona tope = null;
 private int elementos = 0;

 public PilaPersona() {
  elementos = 0;
  // Crea una pila vacia.
  tope = null;
  // Nodo tope, es el unico, esta vacio y
  // no apunta a ningun otro nodo.
 }

 public boolean estaVacia() {

  if (tope == null)// Es = poner "if(elementos == 0)"
   return true;

  return false;
 }

 public void apilar(Persona valor) {

  NodoPersona nodoActual = new NodoPersona();
  nodoActual.persona1 = valor;

  nodoActual.siguiente = tope;// El actual, apunta al nodo tope.

  tope = nodoActual;// El nodoActual es el nodo tope ahora.

  elementos++;
 }

 public Persona desApilar() {
  Persona valor = tope.persona1;
  
  tope = tope.siguiente;//El nuevo tope, es el nodo siguiente al tope actual.
  elementos--;

  return valor;
 }

 public int tamanio() {
   return elementos;
 }

 public boolean estaLlena() {

  return false;// Al ser dinamica, nunca esta llena. 
     // (Excepto por falta de memoria o alguna limitacion)
 }

 public Persona cima() {
   return tope.persona1;//Solo devuelve el dato del tope, sin cambiar el tope.
 }
}
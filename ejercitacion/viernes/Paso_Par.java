import java.util.Scanner;
class Paso_Par{
  static class TdaNombre{
    String nombre;
  }
  static void ModificarNombre(String sNombre,TdaNombre tNombre){
    String iNombre;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduce Nombre: ");
    iNombre=entrada.nextLine();
    sNombre=iNombre;
    tNombre.nombre=iNombre;
  }
  
  public static void main(String[] args) {
    String stNombre;
    stNombre = "";
    TdaNombre tdNombre = new TdaNombre();
    ModificarNombre(stNombre,tdNombre);
    System.out.print("Variable "+ stNombre);
    System.out.print("\nTDA "+tdNombre.nombre);
  }
}
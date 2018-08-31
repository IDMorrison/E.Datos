import java.util.Scanner;
public class Cuadrado 
{
  public static void main(String[] args) {
    int n; // tamaño del lado
    int fila, col;
    Scanner entrada = new Scanner(System.in);
    System.out.print ("Lado del cuadrado: ");
    n = entrada.nextInt();
    for (fila=1; fila<=n; fila++)
    {
      for (col=1; col<=n; col++)
        System.out.print ("* ");
      System.out.println ("");
    }
  }
}
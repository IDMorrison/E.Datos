import java.util.Scanner;
public class Juego 
{
    public static void main(String[] args) 
  {
    Scanner entrada = new Scanner(System.in);
    int n, num, nVeces;
    n=(int)(Math.random()*100)+1;
    nVeces = 0;

    System.out.print("Introduce número: ");
    num=entrada.nextInt();
    while(num!=n) // mientras no coincidan ambos números
    {
      if(num>n)
        System.out.println("Debe ser menor");
      else
        System.out.println("Debe ser mayor");
      System.out.print("Introduce número: ");
      num=entrada.nextInt();
      nVeces++;
    }
// al salir del mientras tenemos la certeza que num es igual a n
    System.out.println("acertaste en "+nVeces+" oportunidades");
  }
}
import java.util.Scanner;
public class Tablas 
{
  public static void main(String[] args) 
  {
    int num;
    do
    {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Introduce número (de 0 a 10): ");
      num=entrada.nextInt();
    }
    while ( ! (0<=num && num<=10));
    System.out.println("\n\nTabla del " + num);
    for (int i=1;i<=10;i++)
    {
      System.out.println(num + " x " + i + " = " + num*i);
    }
  }
}
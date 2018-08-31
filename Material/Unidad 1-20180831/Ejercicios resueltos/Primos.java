import java.util.Scanner;
public class Primos 
{
  public static void main(String[] args) {
    int j,num,cont_pri;
    boolean primo;
    cont_pri=0;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduce numero hasta: ");
    num=entrada.nextInt();
// vamos procesando todos los números entre 1..num
    for(int i=1;i<=num;i++){
      // para cada número i, calcularemos si es primo
// veremos si el número i es divisible en el rango 2..i-1

      primo=true;
      j=2;
      while (j<=i-1 && primo==true)
      {
        if (i%j==0)
          primo=false;
        j++;
      }
      if (primo==true){
        cont_pri++; // si es primo incrementamos el contador de primos
        System.out.println(i+(" es primo"));
      }
    }
    System.out.println("En el rango 1.." + num + ", hay "+ cont_pri + " números primos");
  }
}
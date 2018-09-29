import java.util.Scanner;

public class PruebaCuit2{
  public static void main(String Arg[ ]) {
    Cuit numero;
    int num;
    char cSex;
    String res;
    String resu;
//        System.out.print("Ingrese numero : ");
//        num = Integer.parseInt(in.readLine( ));
    Scanner entrada = new Scanner(System.in);
//   num= 25530354;
//  cSex = 'M';
    System.out.print("Introduce número: ");
    num=entrada.nextInt();
    
    System.out.print("Introduce Sexo: ");
    cSex=entrada.next().trim().charAt(0);
    
    
    numero = new Cuit(num,cSex);
    res=mostrarCuit(numero);
    System.out.print(res);
    System.out.println("\n");
  }
  static String mostrarCuit(Cuit nroCuit){
    String resu;
    resu = nroCuit.generar();
    return resu;
  }
}
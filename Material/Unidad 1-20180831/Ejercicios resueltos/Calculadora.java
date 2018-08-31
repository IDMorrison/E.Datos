import java.util.Scanner;
import java.io.*;
public class Calculadora {
      public static void main(String []agrs)
    {
        int op=0;
        int ch=0;
        double n1,n2,s,m,d,r;
        do{
          
            Scanner entrada = new Scanner(System.in);
            System.out.print("\nCalculadoran"+
            "************"+
            "\n[1] SUMAR"+
            "\n[2] RESTAR"+
            "\n[3] MULTIPLICAR"+
            "\n[4] DIVIDIR"+
            "\n[5] SALIR"+
            "\nIngresa una opcion:");
          
           op= entrada.nextInt();

            switch(op)
            {
                case 1:
                    System.out.print("Ingrese numero 1");
                    n1= entrada.nextDouble();
                    System.out.print("Ingrese numero 2");
                    n2= entrada.nextDouble();
                    s=n1+n2;
                    System.out.print("\nLa suma es:"+s);
                  //int letter = System.in.read();                                        
                   // x=interesCompuesto();
                    try{
                      ch=System.in.read();
                      System.out.println("Value entered:"+ch);
                    }
                    catch(IOException io){
                      System.out.println("Error from user");
                    }
                    break;
                case 2:
                  
                    System.out.print("Ingrese numero 1");
                    n1= entrada.nextDouble();
                    System.out.print("Ingrese numero 2");
                    n2= entrada.nextDouble();
                    r=n1-n2;
                    System.out.print("\nLa suma es:"+r);
                    break;
                case 3:
                    System.out.print("Ingrese numero 1");
                    n1= entrada.nextDouble();
                    System.out.print("Ingrese numero 2");
                    n2= entrada.nextDouble();
                    m=n1*n2;
                    System.out.print("\nLa multiplicación es:"+m);
                    break;
                case 4:
                    System.out.print("Ingrese numero 1");
                    n1= entrada.nextDouble();
                    System.out.print("Ingrese numero 2");
                    n2= entrada.nextDouble();
                    d=n1/n2;
                    System.out.print("\nLa division es:"+d);
                    break;

            }
        }while(op!=5);
    }

}

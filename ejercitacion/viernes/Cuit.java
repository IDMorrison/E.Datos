public class Cuit {

    private int dni;
    private char sexo;
//    private int digito;
    private int dniStc; 
    private int xyStc; 
    private int digitoStc; 

    //Constructor por defecto
    public Cuit() {
    }

    //Constructor con parámetros
    public Cuit(int dni, char sexo ) {
        this.dni = dni;
        this.sexo = sexo;
        
        
    
    }
    
    public String generar() {
      
      int dniInt; 
      char xyChar;
      dniInt = dni;
      xyChar = sexo;
    if (xyChar == 'F' || xyChar == 'f') 
        xyStc = 27; 
    else if (xyChar == 'M' || xyChar == 'm') 
        xyStc = 20; 
    else 
        xyStc = 30; 
    dniStc = dniInt; 
    calcular(); 
    return formatear(); 
} 
    
    /** * Metodo privado q calcula el CUIT * */ 
private void calcular() {
    
    long tmp1, tmp2; 
    long acum = 0; 
    int n = 2; 
    tmp1 = xyStc * 100000000L + dniStc; 
    
    for (int i = 0; i < 10; i++) { 
        tmp2 = tmp1 / 10; 
        acum += (tmp1 - tmp2 * 10L) * n; 
        tmp1 = tmp2; 
        if (n < 7)  n++; 
        else  n = 2; 
    } 
    
    n = (int) (11 - acum % 11); 
    if (n == 10) { 
      if (xyStc == 27)
        digitoStc = 4;
      else
        digitoStc = 9;
//        if (xyStc == 20 || xyStc == 27 || xyStc == 24) 
//            xyStc = 23; 
//        else 
//            xyStc = 33; /* 
//    * No es necesario hacer la llamada recursiva a 
//    * calcular(), *se puede poner el digito en 9 si el 
//    * prefijo original era *23 o 33 o poner el dijito 
//    * en 4 si el prefijo era 27 
//    */ 
//    
//        calcular(); 
    } else { 
        if (n == 11) 
            digitoStc = 0; 
        else 
            digitoStc = n; 
    } 
} 
   /** * Metodo privado q da formato al CUIT como String * */ 
private String formatear() { 
    return String.valueOf(xyStc) + "-" + dniStc + "-" + String.valueOf(digitoStc); 
}  
    
}

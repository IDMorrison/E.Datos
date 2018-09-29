public class fechaprueba {
  public static void main (String[] args){
    Fecha date1 = new Fecha();
    Fecha[] date = new Fecha[2];
    llenar(date,date1);
  }
  public static void llenar (Fecha[] date, Fecha date1){
    for (int i=0; i<date.length; i++){
      date1.anio=2018;
      date[i] = date1.anio;
      
    }
  }
}
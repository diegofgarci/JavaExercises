/**it calculates the change of a purchase*/

public class changeDevolution {
  public static void main (String[] args){

    int precio=96;
    int dinero=200;
    int vuelta=0;
    int cambio5=0;
    int cambio2=0;
    int cambio1=0;

    vuelta = dinero - precio;
    while (vuelta>0){
      if (vuelta>=5){
        cambio5++;
        vuelta=vuelta-5;
      }
      else if (vuelta<5 && vuelta>1){
        cambio2++;
        vuelta=vuelta-2;
      }
      else{
        cambio1++;
        vuelta=vuelta-1;
      }
    }
    System.out.println("La vuelta es la siguiente: "+vuelta);
    System.out.println("Billetes de 5: "+cambio5);
    System.out.println("Billetes de 2: "+cambio2);
    System.out.println("Billetes de 1: "+cambio1);
  }
}

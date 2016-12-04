/**dfg. This program show the n element of fibonacci sucession.*/
public class practica {
  public static void main(String[] args) {
    int position=9;
    int elementA=0;
    int elementB=1;
    int result=0;

    if (position==1) {
      result=0;
    }
    else if (position==2){
      result=1;
    }
    else{
      for (int i=3; i<=position; i++){
        result=elementA+elementB;
        elementA=elementB;
        elementB=result;
      }
    }
    System.out.println("El valor de la posición "+position+" es "+result);
  }
}

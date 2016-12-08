/**it creates a multiplication table*/

public class multiplication{
  public static void main (String[] args){
    int number=8;
    int result=0;
    for (int i=1;i<=10;i++){
      result=number*i;
      System.out.println(number+"x"+i+"="+result);
    }
  }
}

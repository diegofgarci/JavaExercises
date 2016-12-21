public class cuadrado {
  private double base;
  private double altura;

  public cuadrado(){
    base=0;
    altura=0;
  }
  public cuadrado(double ba, double alt){
    base=ba;
    altura=alt;
  }

  public double getBase(){
    return base;
  }
  public double setBase(double b){
    base=b;
  }
  public double getAltura(){
    return altura;
  }
  public double setAltura(double al){
    altura=alt;
  }
  public double perimetro(){
    return 2*base+2*altura;
  }
  public double area(){
    return base*altura;
  }
} //end class

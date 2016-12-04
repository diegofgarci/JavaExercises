public class practica {
    
    public static void main(String[] args) {
        int number=0;
        int suma=0;
        
        for (int i=1; i<number; i++){//calculate all divisors except n
            if (number%i==0){
                suma=suma+i; //sum the divisors
            }
        }
        if (suma==number){//compare if the sum is == n
            System.out.println("The "+number+" is perfect");
        }
        else {
            System.out.println("The number "+number+" is not perfect");
        }       
    }    

}

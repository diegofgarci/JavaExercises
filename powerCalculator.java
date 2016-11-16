/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DFG
 */
public class calcularPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base=0;
        int exponente=0;
        int resultado=0;
        
        
        if (exponente==0){
            resultado=1;
        }
        else if (base==1){
            resultado=1;
        }
        else if (base>1 && exponente>0){
            resultado=base;
            for (int i=0; i<=exponente; i++){
                resultado=resultado*base;     
        }
        }        
       
    }
    
}

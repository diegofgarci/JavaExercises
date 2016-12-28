/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfg
 */
public class Cuenta {
    
    //atributos=característiacas de los objetos
    
    private String nombre;
    private String nCuenta;
    private double saldo;
    private double tInteres;
    
    
    //constructores
    public Cuenta(){
        nombre=null;
        nCuenta=null;
        saldo=0;
        tInteres=0;
    }
    
    public Cuenta (String nom, String num, double sald, double inte){
    nombre=nom;
    nCuenta=num;
    saldo=sald;
    tInteres=inte;  
}
    //metodos
    
}

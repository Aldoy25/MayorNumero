/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayornumero;
import java.util.Scanner;

/**
 *
 * @author LCP
 */
public class MayorNumero{
    
    public void Mayor(){
    int n1, n2;
    Scanner entrada = new Scanner (System.in);
    System.out.println("ingresa el 1er valor");
    n1 = entrada.nextInt();
    System.out.println("ingresa el 2do valor");
    n2 = entrada.nextInt();
    
    if(n1 > n2){
        System.out.println("El mayor numero es " + n1);
    } else {
        System.out.println("El mayor numero es " + n2);
        } 
    }
    public static void main(String[] args){
        MayorNumero mayor = new MayorNumero();
        mayor.Mayor();
    }
}

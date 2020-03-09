/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio29;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        double km1,km2, kmtotal, taxadeconsumo,litros;
        
        System.out.println("Qual a KM inicial;");
        km1= ler.nextDouble();
        
         System.out.println("Qual a KM final;");
        km2= ler.nextDouble();
        
         System.out.println("Qual a quantidade de litros de comnustivel consumido:");
        litros= ler.nextDouble();
        
        kmtotal = km2 - km1;
        
        taxadeconsumo = kmtotal/litros;
        
        System.out.println(" o total percorrido foi de: "+kmtotal+" km");
        System.out.println(" A taxa media de consumo é de: "+taxadeconsumo+" litrps por km percorrido" );
    }
    
}

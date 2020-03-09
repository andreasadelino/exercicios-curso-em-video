/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio301;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler= new Scanner(System.in);
        
        double deposito, rendimento , juros;
        
        System.out.println("Qual o valor que foi depositado:");
        deposito= ler.nextDouble();
        
        juros=(deposito*0.70)/100;
        
        rendimento= deposito +juros;
        
        System.out.println("O rendimento no mês foi de " +rendimento+ " R$");
    }
    
}

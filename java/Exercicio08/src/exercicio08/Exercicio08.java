/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num, denom;
        System.out.println("Qual o numerador:");
        num = new Scanner (System.in).nextInt();
        System.out.println("Qual o denominador:");
        denom = new Scanner (System.in).nextInt();
        if(denom!=0) {
            double real = num/denom;
            System.out.println(" O resultado é:" + real);
        }
        else {
            System.out.println("Você digitou um valor invalido para a divisão.");
        }
        }
        
        
        
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Comissao, Gastos;
        System.out.println(" Qual o valor que você gastou no restaurante:");
        Gastos = new Scanner(System.in).nextDouble();
        Comissao = Gastos*0.10;
        System.out.println(" A Comissão foi de R$" +Comissao+"");                
        
    }

    
    }
    


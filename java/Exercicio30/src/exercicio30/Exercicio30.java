/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio30;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
         double real, dolar, cotacao;
         
         System.out.println("Qual a quantidade em dólar:");
         dolar= ler.nextDouble();
         
         System.out.println(" Qual o valor da cotação do dólar:");
         cotacao = ler.nextDouble();
         
         real = dolar * cotacao;
         
         System.out.println("A quantia em reais é: "+real+" R$");
    }
    
}

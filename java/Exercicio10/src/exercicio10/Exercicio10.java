/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double emprestimo, bruto, descontos;
        System.out.println("Digite seu salário bruto:");
        bruto = new Scanner(System.in).nextDouble();
        System.out.println("Digite os descontos:");
        descontos = new Scanner (System.in).nextDouble();
        if(descontos<bruto){
            double liquido = bruto - descontos;
            System.out.println("Qual o valor do emprestimo desejado:");
             emprestimo = new Scanner(System.in).nextDouble();
             if(emprestimo > liquido*0.3){
                 System.out.println(" Desculpe, o empréstimo não será realizado.");
             }
             else{
                 System.out.println("Você poderá obter o emprestimo!");
             }
             
             }
        else{    
            System.out.println("Você digitou valores que não poderão fazer o emprestimo.");        
        }
        }
                
    }
    


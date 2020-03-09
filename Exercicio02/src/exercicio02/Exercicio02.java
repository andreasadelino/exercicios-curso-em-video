/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ValorDoSalarioMinimo, SalarioTotal;
        int QtDeSalarios;
        System.out.println("Qual o valor do  Salario Minimo:");
        ValorDoSalarioMinimo = new Scanner(System.in).nextDouble();
        System.out.println("Qual o valor do salario total:");
        SalarioTotal = new Scanner (System.in).nextDouble();
        QtDeSalarios = (int) (SalarioTotal / ValorDoSalarioMinimo);
        System.out.println("Você ganha " +QtDeSalarios+" salários mínimos.");
    }
    
}

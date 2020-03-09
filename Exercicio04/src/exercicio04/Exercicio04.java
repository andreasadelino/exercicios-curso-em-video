/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Nota1, Nota2 , Nota3, Nota4, Media;
        System.out.println("Qual a 1ª Nota:");
        Nota1 = new Scanner(System.in).nextDouble();
         System.out.println("Qual a 2ª Nota:");
        Nota2 = new Scanner(System.in).nextDouble();
         System.out.println("Qual a 3ª Nota:");
         Nota3 = new Scanner(System.in).nextDouble();
          System.out.println("Qual a 4ª Nota:");
          Nota4 = new Scanner(System.in).nextDouble();
          Media = (Nota1 + Nota2 + Nota3 + Nota4)/4;
          System.out.println("A Média Aritimética das quatro notas é:"+Media+"");
    }
    
}

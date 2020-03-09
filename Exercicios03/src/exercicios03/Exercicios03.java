/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicios03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Homens, Mulheres, QtdTurma;
        double Medhomens, Medmulheres;
        System.out.println("Qual a quantidade de Homens na Turma:");
        Homens = new Scanner(System.in).nextInt();
        System.out.println("Qual a quantidade de Mulheres na Turma:");
        Mulheres = new Scanner(System.in).nextInt();
        QtdTurma = Homens + Mulheres;
        Medhomens = Homens*100/QtdTurma;
        Medmulheres = Mulheres*100/QtdTurma;
        System.out.println(" o percentual de homens na turma é:" +Medhomens+ "%");
          System.out.println(" o percentual de mulheres na turma é:" +Medmulheres+ "%");
    }
    
}

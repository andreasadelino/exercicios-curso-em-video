/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio22;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia1,dia2, mes1, mes2;
        System.out.println(" QUAL O DIA E O MÊS DO SEU ANIVERSARIO:");
        dia1 = new Scanner(System.in).nextInt();
        mes1 = new Scanner(System.in).nextInt();
        dia2 = new Scanner(System.in).nextInt();
        mes2 = new Scanner(System.in).nextInt();
        if(dia1 == dia2 && mes1 == mes2){
            System.out.println("Os aniversários são no mesmo dia e mês!");
        }
        else{
            System.out.println("os aniversarios são em dias e mês diferentes!");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio09;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        System.out.println(" Digite a sua idade:");  
        idade = new Scanner(System.in).nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }
    }
    
}

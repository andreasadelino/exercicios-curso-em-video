/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico20;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercico20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1, nome2;
        int idade1, idade2 ;
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite seu nome e sua idade respectivamente:");
        nome1 = teclado.nextLine();
        idade1 = new Scanner(System.in).nextInt();
          nome2 = teclado.nextLine();
        idade2 = new Scanner(System.in).nextInt();
        if(idade1 < idade2){
            System.out.println("O mais velho é "+nome2+"  e sua idade é:  "+ idade2);
        }
        else{
            System.out.println("O mais velho é "+nome1+"  e sua idade é:  "+ idade1); 
        }
    }
    
}

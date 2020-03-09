/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media;
        System.out.println("Qual seu nome:");
        nome = teclado.nextLine();
        System.out.println("Qual a sua 1ª nota:");
        nota1 = new Scanner (System.in).nextDouble();
         System.out.println("Qual a sua 2ª nota:");
        nota2 = new Scanner (System.in).nextDouble();
         System.out.println("Qual a sua 3ª nota:");
        nota3 = new Scanner (System.in).nextDouble();
        
        media = (nota1 + nota2 + nota3)/3;
        if(media >=7){
            System.out.println(nome +" você foi aprovado com media" + media);
        }
        else if(media >=5){
            System.out.println(nome +" você ficou de recuperação"+ media);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        System.out.println(" Qual a sua idade:");
        idade = new Scanner (System.in).nextInt();
        if(idade <16){
        System.out.println(" você não pode votar!");
    }
    else if((idade >=16 && idade < 18)||(idade >70)) {
            System.out.println(" O seu vvoto é facultativo");
}
    else {
            System.out.println("Você é obrigado a votar!");
    } 
}
}

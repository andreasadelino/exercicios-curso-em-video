/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anoAtual, anoNascimento, qtdeAnos;
        System.out.println("Entre com o Ano Atual:");
        anoAtual = new Scanner(System.in).nextInt();
        System.out.println("Entre com o Ano de Nascimento:");
        anoNascimento = new Scanner(System.in).nextInt();
        qtdeAnos = anoAtual - anoNascimento;
        System.out.println("Em "+anoAtual+" você já faz(ou fez) "+qtdeAnos+" anos!");
        
        
    }

    
    }
    


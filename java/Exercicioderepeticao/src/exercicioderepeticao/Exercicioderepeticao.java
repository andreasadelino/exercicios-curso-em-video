/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioderepeticao;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicioderepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome;
        int senha;
        
        boolean infoValidas = false;
        
        do{
            System.out.println("Entre com o nome do usuario:");
            nome = ler.nextLine();
            System.out.println("Entre com a senha:");
            senha = ler.nextInt();
            
            if (nome.equals(senha)){
                System.out.println("Senha igual a usuario digite novamente");
                    
            }else{
                infoValidas =true;
                        
            }
            
        }while(!infoValidas);
    }
}


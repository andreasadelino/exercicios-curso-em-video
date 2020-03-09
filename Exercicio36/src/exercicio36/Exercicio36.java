/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio36;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;  //entrada pelo usuario
        int quantidade = 0;//exibe a quantidade de numeros impares
        
        for(int cont =1; cont<=2;cont++){
            System.out.println("Entre com o primeiro numero" +cont+ "valor: ");
            x= new Scanner(System.in).nextInt();
            if((x%2)!=0){
                quantidade++;
            }
        }
        System.out.println("Quantidade de numeros impares:" +quantidade);
    }
    
}

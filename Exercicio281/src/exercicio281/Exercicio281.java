/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio281;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio281 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int n1, n2,n3;
        System.out.println("Digite o 1° número:");
        n1 = ler.nextInt();
         System.out.println("Digite o 2° número:");
        n2 = ler.nextInt();
         System.out.println("Digite o 3° número:");
        n3 = ler.nextInt();
        
        if(n1<n2 && n2<n3){
            System.out.println(n1+"-"+n2+"-"+n3);
        }
    else if(n2<n1 && n1<n3){
           System.out.println(n2+"-"+n1+"-"+n3);
    }
        else if(n3<n1 && n2<n1){
           System.out.println(n3+"-"+n2+"-"+n1);
    
}
        else if(n3<n1 && n1<n2){
           System.out.println(n3+"-"+n1+"-"+n2);
    }
}
}
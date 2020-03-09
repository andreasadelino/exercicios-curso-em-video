/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio27;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int n1,n2,n3;
        System.out.println("Digite o 1° numero:");
        n1= new Scanner(System.in).nextInt();
         System.out.println("Digite o 2° numero:");
        n2= new Scanner(System.in).nextInt();
         System.out.println("Digite o 3° numero:");
        n3= new Scanner(System.in).nextInt();
   

        if(n1==n2 && n2==n3){
            System.out.println("Os Valores são iguais!");
}
        if(n1>n2 && n1>n3){
            System.out.println(" O maior valor é:" +n1);
        }
else if(n2>n1 && n2>n3){
            System.out.println(" O maior valor é:" +n2);
    }
else if(n3>n1 && n3>n2){
            System.out.println(" O maior valor é:" +n3);
   }
    }
    
}


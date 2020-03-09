/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1, numero2;
        System.out.println("Digite valores um seguido do outro:");
        numero1 = new Scanner(System.in).nextDouble();
         numero2 = new Scanner(System.in).nextDouble();
        
          if(numero1 < numero2 ){
              System.out.println(""+ numero1+ "-" +numero2);
          }
          else{
              System.out.println(""+ numero2+ "-"+ numero1);
          }
}

}
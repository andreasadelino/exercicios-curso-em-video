/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author andreas
 */
public class ProgramaIdade {
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Em que ano você nasceu?");
       int nasc = teclado.nextInt();
       int i = 2015-nasc;
       if (i>=18){
           System.out.println("Maior idade");
       } else {
           System.out.println("Menor Idade");
       }
}
      
}

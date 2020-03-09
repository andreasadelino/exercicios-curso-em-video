
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreas
 */
public class ProgramaPernas {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       System.out.print("Quantas pernas?");
       int perna = tec.nextInt();
       String tipo;
       System.out.print("Isso é um(a)");
       switch (perna) {
           case 1:
               tipo = "Saci";
               break;
           case 2:
               tipo = "Bipede";
               break;
           case 3: 
               tipo = "Tripe";
           break;
           case 4:
               tipo = "Quadrupede";
               break;
           case 6:
               tipo = "Aranha";
               break;
           default:
               tipo = "ET";
               break;
       }
       System.out.println(tipo);
    }
       
}

  
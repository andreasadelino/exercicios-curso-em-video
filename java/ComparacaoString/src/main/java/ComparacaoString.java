/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreas
 */
public class ComparacaoString {
       public static void main (String [] args) {
        String nome1 = "Evelyn";
        String nome2 = "Evelyn";
        String nome3 = new String("Evelyn");
        String res;
        res = (nome2==nome1)?"igual":"diferente";
        System.out.println(res);
    }
    
}

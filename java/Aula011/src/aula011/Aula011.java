/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author andreas
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Visitante v1 = new Visitante();
        //v1.setNome("JUNIA");
        //v1.setIdade(65);
        //v1.setSexo("F");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1212);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Clara");
         b1.setSexo("F");
        b1.setMatricula(1218);
         b1.pagarMensalidade();
         System.out.println(b1.toString());
    }
    
}

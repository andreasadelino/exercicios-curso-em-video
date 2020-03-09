/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author andreas
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Pessoa[]  p = new Pessoa[2];
       Livro [] l = new Livro [3]; 
        
       p [0] = new Pessoa("Pedro ",22, "M");
       p [1] = new Pessoa("Mare ",25, "F");
        
       l[0] = new Livro("AAAA", "JOAOA", 300, p[0]);
        l[1] = new Livro ("BBBB", "PAPA", 500, p[1]);
        l[2] = new Livro ("CCCC", "BEBE",800, p[2]);
        
        System.out.println(l[0].detalhes());
    }
    
}

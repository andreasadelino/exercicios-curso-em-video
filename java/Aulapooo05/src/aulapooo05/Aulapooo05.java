/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapooo05;

/**
 *
 * @author andreas
 */
public class Aulapooo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abriConta("CC");
        
        
         ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abriConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(700);
        
         p1.estadoAtual();
         p2.estadoAtual();
    }
    
}

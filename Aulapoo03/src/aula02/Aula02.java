/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author andreas
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta  c1 = new Caneta();
        c1.cor  =  " AZUL ";
        c1.modelo = "BIC CRISTAL";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
    
}

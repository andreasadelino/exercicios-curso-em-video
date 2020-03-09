/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetor04;

import java.util.Arrays;

/**
 *
 * @author andreas
 */
public class Vetor04 {
    public static void main(String[] args){
        int vet[ ]= {3, 7, 6, 1, 9, 4, 2,};
        int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontrei o valor na posição" + p);
    }
}

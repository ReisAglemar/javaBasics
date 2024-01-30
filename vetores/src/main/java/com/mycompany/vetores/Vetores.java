/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vetores;

import java.util.Arrays;

/**
 *
 * @author reis
 */
public class Vetores {

    public static void main(String[] args) {

        int meuVetor[] = {5, 8, 2, 12, 10};      

                
        for (int i : meuVetor) { // for each, para cada
             System.out.println(i);           
        }      
                    
        
        Arrays.sort(meuVetor); //ordena o meuVetor
        System.out.println("-----------------------------");        
        for (int i : meuVetor) {
            System.out.println(i);            
        }
        
        System.out.println("-----------------------------");  
       int posicao = Arrays.binarySearch(meuVetor, 5); // procura o 5 no meuVetor,retorna a posição
        System.out.println(posicao);
        
        System.out.println("-----------------------------");  
        Arrays.fill(meuVetor, 7); // preenche todas as posições do vetor com 7.
        for (int i : meuVetor) {
            System.out.println(i);
            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.numerosaleatorios;

/**
 *
 * @author reis
 */
public class NumerosAleatorios {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            double sorte = Math.random();
            int intervaloAlto = 60;
            int intervaloBaixo = 1;
            int valorDentroIntervalo = (int) (intervaloBaixo + sorte * (intervaloAlto - intervaloBaixo));

            //System.out.println("Posição " +i  + "sorteada foi: " + sorte);
            System.out.println("Posição " +i + " tratada passa a ser: " + valorDentroIntervalo);            
        }
    }
}

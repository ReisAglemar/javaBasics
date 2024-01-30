/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estruturarepeticaodo;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class EstruturaRepeticaoDo {

    public static void main(String[] args) {
        int contador = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);

        do {
            /*
            System.out.println("contador é: " + contador);
            contador +=1;
            //contador++;
            //contador = contador +1;
             */

            System.out.println("para sair digite N " + contador);
            contador +=1;
            //resposta = teclado.next();
            //resposta = resposta.toLowerCase();
            resposta = (teclado.next()).toLowerCase();
            System.out.println(resposta);
        } while (!resposta.equals("n"));

        System.out.println("você saiu!");
    }
}

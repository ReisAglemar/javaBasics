/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class Calculadora {

    public static void main(String[] args) {

        int valorInserido = 0;

        System.out.println("Insira um valor numérico inteiro para obter as informções "
                + "referentes a ele");
        Scanner teclado = new Scanner(System.in);
        valorInserido = teclado.nextInt();

        System.out.println("\nVocê inseriu o valor " + valorInserido + ", abaixo estão "
                + "algumas informações sobre ele \n");

        valorAbsoluto(valorInserido);
        raizQuadrada(valorInserido);
        raizCubica(valorInserido);
        restoDivisaoPor2(valorInserido);
        elevadoA2(valorInserido);

    }

    private static int valorAbsoluto(int valorInserido) {

        int valorAbsoluto = Math.abs(valorInserido);
        System.out.println("O valor absoluto é: " + valorAbsoluto);
        return 0;
    }

    private static double raizQuadrada(int valorInserido) {

        double raizQuadrada = Math.sqrt(valorInserido);
        System.out.printf("A raiz quadrada é: " + "%.3f \n", raizQuadrada);
        return 0;
    }

    private static double raizCubica(int valorInserido) {

        double raizCubica = Math.cbrt(valorInserido);
        System.out.printf("A raiz cúbica é: " + "%.3f \n", raizCubica);
        return 0;
    }

    private static int restoDivisaoPor2(int valorInserido) {

        int restoDivisaoPor2 = valorInserido % 2;

        String saida = restoDivisaoPor2 == 0
                ? "A divisão por 2  é inteira, ou seja, sem resto."
                : "O resto da divisão por 2 é:  " + restoDivisaoPor2;

        System.out.println(saida);
        return 0;
    }

    private static double elevadoA2(int valorInserido) {

        double elevadoA2 = Math.pow(valorInserido, 2);
        System.out.println("O quadrado é: " + elevadoA2);
        return 0;
    }

}

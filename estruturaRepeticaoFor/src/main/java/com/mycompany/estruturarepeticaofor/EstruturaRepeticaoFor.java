/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estruturarepeticaofor;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class EstruturaRepeticaoFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fim, passo, inicio;
        String frase;

        System.out.println("Insira o valor INICIAL para a contagem.");
        frase = entrada.next();
        inicio = Integer.parseInt(validador(frase)); //chama e retorna função validador

        System.out.println("Informe agora, o valor FINAL para a contagem");
        frase = entrada.next();
        fim = Integer.parseInt(validador(frase)); //chama e retorna função validador

        System.out.println("Por fim, vamos contar de quanto em quanto?");
        frase = entrada.next();

        while ((!frase.matches("[0-9]+")) || (Integer.parseInt(frase) == 0)) {
            System.out.println("Nessa etapa você deve inserir um numero positivo "
                    + " diferente de zero. Ex: 1");
            System.out.println("tente novamente...");
            frase = entrada.next();
        }
        passo = Integer.parseInt(frase);

        if (inicio < fim) { //contagem incrementada
            
            for (int contador = inicio; contador <= fim; contador += passo) {
                contador(contador); // chama a função contador
            }

        } else { //contagem decrementada
            
            for (int contador = inicio; contador >= fim; contador -= passo) {
                contador(contador); // chama a função contador
            }
        }
    }

    public static String validador(String frase) {
        // validade os dados inseridos, só é aceito números
        while (!frase.matches("-?\\d+(\\.\\d+)?")) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Nessa etapa você deve inserir um numero, letras "
                    + "não são aceitas.");
            System.out.println("tente novamente...");
            frase = entrada.next();
        }
        return frase;
    }

    public static void contador(int contador) {
        // saída de dados
        System.out.println((contador < 10 && contador >= 0)
                ? "| 0" + contador + " |"
                : "| " + contador + " |");
    }
}

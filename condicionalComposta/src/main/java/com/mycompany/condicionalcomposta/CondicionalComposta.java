/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.condicionalcomposta;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class CondicionalComposta {

    public static void main(String[] args) {
        //int idade = idade;
        Scanner entrada = new Scanner(System.in);
        //int idade = entrada.nextInt();
        //System.out.println(idade);

        for (int idade = 0; idade <= 100; idade++) {

            /*if (idade < 16) {
                System.out.println(idade + " voto PROIBIDO");
            }

            if (idade >= 16 && idade < 18 || idade > 70) {
                System.out.println(idade + " voto OPCIONAL");
            }

            if (idade >= 18 && idade <= 70) {
                System.out.println(idade + " voto MANDATÓRIO");
            }*/
            if (idade < 16) {
                System.out.println(idade + " Anos | Voto Proibido");
            } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println(idade + " Anos | Voto Opcional");
            } else {
                System.out.println(idade + " Anos | Voto Mandatório");
            }
        }
    }
}

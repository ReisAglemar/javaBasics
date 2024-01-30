/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estruturasrepeticao;

/**
 *
 * @author reis
 */
public class EstruturasRepeticao {

    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            // inicio sem qualquer desvio de fluxo
            /*
            System.out.println("contador " + contador);
            contador++;
        }*/
            // fim sem qualquer desvio de fluxo
            //------------------------------------------------------------//
            //início CONTINUE 
            /*
            if (contador == 3) {
                System.out.println("condição continue atingida");
                //comentando o sout perceberá que quando o contador 
                //for 3 nada será feito, na verdade o fluxo será desviado
                // ao início do teste lógico.
                contador++;
                continue;
            } else {
                System.out.println("repetição " + contador);
                contador++;
            }*/
            // fim CONTINUE
            //----------------------------------------------------------//
            //inicio condição BREAK

            if (contador < 7) {
                System.out.println("contador " + contador);
                contador++;
            } else {
                //quando o contador for 6 o prgrama será encerrado,
                //pois a condição break será atingida.
                break;
            }
            //fim condição BREAK
        }
    }
}

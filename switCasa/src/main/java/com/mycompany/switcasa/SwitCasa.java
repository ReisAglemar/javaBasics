/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switcasa;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class SwitCasa {

    public static void main(String[] args) {
        
        
        System.out.println("inisira um valor de um a três...");
        Scanner entrada = new Scanner(System.in);
        String valor = (entrada.next()).toLowerCase();
     // String tratada = valor.toLowerCase();
        
        switch (valor) {
            case "a":
                System.out.println(valor);
                break;
            
            case "b":
                System.out.println(valor);
                break;
                
            case "c":
                System.out.println(valor);            
                break;
            
            default:
                System.out.println("opção inválida");                
        }
    }
}

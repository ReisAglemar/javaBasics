/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operadorternario;

/**
 *
 * @author reis
 */
public class OperadorTernario {

    public static void main(String[] args) {
        boolean temCafe = true;
        String textoExibido;

        textoExibido = (temCafe == true)
                ? "Grande dia, temos café"
                : "Precisamos criar um grande dia, fazendo cafe";
        System.out.println(textoExibido);
    }
}

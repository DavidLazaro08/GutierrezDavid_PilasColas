package com.david.pilascolas;

import java.util.Scanner;

/** Ejercicio 1: invertir un texto con una Pila. */

public class Ejercicio1_InversionTexto {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = leer.nextLine();

        // Pila del mismo tamaño que el texto
        Pila pila = new Pila(texto.length());

        // Apilo letra a letra
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        // Voy sacando (POP) y formando el texto invertido
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido = invertido + pila.pop();
        }
        System.out.println("Texto invertido: " + invertido);

        System.out.println();
    }
}

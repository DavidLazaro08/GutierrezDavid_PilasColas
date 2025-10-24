package com.david.pilascolas;

import java.util.Scanner;

/** Ejercicio 3: Verificación de palíndromos usando Pila y Cola. */

public class Ejercicio3_Palindromo {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una palabra o frase: ");
        String texto = leer.nextLine();

        // Quitamos espacios y pasamos a minúsculas

        String limpio = texto.replaceAll(" ", "").toLowerCase();
        System.out.println("Texto procesado: " + limpio);

        // Pila y Cola del mismo tamaño

        Pila pila = new Pila(limpio.length());
        Cola cola = new Cola(limpio.length());

        // Metemos las letras una a una

        System.out.print("Guardando letras...");
        for (int i = 0; i < limpio.length(); i++) {
            char c = limpio.charAt(i);
            pila.push(c);
            cola.enqueue(c);
            System.out.print(" " + c);
        }
        System.out.println();

        // Comparamos
        boolean esPalindromo = true;
        System.out.println("Comparando letras:");
        while (!pila.isEmpty() && !cola.isEmpty()) {
            char desdePila = pila.pop();
            char desdeCola = cola.dequeue();
            System.out.println("  " + desdeCola + " - " + desdePila);
            if (desdePila != desdeCola) {
                esPalindromo = false;
                break;
            }
        }

        // Resultado final

        System.out.println();
        if (esPalindromo) {
            System.out.println("Resultado: ES un palíndromo.");
        } else {
            System.out.println("Resultado: NO es un palíndromo.");
        }

        System.out.println();
    }
}

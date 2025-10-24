package com.david.pilascolas;

import java.util.Scanner;

/** Ejercicio 4: Conversión de número decimal a binario usando una Pila. */

public class Ejercicio4_Binario {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = leer.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        // Si el número es 0, el binario es 0

        if (numero == 0) {
            System.out.println("Binario: 0");
            return;
        }

        // Creamos la pila

        Pila pila = new Pila(32);

        int n = numero;
        System.out.print("Divisiones y restos: ");
        while (n > 0) {
            int resto = n % 2;
            pila.push((char) (resto + '0'));
            System.out.print(resto + " ");
            n = n / 2;
        }
        System.out.println();

        // Formamos el número binario al desapilar

        System.out.print("Número binario de " + numero + ": ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }

        System.out.println("\n");
    }
}

package com.david.pilascolas;

/** Cola FIFO implementada con array.
 * FIFO = primero en entrar, primero en salir. */

public class Cola {

    private final char[] datos;
    private int frente;
    private int fin;
    private int total;

    // Constructor

    public Cola(int capacidad) {
        datos = new char[capacidad];
        frente = 0;
        fin = -1;
        total = 0;
    }

    // ENQUEUE - meter elemento al final

    public void enqueue(char c) {
        if (total == datos.length) {
            System.out.println("Cola llena.");
        } else {
            fin = (fin + 1) % datos.length; // avanza circular
            datos[fin] = c;
            total++;
        }
    }

    // DEQUEUE - sacar elemento del frente

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return '\0';
        } else {
            char valor = datos[frente];
            frente = (frente + 1) % datos.length;
            total--;
            return valor;
        }
    }

    // Mostramos contenido

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
        } else {
            System.out.print("Elementos en la cola: ");
            for (int i = 0; i < total; i++) {
                int index = (frente + i) % datos.length;
                System.out.print(datos[index] + " ");
            }
            System.out.println();
        }
    }

    // Vemos si está o no vacía
    public boolean isEmpty() {
        return total == 0;
    }

    // TODO: se podría generalizar para otros tipos (String, int...) más adelante.
}

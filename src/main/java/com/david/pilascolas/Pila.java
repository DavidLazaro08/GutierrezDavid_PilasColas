package com.david.pilascolas;

/** Pila LIFO implementada con array.
 * LIFO = el último en entrar es el primero en salir. */

public class Pila {

    private final char[] elementos;
    private int tope;

    // Constructor

    public Pila(int capacidad) {
        if (capacidad <= 0) {
            System.out.println("La capacidad no es válida, se pone a 1.");
            capacidad = 1;
        }
        elementos = new char[capacidad];
        tope = -1;
    }

    // PUSH para "apilar carácter"

    public void push(char c) {
        if (tope == elementos.length - 1) {
            System.out.println("Pila llena (overflow).");
        } else {
            elementos[++tope] = c;
        }
    }

    // POP para "desapilar carácter"

    public char pop() {
        if (isEmpty()) {
            System.out.println("Pila vacía (underflow).");
            return '\0';
        } else {
            return elementos[tope--];
        }
    }

    // Comprobamos si está vacía

    public boolean isEmpty() {
        return tope == -1;
    }

    // TODO: añadir peek() más adelante si hace falta
    // TODO: o devolver boolean en push/pop para controlar mejor los errores.

}

package com.david.pilascolas;

import java.util.Scanner;

/** Ejercicio 2: Simulación de una cola de clientes (FIFO). */

public class Ejercicio2_ColaClientes {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        String[] cola = new String[20];  // almacena nombres completos
        int frente = 0, fin = 0, total = 0;
        int opcion;

        do {
            System.out.println("\n--- COLA DE CLIENTES ---");
            System.out.println("1. Llegada cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    if (total == cola.length) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.print("Nombre del cliente: ");
                        String nombre = leer.nextLine();
                        cola[fin] = nombre;
                        fin = (fin + 1) % cola.length;
                        total++;
                        System.out.println("Cliente añadido: " + nombre);
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        String atendido = cola[frente];
                        frente = (frente + 1) % cola.length;
                        total--;
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;

                case 3:
                    if (total == 0) {
                        System.out.println("Cola vacía.");
                    } else {
                        System.out.print("Clientes en cola: ");
                        for (int i = 0; i < total; i++) {
                            int index = (frente + i) % cola.length;
                            System.out.print(cola[index] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 4);
    }
}

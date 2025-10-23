package com.david.pilascolas;

import java.util.Scanner;

/** Menú principal */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Inversión de texto con PILA");
            System.out.println("2. Simulación de COLA de clientes");
            System.out.println("3. Verificación de PALÍNDROMOS");
            System.out.println("4. Conversión DECIMAL a BINARIO");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    Ejercicio1_InversionTexto.ejecutar();
                    break;

                case 2:
                    Ejercicio2_ColaClientes.ejecutar();
                    break;

                case 3:
                    // Aquí llamaremos al ejercicio 3 cuando esté hecho
                    System.out.println("Ejercicio 3 aún no implementado.");
                    break;

                case 4:
                    // Aquí llamaremos al ejercicio 4 cuando esté hecho
                    System.out.println("Ejercicio 4 aún no implementado.");
                    break;

                case 5:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);
    }
}

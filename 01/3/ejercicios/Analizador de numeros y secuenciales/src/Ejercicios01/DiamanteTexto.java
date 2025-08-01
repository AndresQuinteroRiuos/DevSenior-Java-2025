package user.Ejercicios01;

import java.util.Scanner;
public class DiamanteTexto {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del diamante (entero positivo impar): ");
        int tamaño = scanner.nextInt();

        // Validación
        if (tamaño <= 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else if (tamaño % 2 == 0) {
            System.out.println("Error: El número debe ser impar.");
        } else {
            int mitad = tamaño / 2;

            // Parte superior del diamante
            for (int i = 0; i < mitad; i++) {
                int espacios = mitad - i;
                int estrellas = 2 * i + 1;
                System.out.print(" ".repeat(espacios));
                System.out.println("*".repeat(estrellas));
            }

            // Línea central alineada a la izquierda
            System.out.println("*".repeat(tamaño));

            // Parte inferior del diamante
            for (int i = mitad - 1; i >= 0; i--) {
                int espacios = mitad - i;
                int estrellas = 2 * i + 1;
                System.out.print(" ".repeat(espacios));
                System.out.println("*".repeat(estrellas));
            }
        }
    }
}




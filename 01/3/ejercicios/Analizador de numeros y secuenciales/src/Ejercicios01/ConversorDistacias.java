package user.Ejercicios01;

import java.util.Scanner;
public class ConversorDistacias {
 



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR DE DISTANCIA");
        System.out.println("1. Millas a kilómetros");
        System.out.println("2. Kilómetros a millas");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad de millas: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934;
            System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad de kilómetros: ");
            double kilometros = scanner.nextDouble();
            double millas = kilometros * 0.621371;
            System.out.println(kilometros + " kilómetros equivalen a " + millas + " millas.");
        } else {
            System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
        }
    }
}




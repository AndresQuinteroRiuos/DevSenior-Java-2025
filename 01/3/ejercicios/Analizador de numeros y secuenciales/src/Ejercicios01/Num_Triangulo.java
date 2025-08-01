package user.Ejercicios01;

import java.util.Scanner;
public class Num_Triangulo {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera longitud: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda longitud: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera longitud: ");
        double lado3 = scanner.nextDouble();

        // Desigualdad triangular: cada lado debe ser menor que la suma de los otros dos
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("¡Sí! Con estas longitudes se puede formar un triángulo.");
        } else {
            System.out.println("No se puede formar un triángulo con estas longitudes.");
        }

        scanner.close();
    }
}




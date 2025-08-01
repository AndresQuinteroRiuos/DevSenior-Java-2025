package user.Ejercicios01;

import java.util.Scanner;
public class Num_Divisible {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El número es divisible por 2 y por 7.");
        } else if (numero % 2 == 0) {
            System.out.println("El número es divisible solo por 2.");
        } else if (numero % 7 == 0) {
            System.out.println("El número es divisible solo por 7.");
        } else {
            System.out.println("El número no es divisible ni por 2 ni por 7.");
        }

        scanner.close();
    }
}



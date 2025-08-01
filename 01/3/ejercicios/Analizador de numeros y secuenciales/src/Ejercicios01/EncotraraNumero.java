package user.Ejercicios01;

import java.util.Scanner;
public class EncotraraNumero {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Has ingresado 0. El programa ha finalizado.");
            }

        } while (numero != 0);
    }
}




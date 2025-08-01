package user.Ejercicios01;

import java.util.Scanner;
public class ContarNegativos {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (negativo para continuar, positivo para detener): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                contador++;
            }

        } while (numero < 0);

        System.out.println("Cantidad de números negativos ingresados: " + contador);
    }
}




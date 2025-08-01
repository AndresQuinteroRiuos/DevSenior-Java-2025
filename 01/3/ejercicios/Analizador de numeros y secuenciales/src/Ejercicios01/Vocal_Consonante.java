package user.Ejercicios01;

import java.util.Scanner;

public class Vocal_Consonante {
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String entrada = scanner.nextLine().toLowerCase();

        if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
            char letra = entrada.charAt(0);

            // Verificamos si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra es una VOCAL.");
            } else {
                System.out.println("La letra es una CONSONANTE.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor ingrese UNA sola letra.");
        }

        scanner.close();
    }
}




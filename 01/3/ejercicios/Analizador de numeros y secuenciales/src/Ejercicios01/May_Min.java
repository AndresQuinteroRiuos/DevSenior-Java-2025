package user.Ejercicios01;

import java.util.Scanner;

public class May_Min {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese una letra: ");
        String entrada = scanner.nextLine();

        if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
            char letra = entrada.charAt(0);

            if (Character.isUpperCase(letra)) {
                System.out.println("La letra es MAYÚSCULA.");
            } else {
                System.out.println("La letra es minúscula.");
            }
        } else {
            System.out.println("Por favor, ingrese solo UNA letra válida.");
        }
        scanner.close();
    }
}



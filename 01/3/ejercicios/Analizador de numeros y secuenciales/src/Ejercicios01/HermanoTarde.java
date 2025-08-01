package user.Ejercicios01;

import java.util.Scanner;
public class HermanoTarde {




    public static int hermanoTarde(int h1, int h2) {
        // La suma total de los tres hermanos es 1 + 2 + 3 = 6
        // El hermano que falta es 6 - (h1 + h2)
        return 6 - (h1 + h2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del primer hermano que llegó a tiempo: ");
        int h1 = sc.nextInt();
        System.out.print("Ingrese el número del segundo hermano que llegó a tiempo: ");
        int h2 = sc.nextInt();

        int tarde = hermanoTarde(h1, h2);
        System.out.println("El hermano que llegará tarde es el número: " + tarde);
    }
}




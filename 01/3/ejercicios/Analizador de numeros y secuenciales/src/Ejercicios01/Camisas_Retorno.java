package user.Ejercicios01;

import java.util.Scanner;
public class Camisas_Retorno {

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de camisas: ");
        int cantidad = scanner.nextInt();
        int precioPorUnidad;

        if (cantidad >= 1 && cantidad <= 50) {
            precioPorUnidad = 50000;
        } else if (cantidad > 50 && cantidad <= 100) {
            precioPorUnidad = 45000;
        } else if (cantidad > 100 && cantidad <= 150) {
            precioPorUnidad = 40000;
        } else if (cantidad > 150 && cantidad <= 200) {
            precioPorUnidad = 35000;
        } else if (cantidad > 200) {
            precioPorUnidad = 25000;
        } else {
            System.out.println("Cantidad inválida.");
            return;
        }

        System.out.println("El precio por unidad es: $" + precioPorUnidad);
    }
}



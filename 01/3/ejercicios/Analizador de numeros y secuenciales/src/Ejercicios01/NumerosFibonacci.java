package user.Ejercicios01;

import java.util.Scanner;
public class NumerosFibonacci {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión que desea ver: ");
        int N = scanner.nextInt();

        int primero = 0;
        int segundo = 1;

        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i < N; i++) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
           
        }
         scanner.close();

         

    }
}




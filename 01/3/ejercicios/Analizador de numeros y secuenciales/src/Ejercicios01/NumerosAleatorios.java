package user.Ejercicios01;

import java.util.Random;

public class NumerosAleatorios {
   


    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[120];

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // Generar y procesar los números
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(201) - 100; // Rango: -100 a 100

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular medias
        double mediaPositivos = contadorPositivos > 0 ? (double) sumaPositivos / contadorPositivos : 0;
        double mediaNegativos = contadorNegativos > 0 ? (double) sumaNegativos / contadorNegativos : 0;

        // Mostrar resultados
        System.out.println("Suma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);
        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}




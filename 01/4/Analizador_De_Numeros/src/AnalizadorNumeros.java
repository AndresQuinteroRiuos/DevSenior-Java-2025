import java.util.Scanner;

public class AnalizadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar menú principal
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1 - Analizar un solo número");
            System.out.println("2 - Generar secuencia de números");
            System.out.println("0 - Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            
            // Manejo de opciones con switch
            switch (opcion) {
                case 1:
                    analizarNumero(scanner);
                    break;
                case 2:
                    generarSecuencia(scanner);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
      // Método para analizar un solo número
    public static void analizarNumero(Scanner scanner) {
        System.out.println("\n=== ANÁLISIS DE NÚMERO ===");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Análisis del número
        System.out.println("\n--- RESULTADOS DEL ANÁLISIS ---");
        
        // 1. Positivo, Negativo o Cero
        String signo;
        if (numero > 0) {
            signo = "Positivo";
        } else if (numero < 0) {
            signo = "Negativo";
        } else {
            signo = "Cero";
        }
        System.out.println("Signo: " + signo);
        
        // 2. Par o Impar (usando operador ternario)
        String paridad = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("Paridad: " + paridad);
        
        // 3. Comparación con 100
        String comparacion;
        if (numero > 100) {
            comparacion = "Mayor que 100";
        } else if (numero < 100) {
            comparacion = "Menor que 100";
        } else {
            comparacion = "Igual a 100";
        }
        System.out.println("Comparación con 100: " + comparacion);
        
        // Información adicional
        System.out.println("Valor absoluto: " + Math.abs(numero));
        System.out.println("Cuadrado: " + (numero * numero));
        System.out.println("Raíz cuadrada: " + Math.sqrt(Math.abs(numero)));
        
        System.out.println("------------------------");
        
    }
    
    // Método para generar secuencia de números
    public static void generarSecuencia(Scanner scanner) {
        System.out.println("\n=== GENERAR SECUENCIA DE NÚMEROS ===");
        System.out.print("Ingrese el número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el número final: ");
        int fin = scanner.nextInt();
        System.out.print("Ingrese el incremento: ");
        int incremento = scanner.nextInt();
        
        System.out.println("\n--- SECUENCIA GENERADA ---");
        for (int i = inicio; i <= fin; i += incremento) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------");
    }
}

    


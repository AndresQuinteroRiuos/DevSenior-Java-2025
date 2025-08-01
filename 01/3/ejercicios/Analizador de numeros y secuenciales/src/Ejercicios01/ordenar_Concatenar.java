package user.Ejercicios01;
 

public class ordenar_Concatenar {
    public static String ordenarYConcatenar(int a, int b, int c) {
        int[] numeros = {a, b, c};
        
        // Ordenar el arreglo
        java.util.Arrays.sort(numeros);
        
        // Concatenar como texto
        String resultado = "" + numeros[0] + numeros[1] + numeros[2];
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de entrada
        int x = 3, y = 100, z = 1;
        String salida = ordenarYConcatenar(x, y, z);
        System.out.println("Resultado concatenado: " + salida);
    }
}





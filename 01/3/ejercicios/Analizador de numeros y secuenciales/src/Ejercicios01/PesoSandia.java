package user.Ejercicios01;

public class PesoSandia {
  

    public static String dividirSandia(int peso) {
        // El peso debe ser mayor que 2 y además par
        if (peso > 2 && peso % 2 == 0) {
            return "SI";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        int pesoSandia = 5; // Puedes cambiar este valor para probar diferentes casos
        System.out.println(dividirSandia(pesoSandia));
    }
}




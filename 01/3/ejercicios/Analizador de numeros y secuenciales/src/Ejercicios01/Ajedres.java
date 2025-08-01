package user.Ejercicios01;

public class Ajedres {

    
    public static void main(String[] args) {
        final int FILAS = 8;
        final int COLUMNAS = 8;

        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if ((fila + columna) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("N ");
                }
            }
            System.out.println();
        }
    }
}




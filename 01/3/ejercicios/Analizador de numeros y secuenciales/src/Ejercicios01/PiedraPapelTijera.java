package user.Ejercicios01;

import java.util.Scanner;
public class PiedraPapelTijera {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Jugador 1 (P para Piedra, L para Papel, T para Tijera): ");
            String jugador1 = scanner.nextLine().toUpperCase();
            System.out.print("Jugador 2 (P para Piedra, L para Papel, T para Tijera): ");
            String jugador2 = scanner.nextLine().toUpperCase();

            if (!esJugadaValida(jugador1) || !esJugadaValida(jugador2)) {
                System.out.println("¡Jugada inválida! Usa solo P, L o T.");
            } else {
                determinarGanador(jugador1, jugador2);
            }

            System.out.print("¿Desea volver a jugar? (S para sí / N para no): ");
            continuar = scanner.nextLine().toUpperCase();
        } while (continuar.equals("S"));
    }

    public static boolean esJugadaValida(String jugada) {
        return jugada.equals("P") || jugada.equals("L") || jugada.equals("T");
    }

    public static void determinarGanador(String j1, String j2) {
        if (j1.equals(j2)) {
            System.out.println("¡Empate!");
        } else if ((j1.equals("P") && j2.equals("T")) ||
                   (j1.equals("T") && j2.equals("L")) ||
                   (j1.equals("L") && j2.equals("P"))) {
            System.out.println("Jugador 1 gana esta ronda.");
        } else {
            System.out.println("Jugador 2 gana esta ronda.");
        }
    }
}




package user.Ejercicios01;

public class Dias_Mes {

    public static String obtenerDiasDelMes(int mes) {
        String dias;

        // Validar el mes
        if (mes < 1 || mes > 12) {
            dias = "Mes inválido. Debe estar entre 1 y 12.";
        } else if (mes == 2) {
            dias = "28";
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = "30";
        } else {
            dias = "31";
        }

        return dias;
    }

    public static void main(String[] args) {
        int mes = 6; // Puedes cambiar este número para probar otros meses
        String resultado = obtenerDiasDelMes(mes);
        System.out.println("El mes " + mes + " tiene " + resultado + " días.");
    }
}



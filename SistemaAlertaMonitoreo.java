import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAlertaMonitoreo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simular niveles de radiación, temperatura y presión
        double radiacion = simularValor("Radiación");
        double temperatura = simularValor("Temperatura");
        double presion = simularValor("Presión");

        // Monitorear y alertar sobre valores extremos
        monitorearYAlertar(radiacion, temperatura, presion);

        // Identificar y listar los N primeros eventos raros o críticos (números primos)
        int n = obtenerNumeroEventos("Identificar los primeros N eventos raros o críticos (números primos): ");
        listarPrimerosNPrimos(n);
    }

    private static double simularValor(String factor) {
        System.out.print("Ingrese el nivel de " + factor + ": ");
        return new Scanner(System.in).nextDouble();
    }

    private static void monitorearYAlertar(double radiacion, double temperatura, double presion) {
        // Simulación de lógica de monitoreo y alerta
        if (radiacion > 90 || temperatura > 40 || presion < 900) {
            System.out.println("¡Alerta! Se han detectado valores extremos. Sugerimos realizar ajustes.");
        } else {
            System.out.println("Niveles normales. No se requieren ajustes.");
        }
    }

    private static int obtenerNumeroEventos(String mensaje) {
        System.out.print(mensaje);
        return new Scanner(System.in).nextInt();
    }

    private static void listarPrimerosNPrimos(int n) {
        List<Integer> eventosPrimos = new ArrayList<>();
        int num = 2; // Comenzar desde el primer número primo

        while (eventosPrimos.size() < n) {
            if (esPrimo(num)) {
                eventosPrimos.add(num);
            }
            num++;
        }

        System.out.println("Primeros " + n + " eventos raros o críticos (números primos): " + eventosPrimos);
    }

    private static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

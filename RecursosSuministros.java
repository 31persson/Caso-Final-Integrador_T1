import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursosSuministros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> consumoRecursos = new ArrayList<>();

        // Obtener datos de consumo de recursos (múltiplos de 5)
        System.out.println("Ingrese el consumo de recursos (múltiplos de 5, -1 para finalizar):");
        int consumo = scanner.nextInt();

        while (consumo != -1) {
            consumoRecursos.add(consumo);
            System.out.println("Ingrese el siguiente consumo (-1 para finalizar):");
            consumo = scanner.nextInt();
        }

        // Calcular estadísticas
        int suma = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int valor : consumoRecursos) {
            suma += valor;
            minimo = Math.min(minimo, valor);
            maximo = Math.max(maximo, valor);
        }

        // Mostrar estadísticas
        System.out.println("Media de recursos consumidos: " + (suma / consumoRecursos.size()));
        System.out.println("Mínimo de recursos consumidos: " + minimo);
        System.out.println("Máximo de recursos consumidos: " + maximo);
    }
}

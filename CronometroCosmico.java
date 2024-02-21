import java.util.Scanner;

public class CronometroCosmico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tiempo en segundos en la Tierra
        System.out.print("Ingrese el tiempo en segundos en la Tierra: ");
        int tiempoEnSegundos = scanner.nextInt();

        // Realizar las conversiones y mostrar resultados
        int tiempoEnMinutos = tiempoEnSegundos / 60;
        int tiempoEnHoras = tiempoEnMinutos / 60;
        int tiempoEnDias = tiempoEnHoras / 24;
        int tiempoEnAniosTierra = tiempoEnDias / 365;  // Considerando año no bisiesto

        // Mostrar resultados
        System.out.println("Tiempo en minutos: " + tiempoEnMinutos);
        System.out.println("Tiempo en horas: " + tiempoEnHoras);
        System.out.println("Tiempo en días: " + tiempoEnDias);
        System.out.println("Tiempo en años en la Tierra: " + tiempoEnAniosTierra);

        // Mostrar los mayores valores representables para diferentes tipos de datos
        System.out.println("\nMayores valores representables en este entorno único:");

        System.out.println("Mayor valor para byte: " + Byte.MAX_VALUE);
        System.out.println("Mayor valor para short: " + Short.MAX_VALUE);
        System.out.println("Mayor valor para int: " + Integer.MAX_VALUE);
        System.out.println("Mayor valor para long: " + Long.MAX_VALUE);
    }
}

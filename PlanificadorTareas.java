import java.util.Scanner;

public class PlanificadorTareas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de miembros de la tripulación y tareas diarias
        System.out.print("Ingrese el número de miembros de la tripulación: ");
        int numMiembros = scanner.nextInt();

        System.out.print("Ingrese el número de tareas diarias: ");
        int numTareasDiarias = scanner.nextInt();

        // Crear una matriz para almacenar las tareas diarias asignadas a cada miembro
        int[][] matrizTareas = new int[numMiembros][numTareasDiarias];

        // Asignar tareas diarias
        asignarTareas(matrizTareas, numMiembros, numTareasDiarias);

        // Visualizar tablas de tareas
        visualizarTablasTareas(matrizTareas, numMiembros, numTareasDiarias);

        // Calcular la carga de trabajo óptima para cada miembro (producto escalar)
        calcularCargaTrabajo(matrizTareas, numMiembros, numTareasDiarias);
    }

    private static void asignarTareas(int[][] matrizTareas, int numMiembros, int numTareasDiarias) {
        // Simular la asignación de tareas, puedes implementar tu lógica aquí
        for (int i = 0; i < numMiembros; i++) {
            for (int j = 0; j < numTareasDiarias; j++) {
                matrizTareas[i][j] = (i + 1) * (j + 1); // Simulación de tablas de multiplicar
            }
        }
    }

    private static void visualizarTablasTareas(int[][] matrizTareas, int numMiembros, int numTareasDiarias) {
        // Mostrar las tablas de tareas asignadas a cada miembro
        System.out.println("\nVisualización de tablas de tareas:");
        for (int i = 0; i < numMiembros; i++) {
            System.out.print("Miembro " + (i + 1) + ": ");
            for (int j = 0; j < numTareasDiarias; j++) {
                System.out.print(matrizTareas[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void calcularCargaTrabajo(int[][] matrizTareas, int numMiembros, int numTareasDiarias) {
        // Calcular la carga de trabajo óptima para cada miembro (producto escalar)
        System.out.println("\nCálculo de carga de trabajo óptima:");
        for (int i = 0; i < numMiembros; i++) {
            int cargaTrabajoOptima = 0;
            for (int j = 0; j < numTareasDiarias; j++) {
                cargaTrabajoOptima += matrizTareas[i][j];
            }
            System.out.println("Miembro " + (i + 1) + ": " + cargaTrabajoOptima);
        }
    }
}

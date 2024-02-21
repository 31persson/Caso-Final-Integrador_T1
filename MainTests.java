import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTests {

    @Test
    public void testCronometroCosmico() {
        // Ejercicio 1: Cronómetro Cósmico
        // Implementa pruebas para el Cronómetro Cósmico

        // Ejemplo:
        assertEquals("1 hora en la Tierra es 1 hora en el nuevo planeta",
                convertirTiempoPlaneta(1, "horas", 24), 1e-5);
    }

    @Test
    public void testRecursosYSuministros() {
        // Ejercicio 2: Recursos y Suministros
        // Implementa pruebas para Recursos y Suministros

        // Ejemplo:
        assertEquals(20, calcularConsumoRecursos(5, "días"));
    }

    @Test
    public void testSistemaAlertaMonitoreo() {
        // Ejercicio 3: Sistema de Alerta y Monitoreo
        // Implementa pruebas para Sistema de Alerta y Monitoreo

        // Ejemplo:
        assertTrue(monitorearFactorCritico("radiación", 150));
    }

    @Test
    public void testPlanificadorTareas() {
        // Ejercicio 4: Planificador de Tareas
        // Implementa pruebas para Planificador de Tareas

        // Ejemplo:
        assertEquals(30, calcularCargaTrabajoOptima(3, 10));
    }

    @Test
    public void testNavegadorEstelar() {
        // Ejercicio 5: Navegador Estelar
        // Implementa pruebas para Navegador Estelar

        // Ejemplo:
        assertEquals(25, calcularRutaOptima(5, 5));
    }

    @Test
    public void testComunicadorInterplanetario() {
        // Ejercicio 6: Comunicador Interplanetario
        // Implementa pruebas para Comunicador Interplanetario

        // Ejemplo:
        assertEquals(3, contarVocales("Hello"));
    }

    // Métodos de ejemplo para los ejercicios, deberás implementar los reales
    private double convertirTiempoPlaneta(double tiempo, String unidad, double factor) {
        // Implementa la lógica real del ejercicio 1
        return tiempo * factor;
    }

    private int calcularConsumoRecursos(int periodo, String unidad) {
        // Implementa la lógica real del ejercicio 2
        return periodo * 4; // Ejemplo ficticio
    }

    private boolean monitorearFactorCritico(String factor, int valor) {
        // Implementa la lógica real del ejercicio 3
        return valor > 100; // Ejemplo ficticio
    }

    private int calcularCargaTrabajoOptima(int miembros, int tareasDiarias) {
        // Implementa la lógica real del ejercicio 4
        return miembros * tareasDiarias; // Ejemplo ficticio
    }

    private int calcularRutaOptima(int filas, int columnas) {
        // Implementa la lógica real del ejercicio 5
        return filas * columnas; // Ejemplo ficticio
    }

    private int contarVocales(String mensaje) {
        // Implementa la lógica real del ejercicio 6
        return (int) mensaje.chars().filter(c -> "aeiouAEIOU".indexOf(c) >= 0).count();
    }
}

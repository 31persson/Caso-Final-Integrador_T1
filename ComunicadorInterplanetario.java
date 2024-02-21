import java.util.Scanner;

public class ComunicadorInterplanetario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener un mensaje desde la Tierra
        System.out.print("Ingrese el mensaje desde la Tierra: ");
        String mensajeDesdeLaTierra = scanner.nextLine();

        // Contar vocales en el mensaje
        contarVocales(mensajeDesdeLaTierra);

        // Invertir el mensaje
        String mensajeInvertido = invertirMensaje(mensajeDesdeLaTierra);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        // Verificar si el mensaje es un palíndromo
        verificarPalindromo(mensajeDesdeLaTierra);
    }

    private static void contarVocales(String mensaje) {
        int contadorVocales = 0;
        for (char caracter : mensaje.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(caracter) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("Número de vocales en el mensaje: " + contadorVocales);
    }

    private static String invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder(mensaje);
        return mensajeInvertido.reverse().toString();
    }

    private static void verificarPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "").toLowerCase();
        String mensajeInvertido = invertirMensaje(mensajeSinEspacios);

        if (mensajeSinEspacios.equals(mensajeInvertido)) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }
    }
}

package Programming.Java.cadena_caracteres;
import java.text.Normalizer;
import java.util.Scanner;

public class M3_UF1_A05_12 {
    public static void main(String[] args) {
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una cadena de texto
        System.out.print("Introdueix una cadena de text: ");
        String text = scanner.nextLine();

        // Llamar a la función que verifica si es palíndromo
        boolean esPalindrome = esPalindrom(text);

        // Mostrar el resultado
        if (esPalindrome) {
            System.out.println("La cadena és un palíndrom.");
        } else {
            System.out.println("La cadena no és un palíndrom.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función que verifica si una cadena es un palíndromo
    public static boolean esPalindrom(String text) {
        // Normalizar el texto: quitar acentos, convertir a minúsculas y eliminar espacios
        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .toLowerCase()
                .replaceAll("\\s+", ""); // Elimina los espacios

        // Invertir el texto normalizado
        String reversedText = new StringBuilder(normalizedText).reverse().toString();

        // Comprobar si el texto normalizado es igual al texto invertido
        return normalizedText.equals(reversedText);
    }
}

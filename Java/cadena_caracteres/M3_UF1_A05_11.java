package Programming.Java.cadena_caracteres;

import java.util.Scanner;

public class M3_UF1_A05_11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca el texto
        System.out.print("Introdueix el text: ");
        String text = sc.nextLine();

        // Reemplazar todas las ocurrencias de 'y' o 'Y' por 'i'
        String textModificat = text.replace('y', 'i').replace('Y', 'I');

        // Mostrar el texto modificado
        System.out.println("Text modificat: " + textModificat);

        // Cerrar el scanner
        sc.close();
    }
}

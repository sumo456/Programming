package Programming.Java.cadena_caracteres;

import java.util.Scanner;

public class M3_UF1_A05_10 {
    public static void main(String[] args) {
        // Cadena de letras para el DNI
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca el número del DNI
        System.out.print("Introduce el número de DNI (sin letra): ");
        int numeroDNI = sc.nextInt();
        
        // Calcular el índice de la letra usando el módulo 23
        int indiceLetra = numeroDNI % 23;
        
        // Obtener la letra correspondiente
        char letraDNI = letrasDNI.charAt(indiceLetra);
        
        // Mostrar el DNI completo con la letra
        System.out.println("La lletra del DNI és: " + letraDNI);
        
        // Cerrar el scanner
        sc.close();
}
}

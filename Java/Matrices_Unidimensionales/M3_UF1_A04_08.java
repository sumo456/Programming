package Programming.Java.Programación_Estructurada;

import java.util.Scanner;

public class M3_UF1_A04_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5]; // Crear una matriz per guardar els 5 números
        int countPositius = 0, countNegatius = 0, countZeros = 0;
        double sumaPositius = 0, sumaNegatius = 0;

        // Llegir 5 números i guardar-los a la matriz
        System.out.println("Introdueix 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt(); // Emmagatzemar cada número a la matriz
        }

        // Processar els números a la matriz
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > 0) {
                sumaPositius += numeros[i];
                countPositius++;
            } else if (numeros[i] < 0) {
                sumaNegatius += numeros[i];
                countNegatius++;
            } else {
                countZeros++;
            }
        }

        // Calcular la mitjana dels números positius i negatius
        double mitjanaPositius = (countPositius > 0) ? sumaPositius / countPositius : 0;
        double mitjanaNegatius = (countNegatius > 0) ? sumaNegatius / countNegatius : 0;

        // Mostrar els resultats
        System.out.println("Mitjana dels números positius: " + mitjanaPositius);
        System.out.println("Mitjana dels números negatius: " + mitjanaNegatius);
        System.out.println("Nombre de zeros: " + countZeros);
    }
}


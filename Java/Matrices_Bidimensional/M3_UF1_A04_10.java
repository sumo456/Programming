package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Numero de columnas: ");
        int columnas = sc.nextInt();
        int matriz[][] = new int [filas][columnas];


        
        for(int i = 0; i<matriz.length; i++){
            if(i == 0){
                System.out.println("La matriz es nula");
                break;
            }
            for(int j = 0; j<matriz.length; j++){
                if(j == 0){
                    System.out.println("La matriz es nula");
                    break;
                }
            }
        }



        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nombre de files (N): ");
        int files = sc.nextInt();
        System.out.print("Introdueix el nombre de columnes (M): ");
        int columnes = sc.nextInt();

        int[][] matriu = new int[files][columnes];
        
        System.out.println("Introdueix els elements de la matriu:");
        int i = 0;
        while (i < files) {
            int j = 0;
            while (j < columnes) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matriu[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        // Comprovació si la matriu és nul·la
        boolean esNul·la = true;
        i = 0;
        while (i < files && esNul·la) {
            int j = 0;
            while (j < columnes) {
                if (matriu[i][j] != 0) {
                    esNul·la = false;
                    break;
                }
                j++;
            }
            i++;
        }

        if (esNul·la) {
            System.out.println("La matriu és nul·la.");
        } else {
            System.out.println("La matriu no és nul·la.");
        }
    }
}

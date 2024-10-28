package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriu [][] = {{1, 2, 3}, {4, 5, 6}};
        for (int posF = 0; posF < matriu.length; posF++){
            System.out.println("\nEls valors que hi ha a la fila " + posF + " són: \n\n");
            for (int posC = 0; posC < matriu[posF].length; posC++){
                System.out.println("\nEl valor que hi ha a la columna " + posC + " es " + matriu[posF][posC]);
            }
        }
    }
}

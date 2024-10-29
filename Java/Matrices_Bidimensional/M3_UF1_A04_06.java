package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marc [][] = new int [20][30];

        for (int i = 0; i < marc.length; i++) {
            for (int j = 0; j < marc[i].length; j++) {
                // Comprobar si es borde
                if (i == 0 || i == marc.length - 1 || j == 0 || j == marc[i].length - 1) {
                    marc[i][j] = 1; // borde
                } else {
                    marc[i][j] = 0; // interior
                }
                System.out.print(marc[i][j] + "\t");
            }
            System.out.println();

    }
}
}

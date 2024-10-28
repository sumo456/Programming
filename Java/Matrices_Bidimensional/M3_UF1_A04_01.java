package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

float [] [] notes = new float [6][3];

    for (int posF = 0; posF < notes.length; posF++) {
        System.out.print("\nEls valors que hi ha a la fila " + posF + " són: \n\n");
        for (int posC = 0; posC < notes[posF].length; posC++) {
            System.out.print("\n\tEl valor que hi ha a la columna " + posC + " és: " + notes[posF][posC]);
        }
    }

    }
}

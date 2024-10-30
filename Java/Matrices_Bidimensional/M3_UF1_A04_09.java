package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz [][] = new int [4][4];

        boolean Simetrica = true;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if (matriz[i][j] != matriz[j][i]){
                    Simetrica = false;
                    break;
                }
            }
        }
        if(Simetrica){
            System.out.println("Es simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }
}

package Programming.Java.Matrices_Bidimensional;

import java.util.Scanner;

public class M3_UF1_A04_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz1 [][] = new int [3][3];
        int matriz2 [][] = new int [3][3];
        int sumamatrizes [][] = new int [3][3];

        //Añadir valores  a matriz1
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1.length; j++){
                System.out.print("Entra un valor: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        //Añadir valores  a matriz2
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                System.out.print("Entra un valor: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        //Sumar matrices
        for (int i = 0; i < sumamatrizes.length; i++){
            for (int j = 0; j < sumamatrizes.length; j++){
                sumamatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.println(sumamatrizes[i][j] + "\t");
            }
        }


    }
}

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
    }
}

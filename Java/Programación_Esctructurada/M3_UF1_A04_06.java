package Programming.Java.Programación_Esctructurada;

import java.util.Scanner;

public class M3_UF1_A04_06 {
    public static void main(String[] args) {
        int matriz [] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < matriz.length; i++){
            System.out.println("Entra un numero: ");
            matriz[1] = sc.nextInt();
        }
        System.out.println("Els valor introduits són: ");

        for (int i = 0; i <matriz.length; i++){
            System.out.println(matriz[i] + " ");
        }
    }
}


// Llegir 5 números per teclat i mostrar-los en el mateix ordre introduït.

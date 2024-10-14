package Programming.Java.Bucles;

import java.util.Scanner;

public class M3_UF1_A03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
do {
        System.out.print("Introduce un numero entero (0 para teminar): ");
        num = sc.nextInt();

        if (num != 0) {
            System.out.println("El doble de " + num + " és: " + (num * 2));
        }
    } while (num != 0);

    sc.close();
    System.out.println("Programa finalizado");
} 
}

package Programming.Java.Bucles;

import java.util.Scanner;

public class M3_UF1_A03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("El numero ha de ser positivo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
            factorial *= i;
            }
            System.out.println("El factorial de " + num + " és: " + factorial);
        }
        sc.close();
    }
}

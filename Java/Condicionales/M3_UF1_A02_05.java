import java.util.Scanner;

public class M3_UF1_A02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par. El resultado elevado al cuadrado es: " + (num * num));
        } else {
            System.out.println("El número es impar. El resultado elevado al cuadrado es: " + (num *num * num));
        }
    }
}

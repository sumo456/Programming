import java.util.Scanner;

public class M3_UF1_A02_012 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El numero introducido es positivo");
        }
    }
}

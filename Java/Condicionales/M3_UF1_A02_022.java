import java.util.Scanner;

public class M3_UF1_A02_022 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = scanner.nextInt();
    

        if (numero < 35) {
            System.out.println("El numero introducido es menor a 35");
        } else {
            if (numero >= 35) {
            System.out.println("El numero introducido es mayor o igual a 35");
        }
        }
    }
}


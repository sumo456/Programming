import java.util.Scanner;

public class M3_UF1_A02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        if (num >0 && num < 100) {
            System.out.println("El numero introducido es menor a 100 y positivo");
        }
    }
}

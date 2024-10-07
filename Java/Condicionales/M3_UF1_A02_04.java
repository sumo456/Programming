import java.util.Scanner;

public class M3_UF1_A02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num >= -3 && num <= 27){
            System.out.println("El numeri introducido es entre -3 y 27");
        }
    }

}

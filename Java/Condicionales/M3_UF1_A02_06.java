import java.util.Scanner;

public class M3_UF1_A02_06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce 3 números:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    if (num1 > num2 && num1 > num3) {
        System.out.println("El numero " + num1 + " es el mayor");
    } else if (num2 > num1 && num2 > num3) {
        System.out.println("El numero " + num2 + " es el mayor");
    } else {
        System.out.println("El numero " + num3 + " es el mayor");
    }
    }
}

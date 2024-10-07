import java.util.Scanner;

public class M3_UF1_A02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer lado del triangulo: ");
        double site1 = sc.nextDouble();
        System.out.print("Introduce el segundo lado del triangulo: ");
        double site2 = sc.nextDouble();
        System.out.print("Introduce el tercer lado del triangulo: ");
        double site3 = sc.nextDouble();
        
        if ((site1 + site2 > site3) && (site1 + site3 > site2) && (site2 + site3 > site1)) {
            if (site1 == site2 && site2 == site3) {
                System.out.println("El tirangulo es equilatero.");
            } else if (site1 == site2 || site1 == site3 || site2 == site3) {
                System.out.println("El tirangulo es isosceles.");
        } else {
                System.out.println("El tirangulo es escalar.");
            }
        }
    }
}

import java.util.Scanner;

public class M3_UF1_A02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir al usuario el número del mes
        System.out.println("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();
        
        // Usamos una estructura switch para determinar la estación del año según el mes
        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Verano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes no válido");
        }
    }
}

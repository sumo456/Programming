import java.util.Scanner;

public class M3_UF1_A02_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pdeir al usuario que elija una figura
        System.out.println("Elige una figura: 1) Cuadrado 2) Círculo 3) Triángulo equilátero");
        int opcion = sc.nextInt();

        ///Según la opción, calcula el área de la figura
        if (opcion == 1) {
            System.out.println("Introduce el lado del cuadrado: ");
            double lado = sc.nextDouble();
            System.out.println("Área del cuadrado: " + lado * lado);
        }
        else if (opcion == 2) {
            System.out.println("Introduce el radio del círculo: ");
            double radio = sc.nextDouble();
            System.out.println("Área del círculo: " + Math.PI * radio * radio);
        }
        else if (opcion == 3) {
            System.out.println("Introduce los lados del triángulo equilátero: ");
            double lado = sc.nextDouble();
            System.out.println("Área del triángulo: " + Math.sqrt(3) / 4 * lado * lado);
        }
        else {
            System.out.println("Opción no válida");
        }
    }
}

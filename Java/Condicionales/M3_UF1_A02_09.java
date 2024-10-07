import java.util.Scanner;

public class M3_UF1_A02_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display the menu
        System.out.println("Seleciona una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Escribe su elección (1-4): ");
        int eleccion = scanner.nextInt();

        double result;

        // Perform the operation based on the user's choice
        switch (eleccion) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                } else {
                    System.out.println("Error: La división por cero no está permitida.\n" + //
                                                ".");
                }
                break;
            default:
                System.out.println("Elección no válida. Por favor, selecciona un número entre 1 y 4.");
                break;
        }

        scanner.close();
    }
}
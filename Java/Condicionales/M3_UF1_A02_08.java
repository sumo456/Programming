import java.util.Scanner;

public class M3_UF1_A02_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un carácter: ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Please enter only one character.");
        } else {
            char character = input.charAt(0);

            if (Character.isDigit(character)) {
                System.out.println("The character is a number.");
            } else if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    System.out.println("The character is an uppercase letter.");
                } else {
                    System.out.println("The character is a lowercase letter.");
                }
            } else {
                System.out.println("The character is another type of character.");
            }
        }
    }
}

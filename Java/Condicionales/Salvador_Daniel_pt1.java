import java.util.Scanner;

public class Salvador_Daniel_pt1 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Introduce la entrada adquirida (VIP - Normal): ");
        String entrada = sc.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();
        
        if (entrada == "VIP" ) {
        if(edad >= 18) {
            System.out.println("Permitido entrar.");
        } else if (edad == 17 || edad == 16) {
            System.out.println("Permitido entrar acompañado de un adulto");
        }
        } else {
            System.out.print("No tienes permitida la entrada!");
        }
        
        
        
        
    }
    
}
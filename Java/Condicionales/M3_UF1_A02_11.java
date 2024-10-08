import java.util.Scanner;

public class M3_UF1_A02_11 {
    public static void main(String[] args) {

        //Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        //Pedir valores para las variables
        System.out.print("Introduce el valor de a: ");
        int a = input.nextInt(); //Leemos el valor de a desde consola

        System.out.print("Introduce el valor de b: ");
        int b = input.nextInt();

        System.out.print("Introduce el valor de c: ");
        int c = input.nextInt();

        //Determina el valor menor
        //Inicializamos la variable 'menor' con el valor de 'a'
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        //Determina el valor mayor
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        //Mostrar el resultado
        System.out.println("El valor menor es: " + menor);
        System.out.println("El valor mayor es: " + mayor);

        //Cerrar el objeto Scanner
        input.close();
    }
}
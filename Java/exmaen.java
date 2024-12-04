import java.util.Scanner;

public class exmaen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("De que Pókemon quieres la probabilidad de captura?");
        String pokemon = sc.nextLine().trim().toLowerCase();

        char primeraLetra = pokemon.charAt(0);
        int primerCaracter = (primeraLetra - 'a' + 1) * 2;

        int sumaResto = 0;
        for (int i = 1; i < pokemon.length(); i++){
            sumaResto += (pokemon.charAt(i) - 'a' + 1);
        }
        int mediaResto = pokemon.length() > 1 ? sumaResto / (pokemon.length() - 1) : 0;

        int probabilidad = primerCaracter + mediaResto;
        System.out.println("La probabilidad de captura a " + pokemon + " es del " + probabilidad + "%");

    }
}

import java.util.Scanner;

public class M3_UF1_A02_10 {

    public static void main(String[] args) {
        
        double cuotaFija = 6.0;
        double precioFinal = cuotaFija;
        double litrosGastados;
        
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Introduce la cantidad de litros gastados: ");
        litrosGastados = input.nextDouble();

        
        if (litrosGastados > 200) {
            precioFinal += (litrosGastados - 200) * 0.3; 
            precioFinal += 150 * 0.1; 
        } else if (litrosGastados > 50) {
            precioFinal += (litrosGastados - 50) * 0.1; 
        } 

        
        System.out.println("El gasto total es: " + precioFinal + " €");

        
        input.close();
    }
}

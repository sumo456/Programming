package Programming.Java.Matrices_Bidimensional;

public class M3_UF1_A04_05 {
    public static void main(String[] args) {
        int matriz [][] = new int [5][5];

        for (int n = 0; n < matriz.length; n++){
            for (int m = 0; m < matriz[n].length; m++){
                matriz[n][m] = n * m;
                System.out.print(matriz[n][m] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nEl darrer element està a la posició: [" + (matriz.length - 1) + "][" + (matriz[0].length - 1) + "]");
    }
}

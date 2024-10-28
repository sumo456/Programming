package Programming.Java.Matrices_Bidimensional;

public class M3_UF1_A04_04 {
    public static void main(String[] args) {

        int matriz [][] = new int [5][8];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nEl darrer element està a la posició: [" + (matriz.length - 1) + "][" + (matriz[0].length - 1) + "]");
    }
}

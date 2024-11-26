package Programming.Java.Proyecto_array;

import java.util.Scanner;

public class conecta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones del tablero
        System.out.println("Introduce el número de filas del tablero: ");
        int rows = scanner.nextInt();
        System.out.println("Introduce el número de columnas del tablero: ");
        int cols = scanner.nextInt();

        char[][] board = new char[rows][cols];
        char EMPTY = ' '; // Para empezar con los valores de la tabla vacios
        boolean gameOn = true;
        int cuerrentPlayer = 1;
        boolean winnerFound = false;

        // Inicilizamos el tablero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                board[i][j] = EMPTY;
            }
        }

        // Bucle principal del juego

    }
}

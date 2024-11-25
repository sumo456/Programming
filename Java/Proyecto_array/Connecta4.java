package Programming.Java.Proyecto_array;


import java.util.Scanner;

public class Connecta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Configuración del tablero
        System.out.println("Introduce el número de filas del tablero:");
        int rows = scanner.nextInt();
        System.out.println("Introduce el número de columnas del tablero:");
        int cols = scanner.nextInt();

        char[][] board = new char[rows][cols];
        char EMPTY = ' ';
        boolean gameOn = true;
        int currentPlayer = 1;
        boolean winnerFound = false;

        // Inicialización del tablero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = EMPTY;
            }
        }

        while (gameOn) {
            // Mostrar tablero
            for (int i = rows - 1; i >= 0; i--) {
                System.out.print((i + 1) + " | ");
                for (int j = 0; j < cols; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.print("    ");
            for (int j = 0; j < cols; j++) {
                System.out.print((j + 1) + "   ");
            }
            System.out.println("\n");

            // Turno del jugador
            System.out.println("Turno del jugador " + currentPlayer + ". Introduce la columna (1-" + cols + "):");
            int column = scanner.nextInt() - 1;

            while (column < 0 || column >= cols || board[rows - 1][column] != EMPTY) {
                System.out.println("Columna no válida o llena. Inténtalo de nuevo:");
                column = scanner.nextInt() - 1;
            }

            // Insertar ficha en la columna
            for (int i = 0; i < rows; i++) {
                if (board[i][column] == EMPTY) {
                    board[i][column] = (currentPlayer == 1) ? 'X' : 'O';
                    break;
                }
            }

            // Comprobar victoria
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] != EMPTY) {
                        char player = board[i][j];

                        // Comprobar horizontal
                        if (j <= cols - 4 && board[i][j + 1] == player && board[i][j + 2] == player && board[i][j + 3] == player) {
                            winnerFound = true;
                        }
                        // Comprobar vertical
                        if (i <= rows - 4 && board[i + 1][j] == player && board[i + 2][j] == player && board[i + 3][j] == player) {
                            winnerFound = true;
                        }
                        // Comprobar diagonal descendente
                        if (i <= rows - 4 && j <= cols - 4 && board[i + 1][j + 1] == player && board[i + 2][j + 2] == player && board[i + 3][j + 3] == player) {
                            winnerFound = true;
                        }
                        // Comprobar diagonal ascendente
                        if (i >= 3 && j <= cols - 4 && board[i - 1][j + 1] == player && board[i - 2][j + 2] == player && board[i - 3][j + 3] == player) {
                            winnerFound = true;
                        }
                    }
                }
            }

            if (winnerFound) {
                System.out.println("¡El jugador " + currentPlayer + " ha ganado!");
                gameOn = false;
            } else {
                boolean full = true;
                for (int j = 0; j < cols; j++) {
                    if (board[rows - 1][j] == EMPTY) {
                        full = false;
                        break;
                    }
                }
                if (full) {
                    System.out.println("¡Empate! El tablero está lleno.");
                    gameOn = false;
                }
            }

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        scanner.close();
    }
}

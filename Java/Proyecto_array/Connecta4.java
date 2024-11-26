package Programming.Java.Proyecto_array;

import java.util.Scanner;

public class Connecta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario las dimensiones del tablero
        System.out.println("Introduce el número de filas del tablero:");
        int rows = scanner.nextInt();
        System.out.println("Introduce el número de columnas del tablero:");
        int cols = scanner.nextInt();

        char[][] board = new char[rows][cols];
        char EMPTY = ' ';
        boolean gameOn = true;
        int currentPlayer = 1;
        boolean winnerFound = false;

        // Inicializamos el tablero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = EMPTY;
            }
        }

        // Bucle principal del juego
        while (gameOn) {
            // Imprimir el tablero
            System.out.print("   "); // Espacio inicial para alinear con los números de las filas
            for (int i = 0; i < cols; i++) {
                System.out.print("----"); // Línea horizontal con un espacio adicional
            }
            System.out.println();

            for (int i = rows - 1; i >= 0; i--) { // De abajo hacia arriba
                System.out.print((i + 1) + " |"); // Número de la fila con margen a la izquierda
                for (int j = 0; j < cols; j++) {
                    System.out.print(" " + board[i][j] + " |"); // Contenido de la celda con separadores verticales
                }
                System.out.println();

                // Línea separadora entre filas
                System.out.print("   "); // Espacio inicial para alinear
                for (int j = 0; j < cols; j++) {
                    System.out.print("----"); // Línea horizontal entre filas
                }
                System.out.println();
            }

            // Números de las columnas al final
            System.out.print("    "); // Espacio inicial para alinearse con las celdas
            for (int j = 0; j < cols; j++) {
                System.out.print((j + 1) + "   "); // Números con espacio para alinearse con las celdas
            }
            System.out.println();


            // Solicitar movimiento al jugador
            System.out.println("Turno del jugador " + currentPlayer + ". Introduce la columna (1-" + cols + "):");
            int column = scanner.nextInt() - 1;

            // Validar la entrada del jugador
            while (column < 0 || column >= cols || board[rows - 1][column] != EMPTY) {
                System.out.println("Columna no válida o llena. Inténtalo de nuevo:");
                column = scanner.nextInt() - 1;
            }

            // Insertar ficha en la columna seleccionada
            for (int i = 0; i < rows; i++) {
                if (board[i][column] == EMPTY) {
                    board[i][column] = (currentPlayer == 1) ? 'X' : 'O';
                    break;
                }
            }

            // Comprobar si hay un ganador
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] != EMPTY) {
                        char player = board[i][j];

                        // Horizontal
                        if (j <= cols - 4 && board[i][j + 1] == player && board[i][j + 2] == player && board[i][j + 3] == player) {
                            winnerFound = true;
                        }
                        // Vertical
                        if (i <= rows - 4 && board[i + 1][j] == player && board[i + 2][j] == player && board[i + 3][j] == player) {
                            winnerFound = true;
                        }
                        // Diagonal descendente
                        if (i <= rows - 4 && j <= cols - 4 && board[i + 1][j + 1] == player && board[i + 2][j + 2] == player && board[i + 3][j + 3] == player) {
                            winnerFound = true;
                        }
                        // Diagonal ascendente
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
                // Comprobar si el tablero está lleno
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

            // Cambiar de turno
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        scanner.close();
    }
}

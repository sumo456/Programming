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
        while(gameOn){
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
        }

                        // Línea separadora entre filas
                        System.out.print("   "); // Espacio inicial para alinear
                        for (int j = 0; j < cols; j++) {
                            System.out.print("----"); // Línea horizontal entre filas
                        }
                        System.out.println();
            // Números de las columnas al final
            System.out.print("    "); // Espacio inicial para alinearse con las celdas
            for (int j = 0; j < cols; j++) {
                System.out.print((j + 1) + "   "); // Números con espacio para alinearse con las celdas
            }
            System.out.println();


        }
    }
}

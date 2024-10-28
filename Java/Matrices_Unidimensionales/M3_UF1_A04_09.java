package Programming.Java.Programación_Estructurada;

import java.util.Scanner;

public class M3_UF1_A04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        //Leer 10 números enteros
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }


        //Leer el numero N a buscar
        System.out.print("Introduce el numero a buscar: ");
        int n = sc.nextInt();


        //Buscar el numero en el vector
        boolean encontrado = false;
        int posicion = -1;// Inicializamos con -1 para indicar que no se ha encontrado
        
        
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == n){
                encontrado = true;
                posicion = i; //Guardar posicion
                break;//salimos del bucle cuando encontramos el numero
            }
        }


        //Mostrar resultados
        if(encontrado){
            System.out.println("El numero " + n + " se encuentra en la posicion" + posicion);
        } else {
            System.out.println("El número " + n + " no se encuentra en el vector.");
        }
        sc.close();//cerrar el scanner para evitar fugas de recursos
    }
}
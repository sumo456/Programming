package Programming.Java.Repaso;

import java.util.Scanner;

/**
*
* @author DanielSalvador
*/

public class repaso {
    public boolean validarNumeroPositivo(int numero){
        return numero > 0;
    }
    public boolean validarEscudoReg(int escudo_reg){
        return escudo_reg <= 50;
    }
    public boolean validarVidaEscudo(int numero){
        return numero <= 100;
    }
    public boolean validarSeleccion(int seleccion){
        return seleccion >= 1 && seleccion <= 5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repaso validacion = new repaso();
        int vidainicial = 100;
        int vida = 0;
        int escudo = 0;
        int escudo_reg = 0;
    // Validar "vida"
        do {
            System.out.print("Quanta vida tens? ");
            vida = sc.nextInt();
            if (!validacion.validarNumeroPositivo(vida)) {
                System.out.println("La vida debe ser un número positivo.");
            }
            if (!validacion.validarVidaEscudo(vida)) {
                System.out.println("La vida no puede ser superior a 100!");
            }
        } while (!validacion.validarNumeroPositivo(vida) || (!validacion.validarVidaEscudo(vida)));
    // Validar "escudo"
        do {
            System.out.print("Quant escut tens? ");
            escudo = sc.nextInt();
            if (!validacion.validarNumeroPositivo(escudo)) {
                System.out.println("El escudo debe ser un número positivo.");
            }
            if (!validacion.validarVidaEscudo(escudo)) {
                System.out.println("La vida no puede ser superior a 100!");
            }
        } while (!validacion.validarNumeroPositivo(escudo) || (!validacion.validarVidaEscudo(escudo)));
    // Validar "escudo_reg"
        do {
            System.out.print("Quant escut regeneratiu tens? ");
            escudo_reg = sc.nextInt();
            if (!validacion.validarNumeroPositivo(escudo_reg)) {
                System.out.println("El escudo regenerativo debe ser un número positivo");
            } else if (!validacion.validarEscudoReg(escudo_reg)) {
                System.out.println("El escudo regenerativo no puede ser mayor a 50.");
            }
        } while (!validacion.validarNumeroPositivo(escudo_reg) || !validacion.validarEscudoReg(escudo_reg));

        int accion = 0;
        do {
            System.out.print("1 - Rebre mal d'atac. \n2 - Utilizar 'botiquin'. \n3 - Beure poció petita. \n4 - Beure poció gran. \n5 - Rebre mal de caiguda.\n");
            accion = sc.nextInt();
            if (!validacion.validarSeleccion(accion)) {
                System.out.println("Escoge un número entre 1 y 5");
            } else if (accion == 1 || accion == 5){
                System.out.println("Cuantos puntos de daño he recibido? ");
                int daño = sc.nextInt();
                System.out.println("Tu vida actual es de " + (vida - daño) + "\n ");
            }
    } while (!validacion.validarSeleccion(accion));




    }
}

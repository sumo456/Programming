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
        int dano = 0;
        int danoRestante = dano;
        do {
            System.out.print("1 - Rebre mal d'atac. \n2 - Utilizar 'botiquin'. \n3 - Beure poció petita. \n4 - Beure poció gran. \n5 - Rebre mal de caiguda.\n");
            accion = sc.nextInt();
            if (!validacion.validarSeleccion(accion)) {
                System.out.println("Escoge un número entre 1 y 5");
            } else if (accion == 1 ){
                System.out.println("Cuantos puntos de daño has recibido? ");
                dano = sc.nextInt();
                danoRestante = dano;

                if (escudo_reg > 0) { 
                    if (escudo_reg >= danoRestante){
                        escudo_reg -= danoRestante;
                        danoRestante = 0;
                    } else {// Si el daño restante es menor o igual al del escudo el escudo se queda a 0
                        danoRestante -= escudo_reg;  // danoRestante -= escudo_reg | resta el valor de escudo_reg
                        escudo_reg = 0;
                    }
                }
                if (danoRestante > 0 && escudo > 0) {
                    if (escudo >= danoRestante) {
                        escudo -= danoRestante;
                        danoRestante = 0;
                    } else {
                        danoRestante -= escudo;
                        escudo = 0;
                    }
                }
                if (danoRestante > 0 && vida > 0 ) {
                    vida -= danoRestante;
                    if (vida < 0) {
                        vida = 0;
                    }
                    if (vida == 0) {
                        System.out.println("Has muerto. No te queda vida");
                    }
                }
                System.out.println("Tu escudo actual regenerativo es de " + escudo_reg + ", tu escudo actual es de " + escudo + ", tu vida actual es de " + vida);
            } else if (accion == 5){
                System.out.println("Cuantos puntos de daño has recibido? ");
                int danoCaida = sc.nextInt();
                if (danoCaida >= vida){
                    vida = 0;
                    System.out.println("Has muerto");
                } else {
                    vida -= danoCaida;
                    System.out.println("Tu escudo actual regenerativo es de " + escudo_reg + ", tu escudo actual es de " + escudo + ", tu vida actual es de " + vida);
                }
            } else {
                System.out.println("No se aplicó daño");
            }
    } while (!validacion.validarSeleccion(accion));
    }
}

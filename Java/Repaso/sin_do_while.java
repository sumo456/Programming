package Programming.Java.Repaso;

import java.util.Scanner;

/**
 *
 * @author DanielSalvador
 */

public class sin_do_while {
    public boolean validarNumeroPositivo(int numero) {
        return numero > 0;
    }

    public boolean validarEscudoReg(int escudo_reg) {
        return escudo_reg <= 50;
    }

    public boolean validarVidaEscudo(int numero) {
        return numero <= 100;
    }

    public boolean validarSeleccion(int seleccion) {
        return seleccion >= 0 && seleccion <= 5; // Permitir también la opción 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repaso validacion = new repaso();
        int vida = 75;  // Inicialización según el ejemplo
        int escudo = 30;  // Escudo inicial
        int escudo_reg = 20;  // Escudo regenerativo inicial

        int accion = 0;
        int dano = 0;
        int danoRestante = 0;

        // El ciclo continúa mientras la vida sea mayor que 0 o hasta que el usuario seleccione la opción 0
        do {
            // Mostrar las opciones al usuario
            System.out.print("\n0 - Acabar partida. \n1 - Rebre mal d'atac. \n2 - Utilizar 'botiquin'. \n3 - Beure poció petita. \n4 - Beure poció gran. \n5 - Rebre mal de caiguda.\n");
            accion = sc.nextInt();

            if (!validacion.validarSeleccion(accion)) {
                System.out.println("Escoge un número entre 0 y 5");
            } else if (accion == 0) {  // Opción para acabar la partida
                System.out.println("Partida finalizada.");
                break;

            } else if (accion == 1) {  // Rebre mal d'atac
                System.out.println("Cuants punts de dany has rebut? ");
                dano = sc.nextInt();
                danoRestante = dano;

                // Daño primero al escudo regenerativo (B)
                if (escudo_reg > 0) {
                    if (escudo_reg >= danoRestante) {
                        escudo_reg -= danoRestante;
                        danoRestante = 0;
                    } else {
                        danoRestante -= escudo_reg;
                        escudo_reg = 0;
                    }
                }

                // Luego al escudo (A)
                if (danoRestante > 0 && escudo > 0) {
                    if (escudo >= danoRestante) {
                        escudo -= danoRestante;
                        danoRestante = 0;
                    } else {
                        danoRestante -= escudo;
                        escudo = 0;
                    }
                }

                // Finalmente a la vida
                if (danoRestante > 0 && vida > 0) {
                    vida -= danoRestante;
                    if (vida < 0) {
                        vida = 0;
                    }
                    if (vida == 0) {
                        System.out.println("You Died!");
                    }
                }
                
                // Mostrar el estado actual
                System.out.println("Vida: " + vida + "/100, Escut: " + escudo + "/100, Escut regeneratiu: " + escudo_reg + "/50");

            } else if (accion == 2) {  // Utilitzar "botiquín"
                vida = 100;
                System.out.println("Has utilitzat el botiquín. Vida restaurada a 100.");
                System.out.println("Vida: " + vida + "/100, Escut: " + escudo + "/100, Escut regeneratiu: " + escudo_reg + "/50");

            } else if (accion == 3) {  // Beure poció petita
                if (escudo < 50) {
                    if (escudo + 25 > 50) {
                        escudo = 50;
                    } else {
                        escudo += 25;
                    }
                    System.out.println("Has begut una poció petita. El teu escut ara és: " + escudo);
                } else {
                    System.out.println("El teu escut ja és de 50 o més.");
                }
                System.out.println("Vida: " + vida + "/100, Escut: " + escudo + "/100, Escut regeneratiu: " + escudo_reg + "/50");

            } else if (accion == 4) {  // Beure poció gran
                escudo += 50;
                if (escudo > 100) {
                    escudo = 100;  // Limitar escut a un máximo de 100
                }
                System.out.println("Has begut una poció gran. El teu escut ara és: " + escudo);
                System.out.println("Vida: " + vida + "/100, Escut: " + escudo + "/100, Escut regeneratiu: " + escudo_reg + "/50");

            } else if (accion == 5) {  // Rebre mal de caiguda (danya directamente la vida)
                System.out.println("Cuants punts de mal de caiguda has rebut? ");
                dano = sc.nextInt();

                if (dano >= vida) {
                    vida = 0;
                    System.out.println("You Died!");
                } else {
                    vida -= dano;
                }
                System.out.println("Vida: " + vida + "/100, Escut: " + escudo + "/100, Escut regeneratiu: " + escudo_reg + "/50");
            }

        } while (vida > 0 || accion != 0);  // El bucle se detiene si el jugador selecciona 0 para acabar la partida

        // Mensaje final si la vida llega a 0
        if (vida == 0) {
            System.out.println("You Died! El joc ha acabat.");
        }
    }
}

/*Ejercicio7 Piedra,papel,tijera,lagarto,spock*/


package David;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int jugador1;
        int jugador2;

        Scanner sc = new Scanner(System.in);

        System.out.println("estas son las Opciones:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("4. Lagarto");
        System.out.println("5. Spock");

        System.out.print("Jugador 1, elige una opción (1-5): ");
        jugador1 = sc.nextInt();

        System.out.print("Jugador 2, elige una opción (1-5): ");
        jugador2 = sc.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else {
            switch (jugador1) {
                case 1:
                    if (jugador2 == 3 || jugador2 == 4) {
                        System.out.println("Jugador 1 gana. Piedra aplasta a las tijeras y al lagarto.");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                    break;
                case 2:
                    if (jugador2 == 1 || jugador2 == 5) {
                        System.out.println("Jugador 1 gana. Papel cubre piedra o desautoriza Spock.");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                    break;
                case 3:
                    if (jugador2 == 2 || jugador2 == 4) {
                        System.out.println("Jugador 1 gana. Tijeras cortan papel o decapitan lagarto.");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                    break;
                case 4:
                    if (jugador2 == 2 || jugador2 == 5) {
                        System.out.println("Jugador 1 gana. Lagarto come papel o envenena Spock.");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                    break;
                case 5:
                    if (jugador2 == 1 || jugador2 == 3) {
                        System.out.println("Jugador 1 gana. Spock rompe tijeras o vaporiza la piedra.");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                    break;
                default:
                    System.out.println("Introduciste una configuracion invalida");
            }
        }
    }
}

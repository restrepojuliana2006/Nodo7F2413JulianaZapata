package src;

import java.util.Scanner;

public class HistoriaInteractiva {
    public static final int PRIMERA_DECISION = 1;
    public static final int SEGUNDA_DECISION = 2;
    public static final int TERCERA_DECISION = 3;
    public static final int CUARTA_DECISION = 4;

    public static void main(String[] args) {
        Heroe heroe = new Heroe("Aragorn");
        Villano villano = new Villano("Sauron");
        Aliado aliado = new Aliado("Legolas");

        System.out.println("¡Bienvenido a la aventura!");

        try (Scanner scanner = new Scanner(System.in)) {
            heroe.interactuar();
            aliado.interactuar();
            villano.interactuar();

            System.out.println("Decide tu camino:");
            System.out.println("1. Enfrentar al villano directamente.");
            System.out.println("2. Buscar al aliado.");
            int decision = scanner.nextInt();

            switch (decision) {
                case PRIMERA_DECISION:
                    System.out.println("Has decidido enfrentar al villano.");
                    if (heroe.getPuntosDeVida() > villano.getPuntosDeVida()) {
                        System.out.println("¡Has derrotado al villano!");
                    } else {
                        System.out.println("El villano te ha vencido. Fin de la historia.");
                        return; 
                    }
                    break;
                case SEGUNDA_DECISION:
                    System.out.println("Has decidido buscar al aliado.");
                    aliado.interactuar();
                    System.out.println("El aliado te ayuda a enfrentarte al villano.");
                    if (heroe.getPuntosDeVida() + aliado.getPuntosDeVida() > villano.getPuntosDeVida()) {
                        System.out.println("¡Con la ayuda del aliado, has derrotado al villano!");
                    } else {
                        System.out.println("El villano te ha vencido. Fin de la historia.");
                        return; 
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Fin de la historia.");
                    return; 
            }

            System.out.println("El villano ha sido derrotado, pero algo más ocurre...");
            System.out.println("1. Investigar el castillo.");
            System.out.println("2. Huir antes de que sea demasiado tarde.");
            decision = scanner.nextInt();

            switch (decision) {
                case PRIMERA_DECISION:
                    System.out.println("Has encontrado un tesoro oculto. ¡Felicidades, héroe!");
                    break;
                case SEGUNDA_DECISION:
                    System.out.println("Huiste en el último momento, pero no obtuviste el tesoro.");
                    break;
                default:
                    System.out.println("Opción no válida. Fin de la historia.");
            }

            System.out.println("Mientras investigas, encuentras una puerta misteriosa.");
            System.out.println("¿Qué haces?");
            System.out.println("1. Abrir la puerta.");
            System.out.println("2. Ignorarla y continuar.");
            decision = scanner.nextInt();

            switch (decision) {
                case PRIMERA_DECISION:
                    System.out.println("Al abrir la puerta, descubres una trampa.");
                    heroe.recibirDanio(30);
                    System.out.println("Te has hecho daño, te quedan " + heroe.getPuntosDeVida() + " puntos de vida.");
                    break;
                case SEGUNDA_DECISION:
                    System.out.println("Decides ignorar la puerta y continuar. ¡Buena elección!");
                    break;
                default:
                    System.out.println("Opción no válida. Fin de la historia.");
            }

            System.out.println("Te encuentras en un cruce de caminos.");
            System.out.println("1. Ir hacia el norte.");
            System.out.println("2. Ir hacia el sur.");
            decision = scanner.nextInt();

            switch (decision) {
                case PRIMERA_DECISION:
                    System.out.println("Te diriges al norte y encuentras un viejo sabio.");
                    System.out.println("1. Preguntar al sabio sobre el futuro.");
                    System.out.println("2. Ignorar al sabio y seguir adelante.");
                    decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("El sabio te da consejos valiosos.");
                    } else {
                        System.out.println("Decidiste ignorar al sabio y seguir tu camino.");
                    }
                    break;
                case SEGUNDA_DECISION:
                    System.out.println("Te diriges al sur y te encuentras con un grupo de bandidos.");
                    System.out.println("1. Luchar contra ellos.");
                    System.out.println("2. Tratar de negociar.");
                    decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("Luchas valientemente, pero pierdes 20 puntos de vida.");
                        heroe.recibirDanio(20);
                        System.out.println("Te quedan " + heroe.getPuntosDeVida() + " puntos de vida.");
                    } else {
                        System.out.println("Logras negociar y evitas la pelea. ¡Bien hecho!");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Fin de la historia.");
            }

            System.out.println("Fin de la aventura.");
        } 
    }
}

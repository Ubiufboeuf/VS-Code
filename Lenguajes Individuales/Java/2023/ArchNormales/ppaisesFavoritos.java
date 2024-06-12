package ArchNormales;

import java.io.IOException;
import java.util.Scanner;

public class ppaisesFavoritos {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner pregunton = new Scanner(System.in);
        int opcion = 100;
        String paisNuevo;
        String[] paises = { "1. Uruguay", "2. España", "3. Canadá", "4. Inglaterra", "5. Alemania", "6. Alaska",
                "7. Islandia", "8. Groenlandia", "9. Chile", "10. Portugal" };

        System.out.println("Elije un número del 1 al 10");

        while (opcion <= 0 || opcion >= 11) {
            opcion = pregunton.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch (opcion) {
                case 1:
                    System.out.println(paises[0]);
                    break;
                case 2:
                    System.out.println(paises[1]);
                    break;
                case 3:
                    System.out.println(paises[2]);
                    break;
                case 4:
                    System.out.println(paises[3]);
                    break;
                case 5:
                    System.out.println(paises[4]);
                    break;
                case 6:
                    System.out.println(paises[5]);
                    break;
                case 7:
                    System.out.println(paises[6]);
                    break;
                case 8:
                    System.out.println(paises[7]);
                    break;
                case 9:
                    System.out.println(paises[8]);
                    break;
                case 10:
                    System.out.println(paises[9]);
                    break;
                default:
                    System.out.println("\"" + opcion + "\" no es una opción valida");
                    System.out.println("Elije entre los números 1 y 2");
                    break;
            }
        }

        System.out.println("Quieres continuar? 1. Si - 2. No");

        while (opcion < 1 || opcion > 2) {
            opcion = pregunton.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    System.out.println("Ok, chau");
                    System.exit(opcion);
                    break;
                default:
                    System.out.println("\"" + opcion + "\" no es una opción valida");
                    System.out.println("Vuelve a elejir un número entre el 1 y el 10");
                    break;
            }
        }

        System.out.println("Qué país de la lista quieres cambiar?");
        System.out.println("Elije un número del 1 al 10");
        opcion = 100;

        while (opcion <= 0 || opcion >= 11) {
            opcion = pregunton.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch (opcion) {
                case 1:
                    System.out.println(paises[0]);
                    break;
                case 2:
                    System.out.println(paises[1]);
                    break;
                case 3:
                    System.out.println(paises[2]);
                    break;
                case 4:
                    System.out.println(paises[3]);
                    break;
                case 5:
                    System.out.println(paises[4]);
                    break;
                case 6:
                    System.out.println(paises[5]);
                    break;
                case 7:
                    System.out.println(paises[6]);
                    break;
                case 8:
                    System.out.println(paises[7]);
                    break;
                case 9:
                    System.out.println(paises[8]);
                    break;
                case 10:
                    System.out.println(paises[9]);
                    break;
                default:
                    System.out.println("Opción invalida");
                    System.out.println("Elije otro número del 1 al 10");
                    break;
            }
        }

        System.out.print("Nombre del país nuevo: ");
        paisNuevo = pregunton.next();
        paises[opcion] = paisNuevo;
        System.out.println("El nuevo país de la lista es \"" + paises[opcion] + "\"");

        pregunton.close();
    }
}
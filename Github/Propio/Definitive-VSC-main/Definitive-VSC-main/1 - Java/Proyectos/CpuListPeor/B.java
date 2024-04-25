package CpuListPeor;

import java.io.IOException;
import java.util.*;

public class B {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Colores
        String color_black = "\033[30m";
        String color_red = "\033[31m";
        String color_green = "\033[32m";
        String color_yellow = "\033[33m";
        String color_blue = "\033[34m";
        String color_purple = "\033[35m";
        String color_cyan = "\033[36m";
        String color_white = "\033[37m";
        String color_reset = "\u001B[0m";

        Scanner scStr = new Scanner(System.in);
        String Rstr = new String();
        String RintelFam;
        String RintelOp;
        boolean bucle = true;
        boolean bucle2 = true;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(color_green + "                    - Lista de procesadores -");
        System.out.println(
                "                       Elije, " + color_blue + "Intel " + color_green + "o " + color_red + "AMD");
        System.out.println(color_black + "                    (Elige bien tus opciones)" + color_reset);

        while (bucle == true) {
            System.out.println();
            System.out.println();
            System.out.print("Marca: ");
            Rstr = scStr.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            switch (Rstr.toLowerCase()) {
                case "intel":
                    bucle = false;
                    System.out.println(color_green + "Elejiste " + color_blue + "Intel" + color_green
                            + ". Ahora elije una familia de procesadores (o FdP):" + color_reset);

                    while (bucle2) {
                        System.out.println(color_blue + "Xeon platinum " + color_green + "- " + color_blue + "Xeon "
                                + color_green + "- " + color_blue + "Core " + color_green + "- \"" + color_blue
                                + "Inside"
                                + color_green + "\" - " + color_blue + "Atom"
                                + color_reset);

                        System.out.println();
                        System.out.println();
                        System.out.print("FdP: ");
                        RintelFam = scStr.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        switch (RintelFam.toLowerCase()) {
                            case "xeon platinum":
                                bucle2 = false;
                                System.out.println("Elejiste " + RintelFam);
                                break;

                            case "xeon":
                                bucle2 = false;
                                System.out.println("Elejiste " + RintelFam);
                                break;

                            case "core":
                                bucle2 = false;
                                System.out.println(color_green + "¿Cómo quieres buscar los procesadores " + color_blue
                                        + "Intel Core?"
                                        + color_green);
                                System.out.println("Generación - Serie " + color_blue + "i " + color_green + "- SKU"
                                        + color_reset);
                                RintelOp = scStr.nextLine();
                                switch (RintelOp.toLowerCase()) {
                                    case "generación":
                                    case "generacion":
                                    case "gen":
                                        System.out.println("Ok, será por generación");
                                        break;

                                    case "serie i":
                                    case "i":
                                    case "serie":

                                        break;

                                    case "sku":

                                        break;

                                    default:
                                        System.out.println("Opción inválida");
                                        break;
                                }

                                break;

                            case "inside":
                                bucle2 = false;
                                System.out.println("Elejiste " + RintelFam);
                                break;

                            case "atom":
                                bucle2 = false;
                                System.out.println("Elejiste " + RintelFam);
                                break;

                            default:
                                bucle2 = true;
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println(
                                        color_yellow + "Opción inválida. " + color_green + "Elije una FdP:"
                                                + color_reset);
                                break;
                        }
                    }
                    break;

                case "amd":
                    bucle = false;
                    System.out.println("Elejiste " + color_red + "AMD" + color_reset);
                    break;

                default:
                    System.out.println(color_yellow +
                            "Esa opción no es válida. " + color_green + "Elije entre " + color_blue + "Intel "
                            + color_green + "o "
                            + color_red
                            + "AMD" + color_reset);
                    break;
            }
        }
        System.out.println("aaa");

    }
}
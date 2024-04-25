package CpuList.src;
import java.io.IOException;
import java.util.*;
import java.awt.*;

public class Front {

    public static void main(String[] args) throws InterruptedException, IOException {
        Back back = new Back();
        Colores color = new Colores();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("                - Lista de procesadores -");
        while (back.bucle == true) {
            System.out.println("                     Elije una marca");
            System.out.println();
            System.out.println(color.cyan + "Intel" + color.reset);
            System.out.println(color.red + "\u2022  AMD" + color.reset);
            System.out.println(color.green + "\u2022  NVidia" + color.reset);
            System.out.println(color.blue + "\u2022  Qualcomm" + color.reset);
            System.out.println(color.red + "\u2022  tsmc" + color.reset);
            System.out.println("\u2022  SAMSUNG" + color.reset);
            System.out.println();
            System.out.println();
            System.out.print("Marca: ");
            back.marca = back.sc.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch (back.marca.toLowerCase()) {
                case "intel":
                    back.bucle = false;
                    System.out.println(color.cyan + "Intel" + color.reset);
                    while (back.bucle2 == true) {
                        System.out.println("                Elije una familia de procesadores");
                        System.out.println();
                        System.out.println(color.cyan + "\u25e6  Xeon Platinum");
                        System.out.println("\u25e6  Xeon");
                        System.out.println("\u25e6  Core");
                        System.out.println("\u25e6  Atom");
                        System.out.println("\u25e6  Evo");
                        System.out.println("\u25e6  Core vPro");
                        System.out.println("\u25e6  Pentium");
                        System.out.println("\u25e6  Celeron" + color.reset);
                        System.out.println();
                        System.out.print("Opción: ");
                        back.Ifam = back.sc.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        switch (back.Ifam.toLowerCase()) {
                            case "core":
                                back.bucle2 = false;
                                System.out.println(color.cyan + "Core" + color.reset);
                                while (back.bucle3 == true) {
                                    System.out.println("                Elije una serie de procesadores");
                                    System.out.println();
                                    System.out.println(color.cyan + "\u25e6  i9");
                                    System.out.println("\u25e6  i7");
                                    System.out.println("\u25e6  i5");
                                    System.out.println("\u25e6  i3" + color.reset);
                                    System.out.println(color.black + "X" + color.reset);
                                    System.out.println();
                                    System.out.print("Serie: ");
                                    back.Iser = back.sc.nextLine();
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    switch (back.Iser.toLowerCase()) {
                                        case "i9":
                                            back.bucle3 = false;
                                            System.out.println(color.cyan + "i9" + color.reset);
                                            System.out.println();
                                            System.out.println(
                                                    "        Nombre de producto        |   Fecha de    |   Cantidad    |   Frecuencia    |  Intel®            |   Gráficos del");
                                            System.out.println(
                                                    "                                  |   lanzamiento |   de núcleos  |   turbo máxima  |  Smart Caché       |   procesador");
                                            System.out.println(
                                                    "----------------------------------|---------------|---------------|-----------------|--------------------|--------------------------");
                                            for (int i = 0; i < back.ICi9Name0.length; i++) {
                                                System.out.print(back.ICi9Name0[i] + " |   ");
                                                System.out.print(back.ICi9Fecha[i] + "   ");
                                                System.out.print(back.ICi9Core0[i] + "   ");
                                                System.out.print(back.ICi9GHz00[i] + "   ");
                                                System.out.print(back.ICi9Cache[i] + "   ");
                                                System.out.print(back.ICi9GPU00[i] + "   ");
                                                System.out.println();
                                            }
                                            break;

                                        default:
                                            System.out.println(color.cyan + "Core" + color.yellow
                                                    + "            -    Opción inválida"
                                                    + color.reset);
                                            break;
                                    }
                                }
                                break;

                            default:
                                System.out
                                        .println(color.cyan + "Intel" + color.yellow + "           -    Opción inválida"
                                                + color.reset);
                                break;
                        }
                    }
                    break;
                case "amd":
                    back.bucle = false;
                    System.out.println("amd");
                    break;

                case "nvidia":
                    back.bucle = false;
                    System.out.println("nvidia");
                    break;

                case "qualcomm":
                    back.bucle = false;
                    System.out.println("qualcomm");
                    break;

                case "tsmc":
                    back.bucle = false;
                    System.out.println("tsmc");
                    break;

                case "samsung":
                    back.bucle = false;
                    System.out.println("samsung");
                    break;

                default:
                    System.out
                            .println(color.yellow + "Opción inválida " + color.reset + "- Lista de procesadores -");
                    break;
            }
        }

        back.cmdNoEnd = back.sc.nextLine();

    }
}
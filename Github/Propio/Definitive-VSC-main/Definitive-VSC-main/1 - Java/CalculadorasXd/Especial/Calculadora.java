package CalculadorasXd.Especial;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws InterruptedException, IOException {

        // Importación de variables y colores, y creación de Scanner's
        // ----------------------------
        Variables variables = new Variables();
        Colores color = new Colores();
        Scanner str = new Scanner(System.in);
        Scanner intt = new Scanner(System.in);
        Scanner floatt = new Scanner(System.in);

        // Calculadora
        // ----------------------------------------------------------------------------
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // Comienzo y carga
        // -----------------------------------------------------------------------
        System.out
                .println(color.reset
                        + "                                                                            ---------------");
        System.out
                .println("                                                                            | Calculadora |");
        System.out.println(
                "                                                                            --------------- \n");
        Thread.sleep(1000);
        System.out.print("Cargando");
        for (int ii = 0; ii < 3; ii++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        Thread.sleep(1000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out
                .println("                                                                            ---------------");
        System.out
                .println("                                                                            | Calculadora |");
        System.out.println(
                "                                                                            --------------- \n");
        System.out.print("Cargando");
        for (int ii = 0; ii < 2; ii++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("\n\n");
        Thread.sleep(500);
        for (int x = 0; x < 100; x++) {
            String data = "\r" + variables.anim.charAt(x % variables.anim.length()) + " " + x + "%";
            System.out.write(data.getBytes());
            Thread.sleep(30);
        }

        // Inicio
        // ---------------------------------------------------------------------------------
        while (variables.inicio == true) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out
                    .println(
                            "\n                                                                              - Inicio - \n");
            System.out.println(
                    color.yellow
                            + "                                                   (Escribe \"Inicio\" en cualquier lugar para volver a este punto)");
            System.out.println(
                    "                                                             (Escribe \"Salir\" aquí para volver al \"Menú\") \n\n"
                            + color.reset);
            System.out.println("Elije una de las siguientes opciones: \n");
            for (int i = 0; i < variables.operadores.length; i++) {
                System.out.println("    \u2022 " + variables.operadores[i]);
            }

            System.out.print("\nOpción: ");
            variables.opcion = str.nextLine();

            switch (variables.opcion.toLowerCase()) {
                case "suma":
                case "+":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                               - Suma - \n");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 2");
                        System.out.println("   \u2022 3");
                        System.out.println("   \u2022 4");
                        System.out.println("   \u2022 5 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "2":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) + (b) = (c). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = " + (variables.aa + variables.bb));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "3":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) + (b) + (c) = (d). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = " + (variables.aa + variables.bb + variables.cc));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "4":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) + (b) + (c) + (d) = (e). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print(
                                            "e = " + (variables.aa + variables.bb + variables.cc + variables.dd));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "5":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) + (b) + (c) + (d) + (e) = (f). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print("e = ");
                                    variables.ee = floatt.nextFloat();
                                    System.out.print("f = "
                                            + (variables.aa + variables.bb + variables.cc + variables.dd
                                                    + variables.ee));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "resta":
                case "-":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                              - Resta - \n");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 2");
                        System.out.println("   \u2022 3");
                        System.out.println("   \u2022 4");
                        System.out.println("   \u2022 5 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "2":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) - (b) = (c). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = " + (variables.aa - variables.bb));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "3":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) - (b) - (c) = (d). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = " + (variables.aa - variables.bb - variables.cc));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "4":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) - (b) - (c) - (d) = (e). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print(
                                            "e = " + (variables.aa - variables.bb - variables.cc - variables.dd));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "5":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) - (b) - (c) - (d) - (e) = (f). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print("e = ");
                                    variables.ee = floatt.nextFloat();
                                    System.out.print("f = "
                                            + (variables.aa - variables.bb - variables.cc - variables.dd
                                                    - variables.ee));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "mult":
                case "*":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                            - Multiplicación - \n");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 2");
                        System.out.println("   \u2022 3");
                        System.out.println("   \u2022 4");
                        System.out.println("   \u2022 5 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "2":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) * (b) = (c). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = " + (variables.aa * variables.bb));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "3":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) * (b) * (c) = (d). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = " + (variables.aa * variables.bb * variables.cc));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "4":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) * (b) * (c) * (d) = (e). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print(
                                            "e = " + (variables.aa * variables.bb * variables.cc * variables.dd));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "5":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) * (b) * (c) * (d) * (e) = (f). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print("e = ");
                                    variables.ee = floatt.nextFloat();
                                    System.out.print("f = "
                                            + (variables.aa * variables.bb * variables.cc * variables.dd
                                                    - variables.ee));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "div":
                case "/":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                             - Division - \n");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 2");
                        System.out.println("   \u2022 3");
                        System.out.println("   \u2022 4");
                        System.out.println("   \u2022 5 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "2":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) / (b) = (c). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = " + (variables.aa / variables.bb));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "3":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) / (b) / (c) = (d). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = " + (variables.aa / variables.bb / variables.cc));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "4":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) / (b) / (c) / (d) = (e). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print(
                                            "e = " + (variables.aa / variables.bb / variables.cc / variables.dd));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                case "5":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) / (b) / (c) / (d) / (e) = (f). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = ");
                                    variables.cc = floatt.nextFloat();
                                    System.out.print("d = ");
                                    variables.dd = floatt.nextFloat();
                                    System.out.print("e = ");
                                    variables.ee = floatt.nextFloat();
                                    System.out.print("f = "
                                            + (variables.aa / variables.bb / variables.cc / variables.dd
                                                    / variables.ee));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "pot":
                case "^":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                             - Potencia - \n");
                        System.out.println("Es posible que el resultado salga como notación científica.");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 2 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "2":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: (a) ^ (b) = (c). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = ");
                                    variables.bb = floatt.nextFloat();
                                    System.out.print("c = " + (Math.pow(variables.aa, variables.bb)));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "raiz":
                case "0.x":
                    variables.suma = true;
                    while (variables.suma == true) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println(
                                "\n                                                                             - Raíz - \n");
                        System.out.println("Elije la cantidad de números que tendrá la operación: \n");
                        System.out.println("   \u2022 1 \n");
                        System.out.print("Opción: ");
                        variables.cantVars = str.nextLine();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        if (!variables.cantVars.toLowerCase().equals("inicio")) {

                            switch (variables.cantVars) {
                                case "1":
                                    System.out.println(
                                            "La operación se realizará de la siguiente forma: sqrt(a) = (b). \n");
                                    System.out.print("a = ");
                                    variables.aa = floatt.nextFloat();
                                    System.out.print("b = " + (Math.sqrt(variables.aa)));
                                    System.out.println("\n\n¿Quieres volver al Inicio o hacer otra Suma?");
                                    System.out.println("   \u2022 Inicio");
                                    System.out.println("   \u2022 Suma");
                                    System.out.print("\nOpción: ");
                                    variables.pregVolver = str.nextLine();

                                    if (variables.pregVolver.toLowerCase().equals("inicio")) {
                                        variables.inicio = true;
                                        variables.suma = false;
                                    } else {
                                        variables.suma = true;
                                    }
                                    break;
                            }
                        } else {
                            variables.inicio = true;
                            variables.suma = false;
                        }
                    }
                    break;

                case "info":
                    variables.inicio = false;
                    variables.suma = false;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("¿Sobre qué quieres saber? \n");
                    for (int i = 0; i < variables.info.length; i++) {
                        System.out.println("    \u2022 " + variables.info[i]);
                    }
                    System.out.print("\nOpción: ");
                    variables.opInfo = str.nextLine();

                    switch (variables.opInfo.toLowerCase()) {
                        case "dev":
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            System.out.println(color.blue + " - Dev - \n" + color.reset);
                            System.out.println(
                                    "Ando medio lento con el desarrollo pero voy intentando, por ahora quiero terminar esta calculadora (me falta este último switch y ya) y después o veo de   hacer un Menú con otras apps o sigo con Unity, con el juego o con el Menú pero con C#.");
                            System.out.println("\nElije una de estas opciones para Salir o para volver al Inicio");
                            variables.whileFinal = 1;
                            while (variables.whileFinal == 1) {
                                System.out.println("\n    \u2022 Salir   |  (salir)");
                                System.out.println("    \u2022 Inicio  |  (inicio)");
                                variables.opcion = null;
                                System.out.print("\nOpción: ");
                                variables.opcion = str.nextLine();

                                if (variables.opcion.toLowerCase().equals("inicio")) {
                                    variables.inicio = true;
                                    variables.whileFinal = 0;
                                }

                                if (variables.opcion.toLowerCase().equals("salir")) {
                                    variables.inicio = false;
                                    variables.whileFinal = 0;
                                } else {
                                    variables.whileFinal = 1;
                                }
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                case "salir":
                    variables.inicio = false;
                    variables.suma = false;
                    break;
                default:
                    break;
            }
        }

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Esto es para que no cierre cmd, haz cualquier cosa y termina el código");
        String Final = str.nextLine();
        System.out.println(Final);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        str.close();
        intt.close();
        floatt.close();
    }
}

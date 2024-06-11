package ArchNormales;

import java.io.IOException;
import java.util.Scanner;

public class PaisesFavoritos {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // Scanner para int
        Scanner sc = new Scanner(System.in);
        // Scanner para String
        Scanner sc2 = new Scanner(System.in);
        // Variable para lugar de la lista
        int res;
        // Variable para el país nuevo de la lista que elija el usuario
        String paisNuevo;
        // Variable por si el usuario quiere cambiar ese pais o elegir otro
        String respuestaString;

        String[] paises = { "1. Uruguay", "2. España", "3. Canadá", "4. Inglaterra", "5. Alemania", "6. Alaska",
                "7. Islandia", "8. Groenlandia", "9. Chile", "10. Portugal" };
        System.out.println("Elije un número del 1 al 10");
        res = sc.nextInt() - 1;
        System.out.println("Hay una lista de 10 paises, tú elegiste \"" + paises[res] + "\"");
        System.out.println("¿Qué país quieres cambiar? (Elige un número del 1 al 10)");
        res = sc.nextInt() - 1;
        System.out.println("Elegiste \"" + paises[res] + "\", ¿quieres cambiar ese pais?");
        respuestaString = sc2.nextLine();

        System.out.print("Ingresa el pais nuevo: ");
        paisNuevo = sc2.nextLine();

        int resx = res + 1;
        System.out.println("El nuevo país de la lista es \"" + paisNuevo + "\", sustituyó a \"" + paises[res] + "\"");
        paises[res] = paisNuevo;

        sc.close();
    }
}
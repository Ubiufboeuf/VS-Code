package Ejercicio3;

import java.io.IOException;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor: ");
        double val = sc.nextDouble();

        System.out.println("El número " + val + " es " + method(val));

        sc.close();
    }

    public static String method(double e) {
        return (e % 2 == 0) ? "par" : "impar";
    }
}

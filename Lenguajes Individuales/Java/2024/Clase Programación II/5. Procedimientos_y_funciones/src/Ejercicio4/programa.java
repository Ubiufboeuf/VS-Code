package Ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double h = sc.nextDouble();

        System.out.println("El área del triángulo es: " + method(b, h));

        sc.close();
    }

    static double method(double b, double h) {
        return ((b * h) / 2);
    }
}

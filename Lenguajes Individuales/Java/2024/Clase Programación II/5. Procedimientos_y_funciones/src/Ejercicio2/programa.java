package Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int a = sc.nextInt();

        System.out.print("Ingrese otro valor: ");
        int b = sc.nextInt();

        method(a, b);

        sc.close();
    }

    public static void method(int a, int b) {
        System.out.println("La multiplicación de " + a + " * " + b + " es " + (a*b));
    }
}

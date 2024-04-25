package Intento1Clase;

import java.io.IOException;
import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce un segundo número: ");
        n2 = sc.nextInt();

        int res = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + res);
    }
}

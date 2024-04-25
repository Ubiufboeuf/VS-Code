package Intento1Clase;

import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        String name1;
        String name2;
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        System.out.print("Introduce un nombre: ");
        name1 = sc.nextLine();
        System.out.print("Introduce un segundo nombre: ");
        name2 = sc.nextLine();

        System.out.println("Hola " + name1);
    }
}

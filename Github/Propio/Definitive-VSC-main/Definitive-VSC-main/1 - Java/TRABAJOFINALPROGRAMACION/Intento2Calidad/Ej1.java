package Intento2Calidad;

import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");

    }
}

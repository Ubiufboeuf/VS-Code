package Ejercicio1;

import java.io.IOException;
import java.util.Scanner;

public class progrma {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un saludo: ");
        String respuesta = sc.nextLine();
        method(respuesta);

        sc.close();
    }

    public static void method(String saludo) {
        System.out.println(saludo);
    }
}

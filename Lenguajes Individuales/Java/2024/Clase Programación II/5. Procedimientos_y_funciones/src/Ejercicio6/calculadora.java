package Ejercicio6;

import java.io.IOException;
import java.util.Scanner;

public class calculadora {
    
    private double num1;
    private double num2;
    
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        calculadora calc = new calculadora();

        Scanner sc = new Scanner(System.in);
        Scanner scOp = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingrese otro valor: ");
        double num2 = sc.nextDouble();

        System.out.println("Elije una opción:");
        System.out.println("    \u2022 Suma");
        System.out.println("    \u2022 Resta");
        String operacion = scOp.nextLine();

        if (operacion.toLowerCase().equals("suma")) {
            System.out.println("El resultado es: " + suma(num1, num2));
        } else {
            System.out.println("El resultado es: " + resta(num1, num2));
        }
    }

    public static double suma(double x, double y) {
        return x + y;
    }

    public static double resta(double x, double y) {
        return x - y;
    }
}

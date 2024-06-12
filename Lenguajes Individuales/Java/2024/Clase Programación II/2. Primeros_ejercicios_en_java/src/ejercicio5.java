/*

Actividad.
Realiza los ejercicios del repartido de repaso en java:

       1) Escribe un algoritmo para:  sumar 5 números ingresados por teclado y muestre el resultado en pantalla.
       2) Escribe un algoritmo para:  leer un número ingresado por teclado y muestre un mensaje diciendo si es mayor a 10.
       3) Escribe un algoritmo para:  leer un número ingresado por teclado y muestre un mensaje diciendo si es positivo o negativo.
       4) Escribe un algoritmo para:  ingresar dos números y muestre cuál es el mayor.
    -> 5) Escribe un algoritmo para:  ingresar tres números y muestre cuál de los tres es el mayor.
       6) Escribe un algoritmo para:  ingresar un monto en pesos uruguayos y lo convierta a dólares.

*/

import java.io.IOException;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 3 valores");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("El valor ingresado más grande es: " + a);
            } else {
                System.out.println("El valor ingresado más grande es: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("El valor ingresado más grande es: " + b);
            } else {
                System.out.println("El valor ingresado más grande es: " + c);
            }
        }

    }
}

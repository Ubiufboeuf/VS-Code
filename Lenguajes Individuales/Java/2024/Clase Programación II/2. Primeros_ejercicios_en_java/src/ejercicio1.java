/*

Actividad.
Realiza los ejercicios del repartido de repaso en java:

    -> 1) Escribe un algoritmo para:  sumar 5 números ingresados por teclado y muestre el resultado en pantalla.
       2) Escribe un algoritmo para:  leer un número ingresado por teclado y muestre un mensaje diciendo si es mayor a 10.
       3) Escribe un algoritmo para:  leer un número ingresado por teclado y muestre un mensaje diciendo si es positivo o negativo.
       4) Escribe un algoritmo para:  ingresar dos números y muestre cuál es el mayor.
       5) Escribe un algoritmo para:  ingresar tres números y muestre cuál de los tres es el mayor.
       6) Escribe un algoritmo para:  ingresar un monto en pesos uruguayos y lo convierta a dólares.

*/

import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        Scanner sc = new Scanner(System.in);

        String a[] = {"", "", "", "", ""};
        int res = 0;
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " (sin decimales) para sumar");
            a[i] = sc.nextLine();
            res += Integer.parseInt(a[i]);
        }

        System.out.println("La suma de esos valores es: " + res);
    }
}
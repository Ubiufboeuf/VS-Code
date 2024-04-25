package Intento1Clase;

import java.io.IOException;
import java.util.*;


public class Ej5 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println(num + " corresponde al día de la semana Lunes");
                break;
            case 2: System.out.println(num + " corresponde al día de la semana Martes");
                break;
            case 3: System.out.println(num + " corresponde al día de la semana Miércoles");
                break;
            case 4: System.out.println(num + " corresponde al día de la semana Jueves");
                break;
            case 5: System.out.println(num + " corresponde al día de la semana Viernes");
                break;
            case 6: System.out.println(num + " corresponde al día de la semana Sabado");
                break;
            case 7: System.out.println(num + " corresponde al día de la semana Domingo");
                break;
            default: System.out.println(num + " no corresponde a ningún día de la semana");
                break;
        }

    }
}
